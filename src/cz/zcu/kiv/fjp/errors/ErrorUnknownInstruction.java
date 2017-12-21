package cz.zcu.kiv.fjp.errors;

import cz.zcu.kiv.fjp.abstracts.AbstractError;
import cz.zcu.kiv.fjp.enums.ErrorType;

public class ErrorUnknownInstruction extends AbstractError{

    public ErrorUnknownInstruction() {
        super(ErrorType.UNKNOWN_INSTRUCTION, "Instruction does not exist");
    }
}
