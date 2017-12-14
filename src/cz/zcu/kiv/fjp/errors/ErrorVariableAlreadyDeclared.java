package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorVariableAlreadyDeclared extends AbstractError {

    public ErrorVariableAlreadyDeclared(String identifier) {
        this.description = "VARIABLE ALREADY DECLARED ERROR";
        this.message = "Variable " + identifier + " is already declared";
    }
}
