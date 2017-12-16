package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorCannotAssignLoopVariable extends AbstractError {

    public ErrorCannotAssignLoopVariable(String variable) {
        super(ErrorType.CANNOT_ASSIGN_LOOP_VARIABLE, "Can not assign loop variable " + variable);
    }

}
