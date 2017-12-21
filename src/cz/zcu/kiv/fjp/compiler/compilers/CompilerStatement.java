package cz.zcu.kiv.fjp.compiler.compilers;


import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.CaseLimb;
import cz.zcu.kiv.fjp.compiler.types.Goto;
import cz.zcu.kiv.fjp.compiler.types.statements.*;
import cz.zcu.kiv.fjp.enums.ForType;
import cz.zcu.kiv.fjp.enums.InstructionCode;
import cz.zcu.kiv.fjp.enums.InstructionOperation;
import cz.zcu.kiv.fjp.enums.VariableType;
import cz.zcu.kiv.fjp.errors.*;
import cz.zcu.kiv.fjp.instruction.Instruction;

import java.util.ArrayList;
import java.util.List;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

/**
 * Statement Compiler
 * Compiles statements into instructions
 */
public class CompilerStatement {

    /**
     * statement to compile
     */
    private AbstractStatement statement;

    /**
     * check if we are in for cycle
     */
    private boolean inForCycle;

    /**
     * @param statement  statement to compile
     * @param inForCycle whether we are in for cycle
     */
    public CompilerStatement(AbstractStatement statement, boolean inForCycle) {
        this.statement = statement;
        this.inForCycle = inForCycle;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    /**
     * method to compile a statement
     * calls other methods depending on the type of statement
     */
    public void compileStatement() {

        // for error handler
        err.setCurrentPart(statement);

        // first check if statement is labelled
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

    /**
     * compiles for statement
     */
    private void compileForStatement() {
        StatementFor statementFor = (StatementFor) statement;

        // we are in for cycle
        inForCycle = true;

        // current level and address where we will store the iteration variable
        int level = currentLevel;
        int address = currentAddress;

        // increase the address
        currentAddress++;

        // watch out for another user defined variable of the same name
        if (checkIfExists(statementFor.getIdentifier())) {
            err.throwError(new ErrorCannotAssignLoopVariable(statementFor.getIdentifier()));
        }

        // compile the from expression
        new CompilerExpression(statementFor.getFrom(), VariableType.INTEGER).compileExpression();

        // save it
        instructionList.add(new Instruction(InstructionCode.STO.getName(), level, address));

        // preparation for the second iteration variable
        int level2 = 0;
        int address2 = currentAddress;

        // increase the address
        currentAddress++;

        // compile the to expression
        new CompilerExpression(statementFor.getTo(), VariableType.INTEGER).compileExpression();

        // store it
        instructionList.add(new Instruction(InstructionCode.STO.getName(), level2, address2));

        // here is the start of for cycle
        int startIndex = instructionList.size();

        // load both variables from stack
        instructionList.add(new Instruction(InstructionCode.LOD.getName(), level, address));
        instructionList.add(new Instruction(InstructionCode.LOD.getName(), level2, address2));

        // depending on for type, either check for var1 <= var2 or var1 >= var2
        if (statementFor.getType() == ForType.TO) {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.LE.getCode()));
        } else {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.GE.getCode()));
        }

        // our for jump out of the cycle, jumping only if false
        Instruction forJump = new Instruction(InstructionCode.JMC.getName(), 0, 0);
        instructionList.add(forJump);

        // compile the statement
        new CompilerStatement(statementFor.getStatement(), inForCycle).compileStatement();

        // end of cycle, now to increase / decrease our first iteration variable
        // load the variable and prepare a constant 1
        instructionList.add(new Instruction(InstructionCode.LOD.getName(), level, address));
        instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 1));

        // depending on type, either var1 + 1 or var1 - 1
        if (statementFor.getType() == ForType.TO) {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.ADD.getCode()));
        } else {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.SUB.getCode()));
        }

        // store it back
        instructionList.add(new Instruction(InstructionCode.STO.getName(), level, address));

        // jump back
        instructionList.add(new Instruction(InstructionCode.JMP.getName(), 0, startIndex));

        // this is the end of cycle, here we will jump if for condition results in false
        forJump.setOperand(instructionList.size());

        // we left the cycle
        inForCycle = false;

    }

    /**
     * compiles case statement
     */
    private void compileCaseStatement() {
        StatementCase statementCase = (StatementCase) statement;

        // compile switched expression
        VariableType caseType = new CompilerExpression(statementCase.getExpression()).compileExpression();

        // if boolean is switched, throw error
        if (caseType == VariableType.BOOLEAN) {
            err.throwError(new ErrorCaseNoBoolean());
        }

        // case jumps - these jumps are for statement end, where they jump to the end of case
        List<Instruction> caseJumps = new ArrayList<>();

        // case branch jumps - these jumps are for end of atom list, where they jump jo the next branch
        List<Instruction> caseBranchJumps = new ArrayList<>();

        // list for used atoms
        List<String> caseAtoms = new ArrayList<>();

        // go through all case limbs (there is always at least one)
        for (CaseLimb caseLimb : statementCase.getLimbList()) {

            List<Instruction> labelListJumps = new ArrayList<>();

            // go through all atoms (always at least one)
            for (AbstractAtom atom : caseLimb.getAtomList()) {


                // compile the atom and check it is not boolean
                VariableType atomType = new CompilerAtom(atom).compileAtom();
                if (atomType == VariableType.BOOLEAN) {
                    err.throwError(new ErrorCaseNoBoolean());
                }

                if (caseAtoms.contains(atom.toString())) {
                    err.throwError(new ErrorCaseMultipleAtoms(atom.toString()));
                } else {
                    caseAtoms.add(atom.toString());
                }

                switch (programMode) {
                    case LEGACY:
                        compileCaseLimbInteger();
                        break;
                    case DEFAULT:
                        // check the types
                        if (caseType == atomType) {
                            // all ok, just see if integer or real
                            if (caseType == VariableType.INTEGER) {
                                compileCaseLimbInteger();
                            } else {
                                compileCaseLimbReal();
                            }
                            // else case is integer - type to integer
                        } else if (caseType == VariableType.INTEGER) {
                            instructionList.add(new Instruction(InstructionCode.RTI.getName(), 0, 0));
                            compileCaseLimbInteger();
                            // else case is real - type to real
                        } else {
                            instructionList.add(new Instruction(InstructionCode.ITR.getName(), 0, 0));
                            compileCaseLimbReal();
                        }
                        break;
                    case STRICT:
                        // strict needs to be two same types
                        if (caseType == atomType) {
                            // integer or real
                            if (caseType == VariableType.INTEGER) {
                                compileCaseLimbInteger();
                            } else {
                                compileCaseLimbReal();
                            }
                        } else {
                            err.throwError(new ErrorIncompatibleTypes(caseType.getValue(), atomType.getValue()));
                        }
                        break;
                }

                // add atom list jump - this jump jumps to the case branch statement, if the expression was true (to skip other atom expressions)
                Instruction atomListJump = new Instruction(InstructionCode.JMC.getName(), 0, 0);
                instructionList.add(atomListJump);
                labelListJumps.add(atomListJump);
            }

            // add case branch jump - after all labels, if there was no jump, all of them were false, so we need to skip the case branch statement
            Instruction caseBranchJump = new Instruction(InstructionCode.JMP.getName(), 0, 0);
            instructionList.add(caseBranchJump);
            caseBranchJumps.add(caseBranchJump);

            // now we know where the atom list jumps jump
            for (Instruction labelListJ : labelListJumps) {
                labelListJ.setOperand(instructionList.size());
            }

            // compile the case branch statement
            new CompilerStatement(caseLimb.getStatement(), inForCycle).compileStatement();

            // prepare case jump - this jumps at the end of statement to the end of case statement - to skip other branches
            Instruction caseJump = new Instruction(InstructionCode.JMP.getName(), 0, 0);
            instructionList.add(caseJump);
            caseJumps.add(caseJump);

            // now we know where the case branch jumps jump
            for (Instruction caseBranchJ : caseBranchJumps) {
                caseBranchJ.setOperand(instructionList.size());
            }
            caseBranchJumps.clear();

        }

        // here the case jumps jump
        for (Instruction caseJ : caseJumps) {
            caseJ.setOperand(instructionList.size());
        }


    }

    private void compileCaseLimbReal() {
        instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, InstructionOperation.EQ.getCode()));
        instructionList.add(new Instruction(InstructionCode.LRT.getName(), 0, 0));
        instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, InstructionOperation.EQ.getCode()));
    }

    private void compileCaseLimbInteger() {
        instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.EQ.getCode()));
        instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 0));
        instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.EQ.getCode()));
    }




    /**
     * compiles if statement
     */
    private void compileIfStatement() {

        StatementIf statementIf = (StatementIf) statement;

        // first compile the expression
        new CompilerExpression(statementIf.getCondition(), VariableType.BOOLEAN).compileExpression();

        // prepare the JMC jump with temporary operand
        Instruction ifJump = new Instruction(InstructionCode.JMC.getName(), 0, 0);
        instructionList.add(ifJump);

        // compile the statement
        new CompilerStatement(statementIf.getStatement(), inForCycle).compileStatement();

        // here we jump from JMC, if it was false
        ifJump.setOperand(instructionList.size());

        // is there else statement?
        if (statementIf.getElseStatement() != null) {

            // jump over the else statement
            Instruction elseJump = new Instruction(InstructionCode.JMP.getName(), 0, 0);
            instructionList.add(elseJump);

            // change the if jump to jump to else
            ifJump.setOperand(instructionList.size());

            // compile the else statement
            new CompilerStatement(statementIf.getElseStatement(), inForCycle).compileStatement();

            elseJump.setOperand(instructionList.size());

        }

    }

    /**
     * compiles repeat until statement
     */
    private void compileRepeatStatement() {
        StatementRepeat statementRepeat = (StatementRepeat) statement;

        // store the start index
        int startIndex = instructionList.size();

        // compile the statement first
        new CompilerStatement(statementRepeat.getStatement(), inForCycle).compileStatement();

        // then the condition
        new CompilerExpression(statementRepeat.getCondition(), VariableType.BOOLEAN).compileExpression();

        // now we jump back only if the result is false, otherwise we continue on
        instructionList.add(new Instruction(InstructionCode.JMC.getName(), 0, startIndex));

    }

    /**
     * compiles do while statement
     */
    private void compileDoWhileStatement() {
        StatementDoWhile statementDoWhile = (StatementDoWhile) statement;

        // store start index
        int startIndex = instructionList.size();

        // compile the statement first
        new CompilerStatement(statementDoWhile.getStatement(), inForCycle).compileStatement();

        // then the condition
        new CompilerExpression(statementDoWhile.getCondition(), VariableType.BOOLEAN).compileExpression();

        // prepare the jump over
        Instruction whileJump = new Instruction(InstructionCode.JMC.getName(), 0, 0);
        instructionList.add(whileJump);

        // this jumps back to start
        instructionList.add(new Instruction(InstructionCode.JMP.getName(), 0, startIndex));

        // here we jump from JMC
        whileJump.setOperand(instructionList.size());

    }

    /**
     * compiles while do statement
     */
    private void compileWhileDoStatement() {
        StatementWhileDo statementWhileDo = (StatementWhileDo) statement;

        // store the start index
        int startIndex = instructionList.size();

        // compile the condition
        new CompilerExpression(statementWhileDo.getCondition(), VariableType.BOOLEAN).compileExpression();

        // prepare while jump with temporary operand - if condition is true, we do not jump, if it is false, we jump to the end
        Instruction whileJump = new Instruction(InstructionCode.JMC.getName(), 0, 0);
        instructionList.add(whileJump);

        // compile the statement
        new CompilerStatement(statementWhileDo.getStatement(), inForCycle).compileStatement();

        // jump to the beginning
        instructionList.add(new Instruction(InstructionCode.JMP.getName(), 0, startIndex));

        // this is where we jump from JMC
        whileJump.setOperand(instructionList.size());

    }

    /**
     * compiles compound statement
     */
    private void compileCompoundStatement() {
        StatementCompound statementCompound = (StatementCompound) statement;

        // get the list and compile the statements
        for (AbstractStatement abstractStatement : statementCompound.getStatementList()) {

            new CompilerStatement(abstractStatement, inForCycle).compileStatement();

        }
    }

    /**
     * compiles i/o statement
     */
    private void compileIOStatement() {
        StatementIO statementIO = (StatementIO) statement;

        String identifier = statementIO.getIdentifier();

        if (checkIfExists(identifier) && checkIfCanBeAccessed(identifier)) {

            SymbolTableItem item = symbolTable.getItem(identifier);

            switch (statementIO.getType()) {

                case READ:
                    switch (item.getVariableType()) {
                        case INTEGER:
                            instructionList.add(new Instruction(InstructionCode.REA.getName(), 0, 0));
                            instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel - item.getLevel(), item.getAddress()));
                            break;
                        case REAL:
                            instructionList.add(new Instruction(InstructionCode.RER.getName(), 0, 0));
                            instructionList.add(new Instruction(InstructionCode.STR.getName(), currentLevel - item.getLevel(), item.getAddress()));
                            break;
                        case STRING:
                            break;
                        case BOOLEAN:
                            instructionList.add(new Instruction(InstructionCode.REA.getName(), 0, 0));
                            instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel - item.getLevel(), item.getAddress()));
                            break;
                    }
                    break;
                case WRITE:
                    switch (item.getVariableType()) {
                        case INTEGER:
                            instructionList.add(new Instruction(InstructionCode.LOD.getName(), currentLevel - item.getLevel(), item.getAddress()));
                            instructionList.add(new Instruction(InstructionCode.WRI.getName(), 0, 0));
                            break;
                        case REAL:
                            instructionList.add(new Instruction(InstructionCode.LOR.getName(), currentLevel - item.getLevel(), item.getAddress()));
                            instructionList.add(new Instruction(InstructionCode.WRR.getName(), 0, 0));
                            break;
                        case STRING:
                            break;
                        case BOOLEAN:
                            instructionList.add(new Instruction(InstructionCode.LOD.getName(), currentLevel - item.getLevel(), item.getAddress()));
                            instructionList.add(new Instruction(InstructionCode.WRI.getName(), 0, 0));
                            break;
                    }
                    break;
            }

        } else {
            err.throwError(new ErrorUnknownIdentifier(identifier));
        }

    }


    /**
     * compiles ternary statement
     */
    private void compileTernaryStatement() {
        StatementTernary statementTernary = (StatementTernary) statement;

        if (symbolTable.contains(statementTernary.getIdentifier())) {

            SymbolTableItem item = symbolTable.getItem(statementTernary.getIdentifier());

            if (checkVariableNotConstant(item.getType())) {

                // compile the condition
                new CompilerExpression(statementTernary.getExpression(), VariableType.BOOLEAN).compileExpression();

                // first jump conditional - if true = do not jump, continue on, if false - jump to the second ternary expression
                Instruction ternaryJumpOne = new Instruction(InstructionCode.JMC.getName(), 0, 0);
                instructionList.add(ternaryJumpOne);

                // compile the first ternary expression
                new CompilerExpression(statementTernary.getExpressionOne(), item.getVariableType()).compileExpression();

                // second jump - if we did the first expression, now we need to jump to the end so we do not do the second expression
                Instruction ternaryJumpTwo = new Instruction(InstructionCode.JMP.getName(), 0, 0);
                instructionList.add(ternaryJumpTwo);

                ternaryJumpOne.setOperand(instructionList.size());

                // compile the second ternary expression
                new CompilerExpression(statementTernary.getExpressionTwo(), item.getVariableType()).compileExpression();

                ternaryJumpTwo.setOperand(instructionList.size());

                // determine the store instruction
                if (item.getVariableType() == VariableType.INTEGER || item.getVariableType() == VariableType.BOOLEAN) {
                    instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel - item.getLevel(), item.getAddress()));
                } else if (item.getVariableType() == VariableType.REAL) {
                    instructionList.add(new Instruction(InstructionCode.STR.getName(), currentLevel - item.getLevel(), item.getAddress()));
                }

                // assigned
                item.setSize(1);


            } else {
                err.throwError(new ErrorConstantReassign(item.getName()));
            }


        } else {
            err.throwError(new ErrorUnknownIdentifier(statementTernary.getIdentifier()));
        }

    }

    /**
     * compiles goto statement
     */
    private void compileGotoStatement() {
        StatementGoto statementGoto = (StatementGoto) statement;

        String label = String.valueOf(statementGoto.getValue());

        if (checkIfExists(label)) {

            if (checkIfCanBeAccessed(label)) {

                SymbolTableItem item = symbolTable.getItem(label);

                // check if label was assigned
                if (item.getSize() == 0) {

                    // we do not know address of the label
                    Instruction ins = new Instruction(InstructionCode.JMP.getName(), 0, 0);
                    gotoList.add(new Goto(ins, item.getName(), currentLevel));
                    instructionList.add(ins);
                } else {
                    // we know the address
                    instructionList.add(new Instruction(InstructionCode.JMP.getName(), 0, item.getAddress()));
                }
            } else {
                err.throwError(new ErrorLabelOutOfReach(label));
            }

        } else {
            err.throwError(new ErrorUnknownLabel(label));
        }

    }

    /**
     * compiles procedure call statement
     */
    private void compileProcedureStatement() {
        StatementProcedure statementProcedure = (StatementProcedure) statement;

        String identifier = statementProcedure.getIdentifier();

        if (checkIfExists(identifier) && checkIfCanBeAccessed(identifier)) {

            SymbolTableItem item = symbolTable.getItem(identifier);

            instructionList.add(new Instruction(InstructionCode.CAL.getName(), currentLevel - item.getLevel(), item.getAddress()));

        } else {
            err.throwError(new ErrorUnknownProcedure(identifier));
        }

    }

    /**
     * compiles assignment statement
     */
    private void compileAssignmentStatement() {
        StatementAssignment statementAssignment = (StatementAssignment) statement;

        if (symbolTable.contains(statementAssignment.getIdentifier())) {

            SymbolTableItem item = symbolTable.getItem(statementAssignment.getIdentifier());

            if (checkVariableNotConstant(item.getType())) {

                new CompilerExpression(statementAssignment.getExpression(), item.getVariableType()).compileExpression();

                // determine the store instruction
                if (item.getVariableType() == VariableType.INTEGER || item.getVariableType() == VariableType.BOOLEAN) {
                    instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel - item.getLevel(), item.getAddress()));
                } else if (item.getVariableType() == VariableType.REAL) {
                    instructionList.add(new Instruction(InstructionCode.STR.getName(), currentLevel - item.getLevel(), item.getAddress()));
                }

                // variable is assigned (if it was not before)
                item.setSize(1);

            } else {
                err.throwError(new ErrorConstantReassign(item.getName()));
            }


        } else {
            err.throwError(new ErrorUnknownIdentifier(statementAssignment.getIdentifier()));
        }

    }

    /**
     * check that variable is not a constant
     * @param type variable to check
     * @return true or false
     */
    private boolean checkVariableNotConstant(String type) {
        String[] split = type.split("\\s+");
        String declarationType = split[0];

        return declarationType.equalsIgnoreCase("variable");

    }

    /**
     * method checks if statement is labelled and compiles it if it is
     */
    private void checkIfLabelledAndCompile() {

        if (statement.isLabelled()) {

            String label = String.valueOf(statement.getLabel().getValue());

            if (checkIfExists(label)) {

                // watch our for for cycle
                if (inForCycle) {
                    err.throwError(new ErrorLabelNotAllowedInForCycle(label));
                }

                SymbolTableItem item = symbolTable.getItem(label);

                // find the label and whether it has been assigned
                if (item.getSize() == 0) {

                    // assign it now
                    item.setSize(1);
                    item.setAddress(instructionList.size());

                } else {
                    err.throwError(new ErrorLabelUsedElsewhere(item.getName()));
                }

            } else {
                err.throwError(new ErrorUnknownLabel(label));
            }

        }

    }

}
