package cz.zcu.kiv.fjp.ANTLR;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TestProgram.class,
                TestDeclarations.class,
                TestExpressions.class,
                TestStatements.class}
)
public class TestSuiteANTLR {

}
