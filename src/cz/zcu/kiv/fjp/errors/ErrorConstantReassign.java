package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorConstantReassign extends AbstractError {

    public ErrorConstantReassign(String identifier) {
        this.description = "CONSTANT REASSIGN ERROR";
        this.message = "Constant " + identifier + " can not be reassigned";
    }

}
