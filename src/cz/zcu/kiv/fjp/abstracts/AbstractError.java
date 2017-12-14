package cz.zcu.kiv.fjp.abstracts;

public abstract class AbstractError {

    protected String description;

    protected String message;

    public String getError() {
        return description + "\n" + message;
    }

}
