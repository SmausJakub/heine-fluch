package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorLabelOutOfReach extends AbstractError {

    public ErrorLabelOutOfReach(String label) {
        this.description = "LABEL OUT OF REACH ERROR";
        this.message = "Label " + label + " is out of reach";
    }
}
