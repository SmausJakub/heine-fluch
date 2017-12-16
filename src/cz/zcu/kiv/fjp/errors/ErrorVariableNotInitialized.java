package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorVariableNotInitialized extends AbstractError {

    public ErrorVariableNotInitialized(String identifier) {
        super(ErrorType.VARIABLE_NOT_INITIALIZED, "Variable " + identifier + " is not initialized");
    }

}
