package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorCaseMultipleAtoms extends AbstractError {

    public ErrorCaseMultipleAtoms(String atom) {
        super(ErrorType.CASE_MULTIPLE_ATOMS, "Atom " + atom + " was already used in case");
    }
}
