package cz.zcu.kiv.fjp.interpreter;

import cz.zcu.kiv.fjp.TestData;
import cz.zcu.kiv.fjp.interpret.Interpreter;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runners.MethodSorters;

import java.io.File;

import static cz.zcu.kiv.fjp.TestData.file;
import static cz.zcu.kiv.fjp.TestData.readFile;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestComplex {


    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog().mute();

    private Interpreter interpreter = Interpreter.getInstance();

    @Test
    public void TestItr() {
        file = TestData.INTERPRETER_ITR;

        doFloatTest(6.0);
    }

    @Test
    public void TestRti() {
        file = TestData.INTERPRETER_RTI;

        doIntTest(6);
    }

    @Test
    public void TestPld() {
        file = TestData.INTERPRETER_PLD;

        doIntTest(8);
    }

    @Test
    public void TestDel() {
        file = TestData.INTERPRETER_DEL;

        doIntTest(0);
    }

    @Test
    public void TestNew() {
        file = TestData.INTERPRETER_NEW;

        doIntTest(10);
    }

    @Test
    public void TestOpr1() {
        file = TestData.INTERPRETER_OPR1;

        doIntTest(-4);
    }

    @Test
    public void TestOpr2() {
        file = TestData.INTERPRETER_OPR2;

        doIntTest(10);
    }

    @Test
    public void TestOpr3() {
        file = TestData.INTERPRETER_OPR3;

        doIntTest(-2);
    }

    @Test
    public void TestOpr4() {
        file = TestData.INTERPRETER_OPR4;

        doIntTest(24);
    }

    @Test
    public void TestOpr5() {
        file = TestData.INTERPRETER_OPR5;

        doIntTest(2);
    }

    @Test
    public void TestOpr6() {
        file = TestData.INTERPRETER_OPR6;

        doIntTest(1);
    }

    @Test
    public void TestOpr7() {
        file = TestData.INTERPRETER_OPR7;

        doIntTest(2);
    }

    @Test
    public void TestOpr8() {
        file = TestData.INTERPRETER_OPR8;

        doIntTest(0);
    }

    @Test
    public void TestOpr9() {
        file = TestData.INTERPRETER_OPR9;

        doIntTest(1);
    }

    @Test
    public void TestOpr10() {
        file = TestData.INTERPRETER_OPR10;

        doIntTest(1);
    }

    @Test
    public void TestOpr11() {
        file = TestData.INTERPRETER_OPR11;

        doIntTest(0);
    }

    @Test
    public void TestOpr12() {
        file = TestData.INTERPRETER_OPR12;

        doIntTest(0);
    }

    @Test
    public void TestOpr13() {
        file = TestData.INTERPRETER_OPR13;

        doIntTest(1);
    }

    @Test
    public void TestJmc0() {
        file = TestData.INTERPRETER_JMC0;

        doIntTest(8);
    }

    @Test
    public void TestJmc1() {
        file = TestData.INTERPRETER_JMC1;

        doIntTest(3);
    }

    @Test
    public void TestJmp() {
        file = TestData.INTERPRETER_JMP;

        doIntTest(3);
    }

    @Test
    public void TestOpf1() {
        file = TestData.INTERPRETER_OPF1;

        doFloatTest(-4.5);
    }

    @Test
    public void TestOpf2() {
        file = TestData.INTERPRETER_OPF2;

        doFloatTest(10.9);
    }

    @Test
    public void TestOpf3() {
        file = TestData.INTERPRETER_OPF3;

        doFloatTest(-1.2);
    }

    @Test
    public void TestOpf4() {
        file = TestData.INTERPRETER_OPF4;

        doFloatTest(4.05);
    }

    @Test
    public void TestOpf5() {
        file = TestData.INTERPRETER_OPF5;

        doFloatTest(2.0);
    }


    @Test
    public void TestOpf8() {
        file = TestData.INTERPRETER_OPF8;

        doFloatTest(0.0);
    }

    @Test
    public void TestOpf9() {
        file = TestData.INTERPRETER_OPF9;

        doFloatTest(1.0);
    }

    @Test
    public void TestOpf10() {
        file = TestData.INTERPRETER_OPF10;

        doFloatTest(1.0);
    }

    @Test
    public void TestOpf11() {
        file = TestData.INTERPRETER_OPF11;

        doFloatTest(0.0);
    }

    @Test
    public void TestOpf12() {
        file = TestData.INTERPRETER_OPF12;

        doFloatTest(0.0);
    }

    @Test
    public void TestOpf13() {
        file = TestData.INTERPRETER_OPF13;

        doFloatTest(1.0);
    }


    private void doIntTest(int value) {
        File insFile = readFile(file);
        try {

            interpreter.interpret(insFile, false, null, true);
            assertEquals(String.valueOf(value),systemOutRule.getLog().trim() );
            systemOutRule.clearLog();

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    private void doFloatTest(double value) {
        File insFile = readFile(file);
        try {

            interpreter.interpret(insFile, false, null, true);
            assertEquals(String.valueOf(value),systemOutRule.getLog().trim() );
            systemOutRule.clearLog();

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}


