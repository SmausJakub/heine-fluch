package cz.zcu.kiv.fjp.errors;

public class ErrorHandler {

    private Object currentPart;

    public void throwError(String message) {

        System.err.println("Error at " + currentPart + "\n" + message);
        System.exit(1);

    }

    public Object getCurrentPart() {
        return currentPart;
    }

    public void setCurrentPart(Object currentPart) {
        this.currentPart = currentPart;
    }
}
