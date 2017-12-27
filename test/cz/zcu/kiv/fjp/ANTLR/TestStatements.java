package cz.zcu.kiv.fjp.ANTLR;

import cz.zcu.kiv.fjp.TestData;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static cz.zcu.kiv.fjp.TestData.file;
import static cz.zcu.kiv.fjp.TestData.testANTLRfile;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStatements {

    @Test
    public void TestAssignment1() {
        file = TestData.ANTLR_ASSIGNMENT1;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestAssignment2() {
        file = TestData.ANTLR_ASSIGNMENT2;
        testANTLRfile();
    }

    @Test
    public void TestAssignment3() {
        file = TestData.ANTLR_ASSIGNMENT3;
        testANTLRfile();
    }

    @Test
    public void TestCase1() {
        file = TestData.ANTLR_CASE1;
        testANTLRfile();
    }

    @Test
    public void TestCase2() {
        file = TestData.ANTLR_CASE2;
        testANTLRfile();
    }

    @Test
    public void TestCase3() {
        file = TestData.ANTLR_CASE3;
        testANTLRfile();
    }

    @Test
    public void TestCompound1() {
        file = TestData.ANTLR_COMPOUND1;
        testANTLRfile();
    }

    @Test
    public void TestCompound2() {
        file = TestData.ANTLR_COMPOUND2;
        testANTLRfile();
    }

    @Test
    public void TestDoWhile1() {
        file = TestData.ANTLR_DOWHILE1;
        testANTLRfile();
    }

    @Test
    public void TestDoWhile2() {
        file = TestData.ANTLR_DOWHILE2;
        testANTLRfile();
    }

    @Test
    public void TestFor1() {
        file = TestData.ANTLR_FOR1;
        testANTLRfile();
    }

    @Test
    public void TestFor2() {
        file = TestData.ANTLR_FOR2;
        testANTLRfile();
    }

    @Test
    public void TestGoto1() {
        file = TestData.ANTLR_GOTO1;
        testANTLRfile();
    }

    @Test
    public void TestGoto2() {
        file = TestData.ANTLR_GOTO2;
        testANTLRfile();
    }

    @Test
    public void TestIf1() {
        file = TestData.ANTLR_IF1;
        testANTLRfile();
    }

    @Test
    public void TestIf2() {
        file = TestData.ANTLR_IF2;
        testANTLRfile();
    }

    @Test
    public void TestIf3() {
        file = TestData.ANTLR_IF3;
        testANTLRfile();
    }

    @Test
    public void TestIO1() {
        file = TestData.ANTLR_IO1;
        testANTLRfile();
    }

    @Test
    public void TestIO2() {
        file = TestData.ANTLR_IO2;
        testANTLRfile();
    }

    @Test
    public void TestIO3() {
        file = TestData.ANTLR_IO3;
        testANTLRfile();
    }

    @Test
    public void TestProcedure1() {
        file = TestData.ANTLR_CALL1;
        testANTLRfile();
    }

    @Test
    public void TestProcedure2() {
        file = TestData.ANTLR_CALL2;
        testANTLRfile();
    }

    @Test
    public void TestRepeatUntil1() {
        file = TestData.ANTLR_REPEATUNTIL1;
        testANTLRfile();
    }

    @Test
    public void TestRepeatUntil2() {
        file = TestData.ANTLR_REPEATUNTIL2;
        testANTLRfile();
    }

    @Test
    public void TestWhileDo1() {
        file = TestData.ANTLR_WHILEDO1;
        testANTLRfile();
    }

    @Test
    public void TestWhileDo2() {
        file = TestData.ANTLR_WHILEDO2;
        testANTLRfile();
    }

}
