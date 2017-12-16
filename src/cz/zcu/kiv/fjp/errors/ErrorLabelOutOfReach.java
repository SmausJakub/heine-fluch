package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLabelOutOfReach extends AbstractError {

    public ErrorLabelOutOfReach(String label) {
        super(ErrorType.LABEL_OUT_OF_REACH, "Label " + label + " is out of reach");
    }
}
