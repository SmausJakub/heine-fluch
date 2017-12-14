package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.atoms.AtomId;
import cz.zcu.kiv.fjp.compiler.types.expressions.*;
import cz.zcu.kiv.fjp.enums.*;
import cz.zcu.kiv.fjp.errors.ErrorIncompatibleTypes;
import cz.zcu.kiv.fjp.errors.ErrorUnknownIdentifier;
import cz.zcu.kiv.fjp.errors.ErrorVariableNotInitialized;
import cz.zcu.kiv.fjp.instruction.Instruction;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

public class CompilerExpression {

    private VariableType expectedType;
    private VariableType foundType;

    private AbstractExpression expression;

    public CompilerExpression(AbstractExpression expression, VariableType expectedType) {
        this.expression = expression;
        this.expectedType = expectedType;
    }

    public void compileExpression() {

        // analyze if possible to resolve expression
        if (analyzeExpression(expression)) {

            // compile it
            compileExpressionRecursive(expression);

        } else {
            err.throwError(new ErrorIncompatibleTypes(expectedType.getValue(), foundType.getValue()));
        }

    }

    private void compileExpressionRecursive(AbstractExpression exp) {

        switch (exp.getExpressionType()) {

            case UNARY:
                ExpressionUnary expressionUnary = (ExpressionUnary) exp;
                compileExpressionRecursive(expressionUnary.getExpression());
                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.NEG.getCode()));
                break;
            case NOT:
                ExpressionNot expressionNot = (ExpressionNot) exp;
                compileExpressionRecursive(expressionNot.getExpression());

                instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 0));
                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.EQ.getCode()));
                break;
            case MULT:
                ExpressionMultiplication expressionMultiplication = (ExpressionMultiplication) exp;
                compileExpressionRecursive(expressionMultiplication.getLeftExpression());
                compileExpressionRecursive(expressionMultiplication.getRightExpression());

                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, getOpCodeFromOperatorMultiplication(expressionMultiplication.getOperator())));
                break;
            case ADD:
                ExpressionAdditive expressionAdditive = (ExpressionAdditive) exp;
                compileExpressionRecursive(expressionAdditive.getLeftExpression());
                compileExpressionRecursive(expressionAdditive.getRightExpression());

                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, getOpCodeFromOperatorAdditive(expressionAdditive.getOperator())));
                break;
            case REL:
                ExpressionRelational expressionRelational = (ExpressionRelational) exp;
                compileExpressionRecursive(expressionRelational.getLeftExpression());
                compileExpressionRecursive(expressionRelational.getRightExpression());

                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, getOpCodeFromOperatorRelation(expressionRelational.getOperator())));
                break;
            case LOG:
                ExpressionLogic expressionLogic = (ExpressionLogic) exp;

                compileExpressionRecursive(expressionLogic.getLeftExpression());
                compileExpressionRecursive(expressionLogic.getRightExpression());

                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.ADD.getCode()));

                if (expressionLogic.getOperator() == OperatorLogic.AND) {
                    // AND
                    instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 2));
                    instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.EQ.getCode()));
                } else {
                    // OR
                    instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 1));
                    instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.GE.getCode()));
                }
                break;
            case PAR:
                ExpressionPar expressionPar = (ExpressionPar) exp;
                compileExpressionRecursive(expressionPar.getExpression());
                break;
            case ATOM:
                ExpressionAtom expressionAtom = (ExpressionAtom) exp;
                new CompilerAtom(expressionAtom.getAtom()).compileAtom();
                break;
        }

    }

    private int getOpCodeFromOperatorMultiplication(OperatorMultiplication operatorMultiplication) {
        switch (operatorMultiplication) {
            case MULTIPLY:
                return InstructionOperation.MUL.getCode();
            case DIVIDE:
                return InstructionOperation.DIV.getCode();
        }
        return 0;
    }

    private int getOpCodeFromOperatorAdditive(OperatorAddition operatorAddition) {
        switch (operatorAddition) {

            case PLUS:
                return InstructionOperation.ADD.getCode();
            case MINUS:
                return InstructionOperation.SUB.getCode();
        }
        return 0;
    }

    private int getOpCodeFromOperatorRelation(OperatorRelation operatorRelation) {
        switch (operatorRelation) {
            case EQUAL:
                return InstructionOperation.EQ.getCode();
            case NOT_EQUAL:
                return InstructionOperation.NE.getCode();
            case LT:
                return InstructionOperation.LT.getCode();
            case LE:
                return InstructionOperation.LE.getCode();
            case GE:
                return InstructionOperation.GE.getCode();
            case GT:
                return InstructionOperation.GT.getCode();
        }
        return 0;
    }


    private boolean analyzeExpression(AbstractExpression exp) {

        foundType = analyzeExpressionRecursive(exp);

        return (expectedType == foundType);

    }

    private VariableType analyzeExpressionRecursive(AbstractExpression exp) {

        VariableType typeOne;
        VariableType typeTwo;

        switch (exp.getExpressionType()) {

            case UNARY:
                ExpressionUnary expressionUnary = (ExpressionUnary) exp;
                typeOne = analyzeExpressionRecursive(expressionUnary.getExpression());
                if (resolveUnaryExpression(typeOne)) {
                    return typeOne;
                } else {
                    err.throwError(new ErrorIncompatibleTypes(VariableType.INTEGER.getValue(), typeOne.getValue()));
                }
            case NOT:
                ExpressionNot expressionNot = (ExpressionNot) exp;
                typeOne = analyzeExpressionRecursive(expressionNot.getExpression());
                if (resolveNotExpression(typeOne)) {
                    return typeOne;
                } else {
                    err.throwError(new ErrorIncompatibleTypes(VariableType.BOOLEAN.getValue(), typeOne.getValue()));
                }
            case MULT:
                ExpressionMultiplication expressionMultiplication = (ExpressionMultiplication) exp;
                typeOne = analyzeExpressionRecursive(expressionMultiplication.getLeftExpression());
                typeTwo = analyzeExpressionRecursive(expressionMultiplication.getRightExpression());
                if (resolveMultiplicationExpression(typeOne, typeTwo)) {
                    return typeOne;
                } else {
                    err.throwError(new ErrorIncompatibleTypes(typeOne.getValue(), typeTwo.getValue()));
                }
            case ADD:
                ExpressionAdditive expressionAdditive = (ExpressionAdditive) exp;
                typeOne = analyzeExpressionRecursive(expressionAdditive.getLeftExpression());
                typeTwo = analyzeExpressionRecursive(expressionAdditive.getRightExpression());
                if (resolveAdditiveExpression(typeOne, typeTwo, expressionAdditive.getOperator())) {
                    return typeOne;
                } else {
                    err.throwError(new ErrorIncompatibleTypes(typeOne.getValue(), typeTwo.getValue()));
                }
            case REL:
                ExpressionRelational expressionRelational = (ExpressionRelational) exp;
                typeOne = analyzeExpressionRecursive(expressionRelational.getLeftExpression());
                typeTwo = analyzeExpressionRecursive(expressionRelational.getRightExpression());
                if (resolveRelationalExpression(typeOne, typeTwo)) {
                    return VariableType.BOOLEAN;
                } else {
                    err.throwError(new ErrorIncompatibleTypes(typeOne.getValue(), typeTwo.getValue()));
                }
            case LOG:
                ExpressionLogic expressionLogic = (ExpressionLogic) exp;
                typeOne = analyzeExpressionRecursive(expressionLogic.getLeftExpression());
                typeTwo = analyzeExpressionRecursive(expressionLogic.getRightExpression());
                if (resolveLoginExpression(typeOne, typeTwo)) {
                    return VariableType.BOOLEAN;
                } else {
                    err.throwError(new ErrorIncompatibleTypes(typeOne.getValue(), typeTwo.getValue()));
                }
            case PAR:
                ExpressionPar expressionPar = (ExpressionPar) exp;
                return analyzeExpressionRecursive(expressionPar.getExpression());
            case ATOM:
                ExpressionAtom expressionAtom = (ExpressionAtom) exp;
                return getVariableTypeFromAtomType(expressionAtom.getAtom());
        }
        return null;

    }

    private boolean resolveUnaryExpression(VariableType type) {
        return (type == VariableType.INTEGER || type == VariableType.REAL);
    }

    private boolean resolveNotExpression(VariableType type) {
        return (type == VariableType.BOOLEAN);
    }

    private boolean resolveMultiplicationExpression(VariableType typeOne, VariableType typeTwo) {

        if (typeOne == VariableType.INTEGER && typeTwo == VariableType.INTEGER) {
            return true;
        } else return typeOne == VariableType.REAL && typeTwo == VariableType.REAL;
    }

    private boolean resolveAdditiveExpression(VariableType typeOne, VariableType typeTwo, OperatorAddition operator) {
        if (typeOne == VariableType.INTEGER && typeTwo == VariableType.INTEGER) {
            return true;
        } else if (typeOne == VariableType.REAL && typeTwo == VariableType.REAL) {
            return true;
        } else
            return typeOne == VariableType.STRING && typeTwo == VariableType.STRING && operator == OperatorAddition.PLUS;

    }

    private boolean resolveRelationalExpression(VariableType typeOne, VariableType typeTwo) {
        return typeOne == typeTwo;

    }

    private boolean resolveLoginExpression(VariableType typeOne, VariableType typeTwo) {
        return typeOne == typeTwo;
    }


    private VariableType getVariableTypeFromAtomType(AbstractAtom atom) {

        switch (atom.getAtomType()) {

            case INT:
                return VariableType.INTEGER;
            case REAL:
                return VariableType.REAL;
            case BOOLEAN:
                return VariableType.BOOLEAN;
            case ID:
                AtomId atomId = (AtomId) atom;
                if (checkIfExists(atomId.getIdentifier()) && checkIfCanBeAccessed(atomId.getIdentifier())) {
                    SymbolTableItem item = symbolTable.getItem(atomId.getIdentifier());

                    if (item.getSize() == 1) {
                        return item.getVariableType();
                    } else {
                        err.throwError(new ErrorVariableNotInitialized(item.getName()));
                        return null;
                    }

                } else {
                    err.throwError(new ErrorUnknownIdentifier(atomId.getIdentifier()));
                    return null;
                }
            case STRING:
                return VariableType.STRING;
        }
        return null;
    }


}
