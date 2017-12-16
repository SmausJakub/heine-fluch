package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLabelNotAllowedInForCycle extends AbstractError {

    public ErrorLabelNotAllowedInForCycle(String label) {
        super(ErrorType.LABEL_NOT_ALLOWED_IN_FOR_CYCLE, "Label " + label + " is not allowed in for cycle");
    }

}
