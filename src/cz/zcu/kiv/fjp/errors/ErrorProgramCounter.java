package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorProgramCounter extends AbstractError{

    public ErrorProgramCounter() {
        super(ErrorType.PROGRAM_COUNTER, "Program counter is out of range");
    }

}
