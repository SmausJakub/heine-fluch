package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorParallelDeclarationNumberMismatch extends AbstractError {

    public ErrorParallelDeclarationNumberMismatch() {
        this.description = "PARALLEL DECLARATION NUMBER MISMATCH ERROR";
        this.message = "Number of variables needs to match the number of expressions";

    }
}
