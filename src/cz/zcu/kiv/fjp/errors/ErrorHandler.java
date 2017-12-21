package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.abstracts.AbstractLineNumbered;
import cz.zcu.kiv.fjp.instruction.Instruction;

public class ErrorHandler {

    private static final ErrorHandler INSTANCE = new ErrorHandler();

    private ErrorHandler() {
    }

    public static ErrorHandler getInstance() {
        return INSTANCE;
    }

    private AbstractLineNumbered currentPart;

    public void throwError(AbstractError error) {
        System.err.println(error.toString() + "\nAt line " + currentPart.getLineNumber() + " " + currentPart.toString());
        System.exit(error.getErrorType().getCode());
    }

    public void throwError(AbstractError error, Instruction instruction) {
        System.err.println(error.toString() + "\nAt " + instruction.toString());
        System.exit(error.getErrorType().getCode());
    }

    public void throwError(AbstractError error, int value) {
        System.err.println(error.toString() + "\nValue: " + value);
        System.exit(error.getErrorType().getCode());
    }

    public AbstractLineNumbered getCurrentPart() {
        return currentPart;
    }

    public void setCurrentPart(AbstractLineNumbered currentPart) {
        this.currentPart = currentPart;
    }
}
