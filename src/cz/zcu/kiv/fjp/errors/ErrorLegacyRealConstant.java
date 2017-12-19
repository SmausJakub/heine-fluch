package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorLegacyRealConstant extends AbstractError {

    public ErrorLegacyRealConstant(String real) {
        super(ErrorType.LEGACY_REAL_CONSTANT, "Legacy mode does not allow usage of real constant " + real);
    }
}
