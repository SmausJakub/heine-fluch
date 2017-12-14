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

/**
 * Compiler Expressions
 * Compiles expressions into instructions
 */
public class CompilerExpression {

    /**
     * expected type that the expression will have
     * it is given by the one calling the CompilerExpression
     */
    private VariableType expectedType;

    /**
     * type that the expression has
     * it is found during the analysis of expression and is compared to the expected type
     */
    private VariableType foundType;

    /**
     * current type of expression
     * it is changed depending on what the current type the compile is working with is
     * it is essential in dealing with instruction differences between integer and real
     */
    private VariableType currentType;

    /**
     * expression to compile
     */
    private AbstractExpression expression;

    /**
     * @param expression   expression to compile
     * @param expectedType expected type of expression
     */
    public CompilerExpression(AbstractExpression expression, VariableType expectedType) {
        this.expression = expression;
        this.expectedType = expectedType;
    }

    /**
     * compiles expression
     * first analyzes the expression to check its type, then compiles it recursively
     */
    public void compileExpression() {

        // analyze if possible to resolve expression
        if (analyzeExpression(expression)) {

            // compile it
            compileExpressionRecursive(expression);

        } else {
            err.throwError(new ErrorIncompatibleTypes(expectedType.getValue(), foundType.getValue()));
        }

    }

    /**
     * recursive method for compiling expression
     * @param exp expression to compile
     */
    private void compileExpressionRecursive(AbstractExpression exp) {

        switch (exp.getExpressionType()) {

            case UNARY:
                ExpressionUnary expressionUnary = (ExpressionUnary) exp;
                compileExpressionRecursive(expressionUnary.getExpression());
                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.NEG.getCode()));

                if (currentType == VariableType.INTEGER) {
                    instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.NEG.getCode()));
                } else if (currentType == VariableType.REAL) {
                    instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, InstructionOperation.NEG.getCode()));
                }
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

                if (currentType == VariableType.INTEGER) {
                    instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, getOpCodeFromOperatorMultiplication(expressionMultiplication.getOperator())));
                } else if (currentType == VariableType.REAL) {
                    instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, getOpCodeFromOperatorMultiplication(expressionMultiplication.getOperator())));
                }
                break;
            case ADD:
                ExpressionAdditive expressionAdditive = (ExpressionAdditive) exp;
                compileExpressionRecursive(expressionAdditive.getLeftExpression());
                compileExpressionRecursive(expressionAdditive.getRightExpression());

                if (currentType == VariableType.INTEGER) {
                    instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, getOpCodeFromOperatorAdditive(expressionAdditive.getOperator())));
                } else if (currentType == VariableType.REAL) {
                    instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, getOpCodeFromOperatorAdditive(expressionAdditive.getOperator())));
                }
                break;
            case REL:
                ExpressionRelational expressionRelational = (ExpressionRelational) exp;
                compileExpressionRecursive(expressionRelational.getLeftExpression());
                compileExpressionRecursive(expressionRelational.getRightExpression());

                if (currentType == VariableType.INTEGER || currentType == VariableType.BOOLEAN) {
                    instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, getOpCodeFromOperatorRelation(expressionRelational.getOperator())));
                } else if (currentType == VariableType.REAL) {
                    instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, getOpCodeFromOperatorRelation(expressionRelational.getOperator())));
                }
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
                changeCurrentType(expressionAtom.getAtom());
                new CompilerAtom(expressionAtom.getAtom()).compileAtom();
                break;
        }

    }

    /**
     * method changes the current type of expression based on atom's type
     * @param atom atom
     */
    private void changeCurrentType(AbstractAtom atom) {
        switch (atom.getAtomType()) {

            case INT:
                currentType = VariableType.INTEGER;
                break;
            case REAL:
                currentType = VariableType.REAL;
                break;
            case BOOLEAN:
                currentType = VariableType.BOOLEAN;
                break;
            case ID:
                AtomId atomId = (AtomId) atom;
                currentType = symbolTable.getItem(atomId.getIdentifier()).getVariableType();
                break;
            case STRING:
                currentType = VariableType.STRING;
                break;
        }
    }

    /**
     * returns the instruction code of multiplication operator
     * @param operatorMultiplication multiplication operator
     * @return code of InstructionOperation
     */
    private int getOpCodeFromOperatorMultiplication(OperatorMultiplication operatorMultiplication) {
        switch (operatorMultiplication) {
            case MULTIPLY:
                return InstructionOperation.MUL.getCode();
            case DIVIDE:
                return InstructionOperation.DIV.getCode();
        }
        return 0;
    }

    /**
     * returns the instruction code of addition operator
     * @param operatorAddition addition operator
     * @return code of InstructionOperation
     */
    private int getOpCodeFromOperatorAdditive(OperatorAddition operatorAddition) {
        switch (operatorAddition) {

            case PLUS:
                return InstructionOperation.ADD.getCode();
            case MINUS:
                return InstructionOperation.SUB.getCode();
        }
        return 0;
    }

    /**
     * returns the instruction code of relation operator
     * @param operatorRelation relation operator
     * @return code of InstructionOperation
     */
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

    /**
     * method to analyze expression and check if it is resolvable expression
     * @param exp expression to resolve
     * @return true if expression can be resolved, false otherwise
     */
    private boolean analyzeExpression(AbstractExpression exp) {

        foundType = analyzeExpressionRecursive(exp);

        return (expectedType == foundType);

    }

    /**
     * recursive method to analyze expression and its resolvability
     * @param exp expression
     * @return type of resolved expression
     */
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

    /**
     * resolves unary expression. Only allowed type is INTEGER and REAL
     * @param type variable type
     * @return true or false
     */
    private boolean resolveUnaryExpression(VariableType type) {
        return (type == VariableType.INTEGER || type == VariableType.REAL);
    }

    /**
     * resolves not expression. Only allowed type is BOOLEAN.
     * @param type variable type
     * @return true or false
     */
    private boolean resolveNotExpression(VariableType type) {
        return (type == VariableType.BOOLEAN);
    }

    /**
     * resolves multiplication expression. Only allowed types are two iNTEGERs and two REALs
     * @param typeOne variable type one
     * @param typeTwo variable type two
     * @return true or false
     */
    private boolean resolveMultiplicationExpression(VariableType typeOne, VariableType typeTwo) {

        if (typeOne == VariableType.INTEGER && typeTwo == VariableType.INTEGER) {
            return true;
        } else return typeOne == VariableType.REAL && typeTwo == VariableType.REAL;
    }

    /**
     * resolves additive expression. Only allowed types are two INTEGERs, two REALs, or if operator is PLUS, then two STRINGs
     * @param typeOne variable type one
     * @param typeTwo variable type two
     * @param operator operator addition
     * @return true or false
     */
    private boolean resolveAdditiveExpression(VariableType typeOne, VariableType typeTwo, OperatorAddition operator) {
        if (typeOne == VariableType.INTEGER && typeTwo == VariableType.INTEGER) {
            return true;
        } else if (typeOne == VariableType.REAL && typeTwo == VariableType.REAL) {
            return true;
        } else
            return typeOne == VariableType.STRING && typeTwo == VariableType.STRING && operator == OperatorAddition.PLUS;

    }

    /**
     * resolves relational expression. Only allowed types are two types of the same type.
     * @param typeOne variable type one
     * @param typeTwo variable type two
     * @return true or false
     */
    private boolean resolveRelationalExpression(VariableType typeOne, VariableType typeTwo) {
        return typeOne == typeTwo;

    }

    /**
     * resolves logic expression. Only allowed types are two types of the same type.
     * @param typeOne variable type one
     * @param typeTwo variable type two
     * @return true or false
     */
    private boolean resolveLoginExpression(VariableType typeOne, VariableType typeTwo) {
        return typeOne == typeTwo;
    }


    /**
     * method to get equivalent of atom type as variable type
     * @param atom atom
     * @return variable type of given atom
     */
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
                }
            case STRING:
                return VariableType.STRING;
        }
        return null;
    }


}
