package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorUnknownIdentifier extends AbstractError {

    public ErrorUnknownIdentifier(String identifier) {
        super(ErrorType.UNKNOWN_IDENTIFIER, "Unknown identifier " + identifier);
    }

}
