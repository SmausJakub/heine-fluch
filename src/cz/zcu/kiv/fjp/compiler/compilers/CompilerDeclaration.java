package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.Constant;
import cz.zcu.kiv.fjp.compiler.types.Label;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.compiler.types.atoms.AtomId;
import cz.zcu.kiv.fjp.compiler.types.declarations.DeclarationConstant;
import cz.zcu.kiv.fjp.compiler.types.declarations.DeclarationLabel;
import cz.zcu.kiv.fjp.compiler.types.declarations.DeclarationVariableParalel;
import cz.zcu.kiv.fjp.compiler.types.declarations.DeclarationVariableSimple;
import cz.zcu.kiv.fjp.enums.AtomType;
import cz.zcu.kiv.fjp.enums.DeclarationType;
import cz.zcu.kiv.fjp.enums.InstructionCode;
import cz.zcu.kiv.fjp.enums.VariableType;
import cz.zcu.kiv.fjp.instruction.Instruction;

import java.util.List;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

public class CompilerDeclaration {


    private AbstractDeclaration declaration;

    public CompilerDeclaration(AbstractDeclaration declaration) {
        this.declaration = declaration;
    }

    public AbstractDeclaration getDeclaration() {
        return declaration;
    }


    public void compileDeclaration() {

        err.setCurrentPart(declaration);

        DeclarationType type = declaration.getDeclarationType();

        switch (type) {

            case LABEL:
                compileLabelDeclaration();
                break;
            case PROCEDURE:
                compileProcedureDeclaration();
                break;
            case VARIABLE:
                compileVariableDeclaration();
                break;
            case VARIABLE_PARALEL:
                compileVariableParalelDeclaration();
                break;
            case CONSTANT:
                compileConstantDeclaration();
                break;
        }


    }

    private void compileLabelDeclaration() {
        DeclarationLabel declarationLabel = (DeclarationLabel) declaration;
        List<Label> labelList = declarationLabel.getLabelList();

        for (Label label : labelList) {

            if (!symbolTable.contains(String.valueOf(label.getValue()))) {
                SymbolTableItem item = new SymbolTableItem(String.valueOf(label.getValue()), label.getIdentifierType().getName(), currentLevel, 0, 0);
                symbolTable.addItem(item.getName(), item);

            } else {
                err.throwError("Label " + String.valueOf(label.getValue()) + " is already declared");
            }


        }

    }

    private void compileProcedureDeclaration() {

    }

    private void compileVariableDeclaration() {
        DeclarationVariableSimple declarationVariableSimple = (DeclarationVariableSimple) declaration;
        List<Variable> variableList = declarationVariableSimple.getVariableList();

        for (Variable variable : variableList) {

            if (!symbolTable.contains(variable.getName())) {
                SymbolTableItem item = new SymbolTableItem(variable.getName(), variable.getIdentifierType().getName(), declarationVariableSimple.getType(), currentLevel, currentAddress, 0);
                symbolTable.addItem(item.getName(), item);

                // compile expression only if we are the first variable
                if (variable.equals(variableList.get(0)) && declarationVariableSimple.isInit()) {
                    new CompilerExpression(declarationVariableSimple.getExpression(), declarationVariableSimple.getType()).compileExpression();
                }

                instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel, currentAddress));

                // so we cant do integer x := x;
                if (declarationVariableSimple.isInit()) {
                    item.setSize(1);
                }

                currentAddress++;
                declarationCounter++;


            } else {
                err.throwError("Variable " + variable.getName() + " is already declared");

            }

        }


    }

    private void compileVariableParalelDeclaration() {

        DeclarationVariableParalel declarationVariableParalel = (DeclarationVariableParalel) declaration;
        List<Variable> variableList = declarationVariableParalel.getVariableList();
        List<AbstractExpression> expressionList = declarationVariableParalel.getExpressionList();

        if (variableList.size() != expressionList.size()) {
            err.throwError("Parallel declaration error - each variable needs to have one expression");
            return;
        }


        for (int i = 0; i < variableList.size(); i++) {

            Variable variable = variableList.get(i);

            if (!symbolTable.contains(variable.getName())) {

                SymbolTableItem item = new SymbolTableItem(variable.getName(), variable.getIdentifierType().getName(), declarationVariableParalel.getType(), currentLevel, currentAddress, 0);
                symbolTable.addItem(item.getName(), item);

                new CompilerExpression(declarationVariableParalel.getExpressionList().get(i), declarationVariableParalel.getType()).compileExpression();

                instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel, currentAddress));
                item.setSize(1);

                currentAddress++;
                declarationCounter++;

            } else {
                err.throwError("Variable " + variable.getName() + " is already declared");
            }


        }


    }

    private void compileConstantDeclaration() {
        DeclarationConstant declarationConstant = (DeclarationConstant) declaration;
        List<Constant> constantList = declarationConstant.getConstantList();

        if (checkConstantTypeAndAtomValue(declarationConstant.getType(), declarationConstant.getValue())) {

            for (Constant constant : constantList) {

                if (!symbolTable.contains(constant.getName())) {
                    SymbolTableItem item = new SymbolTableItem(constant.getName(), constant.getIdentifierType().getName(), declarationConstant.getType(), currentLevel, currentAddress, 1);
                    symbolTable.addItem(item.getName(), item);

                    // compile atom only if we are the first constant
                    if (constant.equals(constantList.get(0))) {
                        new CompilerAtom(declarationConstant.getValue()).compileAtom();
                    }
                    instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel, currentAddress));

                    currentAddress++;
                    declarationCounter++;
                } else {
                    err.throwError("Constant " + constant.getName() + " is already declared");
                }
            }


        } else {
            err.throwError("Incompatible types: " + declarationConstant.getType().getValue() + " and " + declarationConstant.getValue().getAtomType().getName());

        }


    }

    private boolean checkConstantTypeAndAtomValue(VariableType type, AbstractAtom value) {

        if (type == VariableType.BOOLEAN && value.getAtomType() == AtomType.BOOLEAN) {

            return true;

        } else if (type == VariableType.INTEGER && value.getAtomType() == AtomType.INT) {
            return true;
        } else if (type == VariableType.REAL && value.getAtomType() == AtomType.REAL) {
            return true;
        } else if (type == VariableType.STRING && value.getAtomType() == AtomType.STRING) {
            return true;
        } else if (value.getAtomType() == AtomType.ID) {
            return checkConstantTypeAndIdentifierType(type, (AtomId) value);
        } else {
            return false;
        }
    }

    private boolean checkConstantTypeAndIdentifierType(VariableType type, AtomId ident) {

        if (symbolTable.contains(ident.getIdentifier())) {
            SymbolTableItem item = symbolTable.getItem(ident.getIdentifier());
            if (type == item.getVariableType()) {
                return true;
            } else {
                err.throwError("Incompatible types: " + type.getValue() + " and " + item.getVariableType().getValue());
            }


        } else {
            err.throwError("Unknown identifier " + ident.getIdentifier());

        }
        return false;
    }


}
