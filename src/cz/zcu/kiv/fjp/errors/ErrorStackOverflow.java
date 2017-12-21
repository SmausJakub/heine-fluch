package cz.zcu.kiv.fjp.errors;


import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorStackOverflow extends AbstractError{

    public ErrorStackOverflow() {
        super(ErrorType.STACK_OVERFLOW, "Value in stack is not reachable");
    }

}
