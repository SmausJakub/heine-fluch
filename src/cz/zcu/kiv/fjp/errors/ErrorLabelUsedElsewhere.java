package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorLabelUsedElsewhere extends AbstractError {

    public ErrorLabelUsedElsewhere(String label) {
        this.description = "LABEL USED ELSEWHERE ERROR";
        this.message = "Label " + label + " was used elsewhere in the program and can not be reused";
    }

}
