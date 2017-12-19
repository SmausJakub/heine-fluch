package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLegacyBooleanConstant extends AbstractError {

    public ErrorLegacyBooleanConstant(String bool) {
        super(ErrorType.LEGACY_BOOLEAN_CONSTANT, "Legacy mode does not allow usage of bool constant " + bool);
    }
}
