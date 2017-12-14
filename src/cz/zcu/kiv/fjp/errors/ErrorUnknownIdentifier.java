package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorUnknownIdentifier extends AbstractError {

    public ErrorUnknownIdentifier(String identifier) {
        this.description = "UNKNOWN IDENTIFIER ERROR";
        this.message = "Unknown identifier " + identifier;
    }

}
