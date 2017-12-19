package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorExpressionVariableTypeMismatch extends AbstractError {

    public ErrorExpressionVariableTypeMismatch(String expected, String found) {
        super(ErrorType.EXPRESSION_VARIABLE_TYPE_MISMATCH, "Expected " + expected + " but found " + found);
    }

    public ErrorExpressionVariableTypeMismatch(String firstExpected, String secondExpoected, String found) {
        super(ErrorType.EXPRESSION_VARIABLE_TYPE_MISMATCH, "Expected " + firstExpected + " or " + secondExpoected + " but found " + found);
    }

    public ErrorExpressionVariableTypeMismatch(String firstExpected, String secondExpected, String firstFound, String secondFound) {
        super(ErrorType.EXPRESSION_VARIABLE_TYPE_MISMATCH, "Expected mix of " + firstExpected + " and " + secondExpected + " but found " + firstFound + " and " + secondFound);
    }

}
