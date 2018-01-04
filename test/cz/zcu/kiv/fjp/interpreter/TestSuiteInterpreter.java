package cz.zcu.kiv.fjp.interpreter;


import cz.zcu.kiv.fjp.compiler.TestErrors;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TestErrors.class,
                TestComplex.class}
)
public class TestSuiteInterpreter {
}
