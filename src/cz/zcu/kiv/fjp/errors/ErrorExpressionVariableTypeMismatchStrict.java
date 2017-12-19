package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorExpressionVariableTypeMismatchStrict extends AbstractError {

    public ErrorExpressionVariableTypeMismatchStrict(String firstExpected, String secondExpected, String firstFound, String secondFound) {
        super(ErrorType.EXPRESSION_VARIABLE_TYPE_MISMATCH_STRICT, "Strict mode expects two " + firstExpected + " or two " + secondExpected + " but found " + firstFound + " and " + secondFound);
    }

}
