package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorCaseNoBoolean extends AbstractError {

    public ErrorCaseNoBoolean() {
        super(ErrorType.CASE_NO_BOOLEAN, "Case statement does not support boolean type");
    }
}
