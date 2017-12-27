package cz.zcu.kiv.fjp.ANTLR;

import cz.zcu.kiv.fjp.TestData;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static cz.zcu.kiv.fjp.TestData.file;
import static cz.zcu.kiv.fjp.TestData.testANTLRfile;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDeclarations {


    @Test(expected = ParseCancellationException.class)
    public void TestLabelBoolean() {
        file = TestData.ANTLR_LABEL_BOOLEAN;
        testANTLRfile();
    }

    @Test
    public void TestLabelInt1() {
        file = TestData.ANTLR_LABEL_INT1;
        testANTLRfile();
    }

    @Test
    public void TestLabelInt2() {
        file = TestData.ANTLR_LABEL_INT2;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestLabelReal() {
        file = TestData.ANTLR_LABEL_REAL;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestProcedure1() {
        file = TestData.ANTLR_PROCEDURE1;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestProcedure2() {
        file = TestData.ANTLR_PROCEDURE2;
        testANTLRfile();
    }

    @Test
    public void TestProcedure3() {
        file = TestData.ANTLR_PROCEDURE3;
        testANTLRfile();
    }

    @Test
    public void TestVariableBoolean1() {
        file = TestData.ANTLR_VARIABLE_BOOLEAN1;
        testANTLRfile();
    }

    @Test
    public void TestVariableBoolean2() {
        file = TestData.ANTLR_VARIABLE_BOOLEAN2;
        testANTLRfile();
    }

    @Test
    public void TestVariableBoolean3() {
        file = TestData.ANTLR_VARIABLE_BOOLEAN3;
        testANTLRfile();
    }

    @Test
    public void TestVariableBoolean4() {
        file = TestData.ANTLR_VARIABLE_BOOLEAN4;
        testANTLRfile();
    }

    @Test
    public void TestVariableInteger1() {
        file = TestData.ANTLR_VARIABLE_INTEGER1;
        testANTLRfile();
    }

    @Test
    public void TestVariableInteger2() {
        file = TestData.ANTLR_VARIABLE_INTEGER2;
        testANTLRfile();
    }

    @Test
    public void TestVariableInteger3() {
        file = TestData.ANTLR_VARIABLE_INTEGER3;
        testANTLRfile();
    }

    @Test
    public void TestVariableInteger4() {
        file = TestData.ANTLR_VARIABLE_INTEGER4;
        testANTLRfile();
    }

    @Test
    public void TestVariableLegacy1() {
        file = TestData.ANTLR_VARIABLE_LEGACY1;
        testANTLRfile();
    }

    @Test
    public void TestVariableLegacy2() {
        file = TestData.ANTLR_VARIABLE_LEGACY2;
        testANTLRfile();
    }

    @Test
    public void TestVariableLegacy3() {
        file = TestData.ANTLR_VARIABLE_LEGACY3;
        testANTLRfile();
    }

    @Test
    public void TestVariableLegacy4() {
        file = TestData.ANTLR_VARIABLE_LEGACY4;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestVariableNoType1() {
        file = TestData.ANTLR_VARIABLE_NO_TYPE1;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestVariableNoType2() {
        file = TestData.ANTLR_VARIABLE_NO_TYPE2;
        testANTLRfile();
    }

    @Test
    public void TestVariableParallel1() {
        file = TestData.ANTLR_VARIABLE_PARALLEL1;
        testANTLRfile();
    }

    @Test
    public void TestVariableParallel2() {
        file = TestData.ANTLR_VARIABLE_PARALLEL2;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestIdentifierOnly() {
        file = TestData.ANTLR_IDENTIFIER_ONLY;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestVariableBadType() {
        file = TestData.ANTLR_VARIABLE_BAD_TYPE;
        testANTLRfile();
    }

    @Test
    public void TestVariableReal1() {
        file = TestData.ANTLR_VARIABLE_REAL1;
        testANTLRfile();
    }

    @Test
    public void TestVariableReal2() {
        file = TestData.ANTLR_VARIABLE_REAL2;
        testANTLRfile();
    }

    @Test
    public void TestVariableReal3() {
        file = TestData.ANTLR_VARIABLE_REAL3;
        testANTLRfile();
    }

    @Test
    public void TestVariableReal4() {
        file = TestData.ANTLR_VARIABLE_REAL4;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestConstant1() {
        file = TestData.ANTLR_CONSTANT1;
        testANTLRfile();
    }

    @Test
    public void TestConstant2() {
        file = TestData.ANTLR_CONSTANT2;
        testANTLRfile();
    }

    @Test
    public void TestConstant3() {
        file = TestData.ANTLR_CONSTANT3;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestConstant4() {
        file = TestData.ANTLR_CONSTANT4;
        testANTLRfile();
    }


}
