package cz.zcu.kiv.fjp.compiler.compilers;


import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.Goto;
import cz.zcu.kiv.fjp.compiler.types.statements.*;
import cz.zcu.kiv.fjp.enums.ForType;
import cz.zcu.kiv.fjp.enums.InstructionCode;
import cz.zcu.kiv.fjp.enums.InstructionOperation;
import cz.zcu.kiv.fjp.enums.VariableType;
import cz.zcu.kiv.fjp.instruction.Instruction;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

public class CompilerStatement {

    private AbstractStatement statement;

    public CompilerStatement(AbstractStatement statement) {
        this.statement = statement;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    public void compileStatement() {

        err.setCurrentPart(statement);
        checkIfLabelledAndCompile();

        switch (statement.getStatementType()) {

            case ASSIGNMENT:
                compileAssignmentStatement();
                break;
            case PROCEDURE:
                compileProcedureStatement();
                break;
            case GOTO:
                compileGotoStatement();
                break;
            case TERNARY:
                compileTernaryStatement();
                break;
            case IO:
                compileIOStatement();
                break;
            case COMPOUND:
                compileCompoundStatement();
                break;
            case WHILE_DO:
                compileWhileDoStatement();
                break;
            case DO_WHILE:
                compileDoWhileStatement();
                break;
            case REPEAT:
                compileRepeatStatement();
                break;
            case IF:
                compileIfStatement();
                break;
            case CASE:
                compileCaseStatement();
                break;
            case FOR:
                compileForStatement();
                break;
        }

    }

    private void compileForStatement() {
        StatementFor statementFor = (StatementFor) statement;

        int level = currentLevel;
        int address = currentAddress;

        currentAddress++;

        if (symbolTable.contains(statementFor.getIdentifier())) {
            SymbolTableItem item = symbolTable.getItem(statementFor.getIdentifier());
            if (item.getVariableType() == VariableType.INTEGER) {
                level = item.getLevel();
                address = item.getAddress();

                currentAddress--;

            } else {
                err.throwError("Incompatible types. Can not assign " + VariableType.INTEGER + " to " + item.getVariableType());
            }

        }

        new CompilerExpression(statementFor.getFrom(), VariableType.INTEGER).compileExpression();
        instructionList.add(new Instruction(InstructionCode.STO.getName(), level, address));

        int level2 = currentLevel;
        int address2 = currentAddress;

        currentAddress++;

        new CompilerExpression(statementFor.getTo(), VariableType.INTEGER).compileExpression();
        instructionList.add(new Instruction(InstructionCode.STO.getName(), level2, address2));

        int startIndex = instructionList.size();
        instructionList.add(new Instruction(InstructionCode.LOD.getName(), level, address));
        instructionList.add(new Instruction(InstructionCode.LOD.getName(), level2, address2));

        if (statementFor.getType() == ForType.TO) {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), currentLevel, InstructionOperation.LE.getCode()));
        } else {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), currentLevel, InstructionOperation.GE.getCode()));
        }

        Instruction forJump = new Instruction(InstructionCode.JMC.getName(), currentLevel, 0);
        instructionList.add(forJump);

        new CompilerStatement(statementFor.getStatement()).compileStatement();

        instructionList.add(new Instruction(InstructionCode.LOD.getName(), level, address));
        instructionList.add(new Instruction(InstructionCode.LIT.getName(), currentLevel, 1));
        if (statementFor.getType() == ForType.TO) {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), currentLevel, InstructionOperation.ADD.getCode()));
        } else {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), currentLevel, InstructionOperation.SUB.getCode()));
        }
        instructionList.add(new Instruction(InstructionCode.STO.getName(), level, address));

        instructionList.add(new Instruction(InstructionCode.JMP.getName(), currentLevel, startIndex));

        forJump.setOperand(instructionList.size());

    }

    private void compileCaseStatement() {

    }

    private void compileIfStatement() {

        StatementIf statementIf = (StatementIf) statement;

        new CompilerExpression(statementIf.getCondition(), VariableType.BOOLEAN).compileExpression();

        Instruction ifJump = new Instruction(InstructionCode.JMC.getName(), currentLevel, 0);
        instructionList.add(ifJump);

        new CompilerStatement(statementIf.getStatement()).compileStatement();
        ifJump.setOperand(instructionList.size());

        if (statementIf.getElseStatement() != null) {

            new CompilerStatement(statementIf.getElseStatement()).compileStatement();

        }

    }

    private void compileRepeatStatement() {
        StatementRepeat statementRepeat = (StatementRepeat) statement;

        int startIndex = instructionList.size();

        new CompilerStatement(statementRepeat.getStatement()).compileStatement();

        new CompilerExpression(statementRepeat.getCondition(), VariableType.BOOLEAN).compileExpression();
        instructionList.add(new Instruction(InstructionCode.JMC.getName(), currentLevel, startIndex));

    }

    private void compileDoWhileStatement() {
        StatementDoWhile statementDoWhile = (StatementDoWhile) statement;

        int startIndex = instructionList.size();

        new CompilerStatement(statementDoWhile.getStatement()).compileStatement();

        new CompilerExpression(statementDoWhile.getCondition(), VariableType.BOOLEAN).compileExpression();
        Instruction whileJump = new Instruction(InstructionCode.JMC.getName(), currentLevel, 0);


        instructionList.add(whileJump);
        instructionList.add(new Instruction(InstructionCode.JMP.getName(), currentLevel, startIndex));

        whileJump.setOperand(instructionList.size());

    }

    private void compileWhileDoStatement() {
        StatementWhileDo statementWhileDo = (StatementWhileDo) statement;

        int startIndex = instructionList.size();

        new CompilerExpression(statementWhileDo.getCondition(), VariableType.BOOLEAN).compileExpression();
        Instruction whileJump = new Instruction(InstructionCode.JMC.getName(), currentLevel, 0);
        instructionList.add(whileJump);

        new CompilerStatement(statementWhileDo.getStatement()).compileStatement();

        instructionList.add(new Instruction(InstructionCode.JMP.getName(), currentLevel, startIndex));
        whileJump.setOperand(instructionList.size());

    }

    private void compileCompoundStatement() {
        StatementCompound statementCompound = (StatementCompound) statement;

        for (AbstractStatement abstractStatement : statementCompound.getStatementList()) {

            new CompilerStatement(abstractStatement).compileStatement();

        }
    }

    private void compileIOStatement() {

    }


    private void compileTernaryStatement() {
        StatementTernary statementTernary = (StatementTernary) statement;

        if (symbolTable.contains(statementTernary.getIdentifier())) {

            SymbolTableItem item = symbolTable.getItem(statementTernary.getIdentifier());

            if (checkVariableNotConstant(item.getType())) {

                new CompilerExpression(statementTernary.getExpression(), VariableType.BOOLEAN).compileExpression();
                Instruction ternaryJumpOne = new Instruction(InstructionCode.JMC.getName(), currentLevel, 0);
                instructionList.add(ternaryJumpOne);

                new CompilerExpression(statementTernary.getExpressionOne(), item.getVariableType()).compileExpression();
                Instruction ternaryJumpTwo = new Instruction(InstructionCode.JMP.getName(), currentLevel, 0);
                instructionList.add(ternaryJumpTwo);

                ternaryJumpOne.setOperand(instructionList.size());

                new CompilerExpression(statementTernary.getExpressionTwo(), item.getVariableType()).compileExpression();

                ternaryJumpTwo.setOperand(instructionList.size());

                instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel, item.getAddress()));
                item.setSize(1);


            } else {
                err.throwError("Can not re-assign constant " + item.getName());
            }


        } else {
            err.throwError("Unknown identifier " + statementTernary.getIdentifier());
        }

    }

    private void compileGotoStatement() {
        StatementGoto statementGoto = (StatementGoto) statement;

        String label = String.valueOf(statementGoto.getValue());

        if (symbolTable.contains(label)) {

            SymbolTableItem item = symbolTable.getItem(label);

            if (item.getSize() == 0) {
                // we dont know address of the label
                Instruction ins = new Instruction(InstructionCode.JMP.getName(), currentLevel, 0);
                gotoList.add(new Goto(ins, item.getName()));
                instructionList.add(ins);
            } else {
                instructionList.add(new Instruction(InstructionCode.JMP.getName(), currentLevel, item.getAddress()));
            }


        } else {
            err.throwError("Unknown label " + label);
        }

    }

    private void compileProcedureStatement() {

    }

    private void compileAssignmentStatement() {
        StatementAssignment statementAssignment = (StatementAssignment) statement;

        if (symbolTable.contains(statementAssignment.getIdentifier())) {

            SymbolTableItem item = symbolTable.getItem(statementAssignment.getIdentifier());

            if (checkVariableNotConstant(item.getType())) {

                new CompilerExpression(statementAssignment.getExpression(), item.getVariableType()).compileExpression();
                instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel, item.getAddress()));
                item.setSize(1);

            } else {
                err.throwError("Can not re-assign constant " + item.getName());
            }


        } else {
            err.throwError("Unknown identifier " + statementAssignment.getIdentifier());
        }

    }

    private boolean checkVariableNotConstant(String type) {
        String[] split = type.split("\\s+");
        String declarationType = split[0];

        return declarationType.equalsIgnoreCase("variable");

    }

    private void checkIfLabelledAndCompile() {

        if (statement.isLabelled()) {

            String label = String.valueOf(statement.getLabel().getValue());

            if (symbolTable.contains(label)) {
                SymbolTableItem item = symbolTable.getItem(label);
                if (item.getSize() == 0) {

                    item.setSize(1);
                    item.setAddress(instructionList.size());

                } else {
                    err.throwError("Label " + item.getName() + " already assigned");
                }

            } else {
                err.throwError("Unknown label " + label);
            }

        }

    }

}
