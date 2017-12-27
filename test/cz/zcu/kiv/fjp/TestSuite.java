package cz.zcu.kiv.fjp;

import cz.zcu.kiv.fjp.ANTLR.TestSuiteANTLR;
import cz.zcu.kiv.fjp.compiler.TestSuiteCompiler;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TestSuiteANTLR.class,
                TestSuiteCompiler.class}
)
public class TestSuite {
}
