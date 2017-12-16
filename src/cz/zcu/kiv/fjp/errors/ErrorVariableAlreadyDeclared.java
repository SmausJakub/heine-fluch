package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorVariableAlreadyDeclared extends AbstractError {

    public ErrorVariableAlreadyDeclared(String identifier) {
        super(ErrorType.VARIABLE_ALREADY_DECLARED, "Variable " + identifier + " is already declared");
    }
}
