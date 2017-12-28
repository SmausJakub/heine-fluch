package cz.zcu.kiv.fjp.ANTLR;

import cz.zcu.kiv.fjp.TestData;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static cz.zcu.kiv.fjp.TestData.file;
import static cz.zcu.kiv.fjp.TestData.testANTLRfile;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestProgram {


    @Test(expected = ParseCancellationException.class)
    public void TestBadProgramMode() {
        file = TestData.ANTLR_BAD_PROGRAM_MODE;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestNoProgramHeading1() {
        file = TestData.ANTLR_NO_PROGRAM_HEADING1;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestNoProgramHeading2() {
        file = TestData.ANTLR_NO_PROGRAM_HEADING2;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestNoProgramName() {
        file = TestData.ANTLR_NO_PROGRAM_NAME;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestNoStatement() {
        file = TestData.ANTLR_NO_PROGRAM_STATEMENT;
        testANTLRfile();
    }

    @Test
    public void TestNoProgramMode() {
        file = TestData.ANTLR_NO_PROGRAM_MODE;
        testANTLRfile();
    }

    @Test
    public void TestProgramModeLegacy() {
        file = TestData.ANTLR_PROGRAM_LEGACY;
        testANTLRfile();
    }

    @Test
    public void TestProgramModeDefault() {
        file = TestData.ANTLR_PROGRAM_STRICT;
        testANTLRfile();
    }

    @Test
    public void TestProgramModeStrict() {
        file = TestData.ANTLR_PROGRAM_DEFAULT;
        testANTLRfile();
    }


}
