package cz.zcu.kiv.fjp.interpreter;

import cz.zcu.kiv.fjp.TestData;
import cz.zcu.kiv.fjp.enums.ErrorType;
import cz.zcu.kiv.fjp.interpret.Interpreter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemErrRule;

import java.io.File;

import static cz.zcu.kiv.fjp.TestData.*;

public class TestErrors {


    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().muteForSuccessfulTests();

    private Interpreter interpreter = Interpreter.getInstance();


    @Test
    public void TestStackOverflow() {
        exit.expectSystemExitWithStatus(ErrorType.STACK_OVERFLOW.getCode());
        file = TestData.INTERPRETER_ERROR_STACK_OVERFLOW;
        doErrTest();
    }

    @Test
    public void TestUnknownInstruction() {
        exit.expectSystemExitWithStatus(ErrorType.UNKNOWN_INSTRUCTION.getCode());
        file = TestData.INTERPRETER_ERROR_UNKNOWN_INSTRUCTION;
        doErrTest();
    }


    private void doErrTest() {
        File insFile = readFile(file);
        try {
            interpreter.interpret(insFile, false, null, true);

        } catch (Exception e) {
        }
    }
}
