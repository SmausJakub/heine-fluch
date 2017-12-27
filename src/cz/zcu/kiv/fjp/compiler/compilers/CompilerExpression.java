package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.atoms.AtomBoolean;
import cz.zcu.kiv.fjp.compiler.types.atoms.AtomId;
import cz.zcu.kiv.fjp.compiler.types.atoms.AtomReal;
import cz.zcu.kiv.fjp.compiler.types.expressions.*;
import cz.zcu.kiv.fjp.enums.*;
import cz.zcu.kiv.fjp.errors.*;
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
     * expression to compile
     */
    private AbstractExpression expression;


    private boolean expectAnyType;

    /**
     * @param expression   expression to compile
     * @param expectedType expected type of expression
     */
    public CompilerExpression(AbstractExpression expression, VariableType expectedType) {
        this.expression = expression;
        this.expectedType = expectedType;
        this.expectAnyType = false;
    }

    public CompilerExpression(AbstractExpression expression) {
        this.expression = expression;
        this.expectAnyType = true;
    }

    /**
     * compiles expression
     */
    public VariableType compileExpression() {

        VariableType compiledType = compileExpressionRecursive(expression);

        if (expectAnyType) {
            return compiledType;
        }

        if (!(expectedType == compiledType)) {
            if (!(programMode == ProgramMode.DEFAULT && expectedType != VariableType.BOOLEAN)) {
                err.throwError(new ErrorIncompatibleTypes(expectedType.getValue(), compiledType.getValue()));
            } else {
                if (expectedType == VariableType.INTEGER && compiledType == VariableType.REAL) {
                    instructionList.add(new Instruction(InstructionCode.RTI.getName(), 0, 0));
                    compiledType = VariableType.INTEGER;
                } else if (expectedType == VariableType.REAL && compiledType == VariableType.INTEGER) {
                    instructionList.add(new Instruction(InstructionCode.ITR.getName(), 0, 0));
                    compiledType = VariableType.REAL;
                }
            }

        }

        return compiledType;


    }


    /**
     * recursive method for compiling expression
     * @param exp expression to compile
     */
    private VariableType compileExpressionRecursive(AbstractExpression exp) {

        switch (exp.getExpressionType()) {

            case UNARY:
                return compileExpressionUnary((ExpressionUnary) exp);
            case NOT:
                return compileExpressionNot((ExpressionNot) exp);
            case MULT:
                return compileExpressionMult((ExpressionMultiplication) exp);
            case ADD:
                return compileExpressionAdd((ExpressionAdditive) exp);
            case REL:
                return compileExpressionRel((ExpressionRelational) exp);
            case LOG:
                return compileExpressionLog((ExpressionLogic) exp);
            case ODD:
                return compileExpressionOdd((ExpressionOdd) exp);
            case PAR:
                ExpressionPar expressionPar = (ExpressionPar) exp;
                return compileExpressionRecursive(expressionPar.getExpression());
            case ATOM:
                ExpressionAtom expressionAtom = (ExpressionAtom) exp;
                VariableType type = getVariableTypeFromAtomType(expressionAtom.getAtom());
                new CompilerAtom(expressionAtom.getAtom()).compileAtom();
                return type;
        }

        return null;

    }

    private VariableType compileExpressionOdd(ExpressionOdd exp) {
        VariableType type = compileExpressionRecursive(exp.getExpression());

        resolveUnaryExpression(type);

        if (programMode == ProgramMode.LEGACY) {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.ODD.getCode()));
        } else if (programMode == ProgramMode.DEFAULT || programMode == ProgramMode.STRICT) {
            if (type == VariableType.INTEGER) {
                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.ODD.getCode()));
            } else if (type == VariableType.REAL) {
                instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, InstructionOperation.ODD.getCode()));
            }

        }

        return VariableType.BOOLEAN;
    }

    private VariableType compileExpressionLog(ExpressionLogic exp) {

        VariableType typeOne = compileExpressionRecursive(exp.getLeftExpression());
        VariableType typeTwo = compileExpressionRecursive(exp.getRightExpression());

        resolveLogicExpression(typeOne, typeTwo);

        instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.ADD.getCode()));

        if (exp.getOperator() == OperatorLogic.AND) {
            // AND
            instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 2));
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.EQ.getCode()));
        } else {
            // OR
            instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 1));
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.GE.getCode()));
        }

        return VariableType.BOOLEAN;

    }

    private VariableType compileExpressionRel(ExpressionRelational exp) {
        VariableType typeOne = compileExpressionRecursive(exp.getLeftExpression());
        VariableType typeTwo = compileExpressionRecursive(exp.getRightExpression());

        resolveComplexExpression(typeOne, typeTwo);

        switch (programMode) {
            case LEGACY:
                compileLegacyNumbers(getOpCodeFromOperatorRelation(exp.getOperator()));
                break;
            case DEFAULT:
                compileDefaultNumbers(typeOne, typeTwo, getOpCodeFromOperatorRelation(exp.getOperator()));
                break;
            case STRICT:
                compileStrictNumbers(typeOne, getOpCodeFromOperatorRelation(exp.getOperator()));
                break;
        }

        return VariableType.BOOLEAN;
    }

    private VariableType compileExpressionAdd(ExpressionAdditive exp) {
        VariableType typeOne = compileExpressionRecursive(exp.getLeftExpression());
        VariableType typeTwo = compileExpressionRecursive(exp.getRightExpression());

        resolveComplexExpression(typeOne, typeTwo);

        switch (programMode) {
            case LEGACY:
                return compileLegacyNumbers(getOpCodeFromOperatorAdditive(exp.getOperator()));
            case DEFAULT:
                return compileDefaultNumbers(typeOne, typeTwo, getOpCodeFromOperatorAdditive(exp.getOperator()));
            case STRICT:
                return compileStrictNumbers(typeOne, getOpCodeFromOperatorAdditive(exp.getOperator()));
        }

        return null;
    }

    private VariableType compileExpressionMult(ExpressionMultiplication exp) {
        VariableType typeOne = compileExpressionRecursive(exp.getLeftExpression());
        VariableType typeTwo = compileExpressionRecursive(exp.getRightExpression());

        resolveComplexExpression(typeOne, typeTwo);

        switch (programMode) {
            case LEGACY:
                return compileLegacyNumbers(getOpCodeFromOperatorMultiplication(exp.getOperator()));

            case DEFAULT:
                return compileDefaultNumbers(typeOne, typeTwo, getOpCodeFromOperatorMultiplication(exp.getOperator()));

            case STRICT:
                return compileStrictNumbers(typeOne, getOpCodeFromOperatorMultiplication(exp.getOperator()));

        }

        return null;


    }

    private VariableType compileDefaultNumbers(VariableType typeOne, VariableType typeTwo, int code) {

        if (typeOne == VariableType.INTEGER && typeTwo == VariableType.INTEGER) {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, code));
            return VariableType.INTEGER;
        } else if (typeOne == VariableType.REAL && typeTwo == VariableType.REAL) {
            instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, code));
            return VariableType.REAL;
        } else if (typeOne == VariableType.INTEGER && typeTwo == VariableType.REAL) {
            instructionList.add(new Instruction(InstructionCode.RTI.getName(), 0, 0));
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, code));
            return VariableType.INTEGER;
        } else if (typeOne == VariableType.REAL && typeTwo == VariableType.INTEGER) {
            instructionList.add(new Instruction(InstructionCode.ITR.getName(), 0, 0));
            instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, code));
            return VariableType.REAL;
        }
        return null;

    }

    private VariableType compileLegacyNumbers(int code) {
        instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, code));
        return VariableType.INTEGER;
    }

    private VariableType compileStrictNumbers(VariableType typeOne, int code) {
        if (typeOne == VariableType.INTEGER) {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, code));
            return VariableType.INTEGER;
        } else {
            instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, code));
            return VariableType.REAL;
        }
    }

    private VariableType compileExpressionNot(ExpressionNot exp) {
        VariableType type = compileExpressionRecursive(exp.getExpression());

        resolveNotExpression(type);
        instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, 0));
        instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.EQ.getCode()));

        return type;
    }

    private VariableType compileExpressionUnary(ExpressionUnary exp) {
        VariableType type = compileExpressionRecursive(exp.getExpression());

        resolveUnaryExpression(type);

        if (programMode == ProgramMode.LEGACY) {
            instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.NEG.getCode()));
        } else if (programMode == ProgramMode.DEFAULT || programMode == ProgramMode.STRICT) {
            if (type == VariableType.INTEGER) {
                instructionList.add(new Instruction(InstructionCode.OPR.getName(), 0, InstructionOperation.NEG.getCode()));
            } else if (type == VariableType.REAL) {
                instructionList.add(new Instruction(InstructionCode.OPF.getName(), 0, InstructionOperation.NEG.getCode()));
            }

        }

        return type;
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
            case MODULO:
                return InstructionOperation.MOD.getCode();
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
     * resolves unary expression. Only allowed type is INTEGER and REAL
     * @param type variable type
     * @return true or false
     */
    private void resolveUnaryExpression(VariableType type) {
        if (!(type == VariableType.INTEGER || type == VariableType.REAL)) {
            err.throwError(new ErrorExpressionVariableTypeMismatch(VariableType.INTEGER.getValue(), VariableType.REAL.getValue(), type.getValue()));

        }
    }

    /**
     * resolves not expression. Only allowed type is BOOLEAN.
     * @param type variable type
     * @return true or false
     */
    private void resolveNotExpression(VariableType type) {

        if (programMode == ProgramMode.LEGACY) {
            err.throwError(new ErrorLegacyNotExpression());
        } else {
            if (type != VariableType.BOOLEAN) {
                err.throwError(new ErrorExpressionVariableTypeMismatch(VariableType.BOOLEAN.getValue(), type.getValue()));
            }
        }
    }

    private void resolveComplexExpression(VariableType typeOne, VariableType typeTwo) {
        switch (programMode) {
            case DEFAULT:
                if (!((typeOne == VariableType.REAL || typeOne == VariableType.INTEGER) && ((typeTwo == VariableType.REAL || typeTwo == VariableType.INTEGER)))) {
                    err.throwError(new ErrorExpressionVariableTypeMismatch(VariableType.INTEGER.getValue(), VariableType.REAL.getValue(), typeOne.getValue(), typeTwo.getValue()));
                }
                break;
            case STRICT:
                if (!((typeOne == VariableType.INTEGER && typeTwo == VariableType.INTEGER) || (typeOne == VariableType.REAL && typeTwo == VariableType.REAL))) {
                    err.throwError(new ErrorExpressionVariableTypeMismatchStrict(VariableType.INTEGER.getValue(), VariableType.REAL.getValue(), typeOne.getValue(), typeTwo.getValue()));
                }
                break;
        }
    }

    /**
     * resolves logic expression. Only allowed types are two types of the same type.
     * @param typeOne variable type one
     * @param typeTwo variable type two
     * @return true or false
     */
    private void resolveLogicExpression(VariableType typeOne, VariableType typeTwo) {
        if (programMode == ProgramMode.LEGACY) {
            err.throwError(new ErrorLegacyLogicalExpression());
        } else {
            if (!(typeOne == VariableType.BOOLEAN && typeTwo == VariableType.BOOLEAN)) {
                err.throwError(new ErrorExpressionVariableTypeMismatch(VariableType.BOOLEAN.getValue(), VariableType.BOOLEAN.getValue(), typeOne.getValue(), typeTwo.getValue()));
            }
        }
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
                if (programMode == ProgramMode.LEGACY) {
                    AtomReal atomReal = (AtomReal) atom;
                    err.throwError(new ErrorLegacyRealConstant(String.valueOf(atomReal.getReal())));
                }
                return VariableType.REAL;
            case BOOLEAN:
                if (programMode == ProgramMode.LEGACY) {
                    AtomBoolean atomBoolean = (AtomBoolean) atom;
                    err.throwError(new ErrorLegacyBooleanConstant(String.valueOf(atomBoolean.isBool())));
                }
                return VariableType.BOOLEAN;
            case ID:
                AtomId atomId = (AtomId) atom;
                if (checkIfExists(atomId.getIdentifier()) && checkIfCanBeAccessed(atomId.getIdentifier())) {
                    SymbolTableItem item = symbolTable.getItem(atomId.getIdentifier());

                    if (item.getSize() == 1) {
                        return item.getVariableType();
                    } else {
                        err.throwError(new ErrorVariableNotInitialized(item.getName()));
                    }

                } else {
                    err.throwError(new ErrorUnknownIdentifier(atomId.getIdentifier()));
                }
        }
        return null;
    }


}
