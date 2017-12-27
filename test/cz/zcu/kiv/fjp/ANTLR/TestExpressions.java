package cz.zcu.kiv.fjp.ANTLR;

import cz.zcu.kiv.fjp.TestData;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static cz.zcu.kiv.fjp.TestData.file;
import static cz.zcu.kiv.fjp.TestData.testANTLRfile;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExpressions {

    @Test
    public void TestAdd1() {
        file = TestData.ANTLR_ADD1;
        testANTLRfile();
    }

    @Test
    public void TestAdd2() {
        file = TestData.ANTLR_ADD2;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestAdd3() {
        file = TestData.ANTLR_ADD3;
        testANTLRfile();
    }

    @Test
    public void TestAtom1() {
        file = TestData.ANTLR_ATOM1;
        testANTLRfile();
    }

    @Test
    public void TestAtom2() {
        file = TestData.ANTLR_ATOM2;
        testANTLRfile();
    }

    @Test
    public void TestAtom3() {
        file = TestData.ANTLR_ATOM3;
        testANTLRfile();
    }

    @Test
    public void TestAtom4() {
        file = TestData.ANTLR_ATOM4;
        testANTLRfile();
    }

    @Test
    public void TestComplex() {
        file = TestData.ANTLR_EXP_COMPLEX;
        testANTLRfile();
    }

    @Test
    public void TestLog1() {
        file = TestData.ANTLR_LOG1;
        testANTLRfile();
    }

    @Test
    public void TestLog2() {
        file = TestData.ANTLR_LOG2;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestLog3() {
        file = TestData.ANTLR_LOG3;
        testANTLRfile();
    }

    @Test
    public void TestMulti1() {
        file = TestData.ANTLR_MULTI1;
        testANTLRfile();
    }

    @Test
    public void TestMulti2() {
        file = TestData.ANTLR_MULTI2;
        testANTLRfile();
    }

    @Test
    public void TestMulti3() {
        file = TestData.ANTLR_MULTI3;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestMulti4() {
        file = TestData.ANTLR_MULTI4;
        testANTLRfile();
    }

    @Test
    public void TestNot1() {
        file = TestData.ANTLR_NOT1;
        testANTLRfile();
    }

    @Test
    public void TestNot2() {
        file = TestData.ANTLR_NOT2;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestNot3() {
        file = TestData.ANTLR_NOT3;
        testANTLRfile();
    }

    @Test
    public void TestOdd1() {
        file = TestData.ANTLR_ODD1;
        testANTLRfile();
    }

    @Test
    public void TestOdd2() {
        file = TestData.ANTLR_ODD2;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestOdd3() {
        file = TestData.ANTLR_ODD3;
        testANTLRfile();
    }

    @Test
    public void TestRel1() {
        file = TestData.ANTLR_REL1;
        testANTLRfile();
    }

    @Test
    public void TestRel2() {
        file = TestData.ANTLR_REL2;
        testANTLRfile();
    }

    @Test
    public void TestRel3() {
        file = TestData.ANTLR_REL3;
        testANTLRfile();
    }

    @Test
    public void TestRel4() {
        file = TestData.ANTLR_REL4;
        testANTLRfile();
    }

    @Test
    public void TestRel5() {
        file = TestData.ANTLR_REL5;
        testANTLRfile();
    }

    @Test
    public void TestRel6() {
        file = TestData.ANTLR_REL6;
        testANTLRfile();
    }

    @Test(expected = ParseCancellationException.class)
    public void TestRel7() {
        file = TestData.ANTLR_REL7;
        testANTLRfile();
    }

    @Test
    public void TestUnary1() {
        file = TestData.ANTLR_UNARY1;
        testANTLRfile();
    }

    @Test
    public void TestUnary2() {
        file = TestData.ANTLR_UNARY2;
        testANTLRfile();
    }


}
