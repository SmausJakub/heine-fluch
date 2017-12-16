package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLabelNeverUsed extends AbstractError {

    public ErrorLabelNeverUsed(String label) {
        super(ErrorType.LABEL_NEVER_USED, "Label " + label + " was used in goto statement but never assigned in program");
    }

}
