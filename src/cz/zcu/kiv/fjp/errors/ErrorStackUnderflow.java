package cz.zcu.kiv.fjp.errors;


import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorStackUnderflow extends AbstractError{

    public ErrorStackUnderflow() {
        super(ErrorType.STACK_OVERFLOW, "Value can not be reached in stack");
    }
}
