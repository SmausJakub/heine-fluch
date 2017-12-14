package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorVariableNotInitialized extends AbstractError {

    public ErrorVariableNotInitialized(String identifier) {
        this.description = "VARIABLE NOT INITIALIZED ERROR";
        this.message = "Variable " + identifier + " is not initialized";
    }

}
