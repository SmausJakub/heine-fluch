package cz.zcu.kiv.fjp.abstracts;

/**
 * Abstract class of error
 * All errors extend this class
 */
public abstract class AbstractError {

    /**
     * Description of the error - type of error
     */
    protected String description;

    /**
     * message what went wrong
     */
    protected String message;

    /**
     * print error
     *
     * @return printed error
     */
    public String getError() {
        return description + "\n" + message;
    }

}
