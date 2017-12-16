package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorUnknownLabel extends AbstractError {


    public ErrorUnknownLabel(String label) {
        super(ErrorType.UNKNOWN_LABEL, "Unknown label " + label);
    }
}
