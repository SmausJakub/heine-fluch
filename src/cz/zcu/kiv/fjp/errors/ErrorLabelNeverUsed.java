package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorLabelNeverUsed extends AbstractError {

    public ErrorLabelNeverUsed(String label) {
        this.description = "LABEL NEVER USED ERROR";
        this.message = "Label " + label + " was used in goto statement but never assigned in program";
    }

}
