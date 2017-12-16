package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorConstantReassign extends AbstractError {

    public ErrorConstantReassign(String identifier) {
        super(ErrorType.CONSTANT_REASSIGN, "Constant " + identifier + " can not be reassigned");
    }

}
