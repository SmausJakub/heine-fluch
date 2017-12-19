package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLegacyVarType extends AbstractError {

    public ErrorLegacyVarType() {
        super(ErrorType.LEGACY_VAR_TYPE, "Only var type is allowed in legacy mode");
    }

}
