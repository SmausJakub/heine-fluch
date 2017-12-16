package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorParallelDeclarationNumberMismatch extends AbstractError {

    public ErrorParallelDeclarationNumberMismatch() {
        super(ErrorType.PARALLEL_DECLARATION_NUMBER_MISMATCH, "Number of variables needs to match the number of expressions");

    }
}
