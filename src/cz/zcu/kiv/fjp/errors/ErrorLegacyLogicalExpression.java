package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLegacyLogicalExpression extends AbstractError {

    public ErrorLegacyLogicalExpression() {
        super(ErrorType.LEGACY_LOGICAL_EXPRESSION, "Legacy mode does not allow usage of logical expression");
    }
}
