package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.Constant;
import cz.zcu.kiv.fjp.compiler.types.Label;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.compiler.types.atoms.AtomId;
import cz.zcu.kiv.fjp.compiler.types.declarations.*;
import cz.zcu.kiv.fjp.enums.AtomType;
import cz.zcu.kiv.fjp.enums.DeclarationType;
import cz.zcu.kiv.fjp.enums.InstructionCode;
import cz.zcu.kiv.fjp.enums.VariableType;
import cz.zcu.kiv.fjp.errors.ErrorIncompatibleTypes;
import cz.zcu.kiv.fjp.errors.ErrorParallelDeclarationNumberMismatch;
import cz.zcu.kiv.fjp.errors.ErrorUnknownIdentifier;
import cz.zcu.kiv.fjp.errors.ErrorVariableAlreadyDeclared;
import cz.zcu.kiv.fjp.instruction.Instruction;

import java.util.List;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

/**
 * Declaration Compiler
 * Compiles declarations into instructions
 */
public class CompilerDeclaration {

    /**
     * declaration to compile
     */
    private AbstractDeclaration declaration;

    /**
     * @param declaration declaration to compile
     */
    public CompilerDeclaration(AbstractDeclaration declaration) {
        this.declaration = declaration;
    }

    public AbstractDeclaration getDeclaration() {
        return declaration;
    }


    /**
     * method to compile declaration
     * calls other methods depending on the declaration type
     */
    public void compileDeclaration() {

        // for error handler
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
            case VARIABLE_PARALLEL:
                compileVariableParallelDeclaration();
                break;
            case CONSTANT:
                compileConstantDeclaration();
                break;
        }


    }

    /**
     * compiles label declaration
     */
    private void compileLabelDeclaration() {
        DeclarationLabel declarationLabel = (DeclarationLabel) declaration;
        List<Label> labelList = declarationLabel.getLabelList();

        // through label list
        for (Label label : labelList) {

            if (!checkIfExists(String.valueOf(label.getValue()))) {
                // labels are not stored in stack, so it is only necessary to store them in symbol table
                SymbolTableItem item = new SymbolTableItem(String.valueOf(label.getValue()), label.getIdentifierType().getName(), currentLevel, 0, 0);
                symbolTable.addItem(item.getName(), item);

            } else {
                err.throwError(new ErrorVariableAlreadyDeclared(String.valueOf(label.getValue())));
            }


        }

    }

    /**
     * compiles procedure declaration
     */
    private void compileProcedureDeclaration() {
        DeclarationProcedure declarationProcedure = (DeclarationProcedure) declaration;

        if (!checkIfExists(String.valueOf(declarationProcedure.getProcedure().getName()))) {

            // add new symbol into symbol table
            SymbolTableItem item = new SymbolTableItem(declarationProcedure.getProcedure().getName(), declarationProcedure.getProcedure().getIdentifierType().getName(), currentLevel, instructionList.size(), 0);
            symbolTable.addItem(item.getName(), item);

            // increase the level - we are in new procedure
            currentLevel++;

            // save start and last index for determining the size of procedure
            int startIndex = instructionList.size();

            // compile procedure block
            new CompilerBlock(declarationProcedure.getProcedureBlock()).compileBlock();

            int endIndex = instructionList.size();

            // set size
            item.setSize(endIndex - startIndex);

            // we are back from procedure, level decrease
            currentLevel--;

        } else {
            err.throwError(new ErrorVariableAlreadyDeclared(declarationProcedure.getProcedure().getName()));
        }

    }

    /**
     * compiles variable simple declaration
     */
    private void compileVariableDeclaration() {
        DeclarationVariableSimple declarationVariableSimple = (DeclarationVariableSimple) declaration;
        List<Variable> variableList = declarationVariableSimple.getVariableList();

        // through variables
        for (Variable variable : variableList) {

            if (!checkIfExists(variable.getName())) {
                SymbolTableItem item = new SymbolTableItem(variable.getName(), variable.getIdentifierType().getName(), declarationVariableSimple.getType(), currentLevel, currentAddress, 0);
                symbolTable.addItem(item.getName(), item);

                // compile expression only if we are the first variable
                if (variable.equals(variableList.get(0)) && declarationVariableSimple.isInit()) {
                    new CompilerExpression(declarationVariableSimple.getExpression(), declarationVariableSimple.getType()).compileExpression();
                }

                VariableType type = declarationVariableSimple.getType();

                // add implicit assignment
                if (!declarationVariableSimple.isInit()) {
                    switch (type) {
                        case INTEGER:
                            instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 0));
                            break;
                        case REAL:
                            instructionList.add(new Instruction(InstructionCode.LRT.getName(), 0, 0));
                            break;
                        case STRING:
                            break;
                        case BOOLEAN:
                            instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 0));
                            break;
                    }

                }

                // determine which store instruction we use depending on the variable type
                    if (type == VariableType.INTEGER || type == VariableType.BOOLEAN) {
                        instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel - item.getLevel(), currentAddress));
                    } else if (type == VariableType.REAL) {
                        instructionList.add(new Instruction(InstructionCode.STR.getName(), currentLevel - item.getLevel(), currentAddress));
                    }


                // initialized variable
                item.setSize(1);

                // increase address and declaration counter
                currentAddress++;
                declarationCounter++;


            } else {
                err.throwError(new ErrorVariableAlreadyDeclared(variable.getName()));

            }

        }


    }

    /**
     * compiles parallel declaration
     */
    private void compileVariableParallelDeclaration() {

        DeclarationVariableParallel declarationVariableParallel = (DeclarationVariableParallel) declaration;
        List<Variable> variableList = declarationVariableParallel.getVariableList();
        List<AbstractExpression> expressionList = declarationVariableParallel.getExpressionList();

        // number of expressions needs to match number of variables
        if (variableList.size() != expressionList.size()) {
            err.throwError(new ErrorParallelDeclarationNumberMismatch());
        }


        // go through variable list
        for (int i = 0; i < variableList.size(); i++) {

            Variable variable = variableList.get(i);

            if (!checkIfExists(variable.getName())) {

                SymbolTableItem item = new SymbolTableItem(variable.getName(), variable.getIdentifierType().getName(), declarationVariableParallel.getType(), currentLevel, currentAddress, 0);
                symbolTable.addItem(item.getName(), item);

                new CompilerExpression(declarationVariableParallel.getExpressionList().get(i), declarationVariableParallel.getType()).compileExpression();

                // determine store function
                VariableType type = declarationVariableParallel.getType();
                if (type == VariableType.INTEGER || type == VariableType.BOOLEAN) {
                    instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel - item.getLevel(), currentAddress));
                } else if (type == VariableType.REAL) {
                    instructionList.add(new Instruction(InstructionCode.STR.getName(), currentLevel - item.getLevel(), currentAddress));
                }

                // item is now initialized
                item.setSize(1);

                // increase counters
                currentAddress++;
                declarationCounter++;

            } else {
                err.throwError(new ErrorVariableAlreadyDeclared(variable.getName()));
            }


        }


    }

    /**
     * compiles constant declaration
     */
    private void compileConstantDeclaration() {
        DeclarationConstant declarationConstant = (DeclarationConstant) declaration;
        List<Constant> constantList = declarationConstant.getConstantList();

        // first it is needed to check the type of atom and constant and if they match
        if (checkConstantTypeAndAtomValue(declarationConstant.getType(), declarationConstant.getValue())) {

            // go through constants
            for (Constant constant : constantList) {

                if (!checkIfExists(constant.getName())) {
                    SymbolTableItem item = new SymbolTableItem(constant.getName(), constant.getIdentifierType().getName(), declarationConstant.getType(), currentLevel, currentAddress, 1);
                    symbolTable.addItem(item.getName(), item);

                    // compile atom only if we are the first constant
                    if (constant.equals(constantList.get(0))) {
                        new CompilerAtom(declarationConstant.getValue()).compileAtom();
                    }

                    // determine which store instruction to use
                    VariableType type = declarationConstant.getType();
                    if (type == VariableType.INTEGER || type == VariableType.BOOLEAN) {
                        instructionList.add(new Instruction(InstructionCode.STO.getName(), currentLevel - item.getLevel(), currentAddress));
                    } else if (type == VariableType.REAL) {
                        instructionList.add(new Instruction(InstructionCode.STR.getName(), currentLevel - item.getLevel(), currentAddress));
                    }

                    // increase counters
                    currentAddress++;
                    declarationCounter++;
                } else {
                    err.throwError(new ErrorVariableAlreadyDeclared(constant.getName()));
                }
            }


        } else {
            err.throwError(new ErrorIncompatibleTypes(declarationConstant.getType().getValue(), declarationConstant.getValue().getAtomType().getName()));
        }


    }

    /**
     * checks if constant variable type is the same as atom type (in other words if atom can be assigned to constant variable)
     * @param type constant type
     * @param value atom
     * @return true if they are the same, false otherwise
     */
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

    /**
     * checks if constant type and item have the same type, item is represented by identifier atom
     * @param type constant type
     * @param ident identifier atom
     * @return true, if they have the same type, false otherwise
     */
    private boolean checkConstantTypeAndIdentifierType(VariableType type, AtomId ident) {

        if (checkIfExists(ident.getIdentifier()) && checkIfCanBeAccessed(ident.getIdentifier())) {
            SymbolTableItem item = symbolTable.getItem(ident.getIdentifier());
            if (type == item.getVariableType()) {
                return true;
            } else {
                err.throwError(new ErrorIncompatibleTypes(type.getValue(), item.getVariableType().getValue()));
            }


        } else {
            err.throwError(new ErrorUnknownIdentifier(ident.getIdentifier()));

        }
        return false;
    }


}
