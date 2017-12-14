package cz.zcu.kiv.fjp.errors;


import cz.zcu.kiv.fjp.abstracts.AbstractError;

public class ErrorIncompatibleTypes extends AbstractError {

    public ErrorIncompatibleTypes(String expected, String found) {
        this.description = "INCOMPATIBLE TYPES ERROR";
        this.message = "Expected " + expected + " but found " + found;
    }


}
