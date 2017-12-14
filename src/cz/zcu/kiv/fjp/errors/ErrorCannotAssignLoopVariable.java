package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorCannotAssignLoopVariable extends AbstractError {

    public ErrorCannotAssignLoopVariable(String variable) {
        this.description = "CAN NOT ASSIGN LOOP VARIABLE ERROR";
        this.message = "Can not assign loop variable " + variable;
    }

}
