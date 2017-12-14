package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorUnknownProcedure extends AbstractError {

    public ErrorUnknownProcedure(String procedure) {
        this.description = "UNKNOWN PROCEDURE ERROR";
        this.message = "Unknown procedure " + procedure;
    }

}
