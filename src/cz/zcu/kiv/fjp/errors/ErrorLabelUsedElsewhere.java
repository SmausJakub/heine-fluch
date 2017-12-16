package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLabelUsedElsewhere extends AbstractError {

    public ErrorLabelUsedElsewhere(String label) {
        super(ErrorType.LABEL_USED_ELSEWHERE, "Label " + label + " was used elsewhere in the program and can not be reused");
    }

}
