package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorUnknownProcedure extends AbstractError {

    public ErrorUnknownProcedure(String procedure) {
        super(ErrorType.UNKNOWN_PROCEDURE, "Unknown procedure " + procedure);
    }

}
