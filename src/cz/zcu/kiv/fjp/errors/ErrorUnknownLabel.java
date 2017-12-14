package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorUnknownLabel extends AbstractError {


    public ErrorUnknownLabel(String label) {
        this.description = "UNKNOWN LABEL ERROR";
        this.message = "Unknown label " + label;
    }
}
