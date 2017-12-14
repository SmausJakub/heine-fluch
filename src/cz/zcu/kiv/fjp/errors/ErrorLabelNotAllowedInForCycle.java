package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorLabelNotAllowedInForCycle extends AbstractError {

    public ErrorLabelNotAllowedInForCycle(String label) {
        this.description = "LABEL NOT ALLOWED IN FOR CYCLE ERROR";
        this.message = "Label " + label + " is not allowed in for cycle";
    }

}
