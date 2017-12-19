package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLegacyNotExpression extends AbstractError {

    public ErrorLegacyNotExpression() {
        super(ErrorType.LEGACY_NOT_EXPRESSION, "Legacy mode does not allow usage of negation expression");
    }
}
