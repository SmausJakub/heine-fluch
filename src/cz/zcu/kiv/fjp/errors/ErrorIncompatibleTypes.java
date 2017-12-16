package cz.zcu.kiv.fjp.errors;


import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorIncompatibleTypes extends AbstractError {

    public ErrorIncompatibleTypes(String expected, String found) {
        super(ErrorType.INCOMPATIBLE_TYPES, "Expected " + expected + " but found " + found);
    }


}
