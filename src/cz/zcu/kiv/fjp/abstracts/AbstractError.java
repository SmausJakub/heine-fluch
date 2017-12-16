package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.ErrorType;

/**
 * Abstract class of error
 * All errors extend this class
 */
public abstract class AbstractError {

    private String message;

    private ErrorType errorType;

    public AbstractError(ErrorType errorType, String message) {
        this.errorType = errorType;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("ERROR ").append(errorType.getCode()).append(": ").append(errorType.getDescription())
                .append("\n").append(message);

        return builder.toString();

    }

}
