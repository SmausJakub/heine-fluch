package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorNonLegacyVarType extends AbstractError {

    public ErrorNonLegacyVarType() {
        super(ErrorType.NON_LEGACY_VAR_TYPE, "Var type is not allowed in non-legacy mode");
    }
}
