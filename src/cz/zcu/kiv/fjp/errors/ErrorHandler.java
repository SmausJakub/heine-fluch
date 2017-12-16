package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.abstracts.AbstractLineNumbered;

public class ErrorHandler {

    private AbstractLineNumbered currentPart;

    public void throwError(AbstractError error) {
        System.err.println(error.toString() + "\nAt line " + currentPart.getLineNumber() + " " + currentPart.toString());
        System.exit(error.getErrorType().getCode());
    }

    public AbstractLineNumbered getCurrentPart() {
        return currentPart;
    }

    public void setCurrentPart(AbstractLineNumbered currentPart) {
        this.currentPart = currentPart;
    }
}
