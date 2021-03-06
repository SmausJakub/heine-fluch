package cz.zcu.kiv.fjp;

import cz.zcu.kiv.fjp.ANTLR.TestSuiteANTLR;
import cz.zcu.kiv.fjp.compiler.TestSuiteCompiler;
import cz.zcu.kiv.fjp.interpreter.TestSuiteInterpreter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TestSuiteANTLR.class,
                TestSuiteCompiler.class,
                TestSuiteInterpreter.class}
)
public class TestSuite {
}
