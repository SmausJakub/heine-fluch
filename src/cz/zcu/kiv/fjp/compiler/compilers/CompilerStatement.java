package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;

public class CompilerStatement {

    private AbstractStatement statement;

    public CompilerStatement(AbstractStatement statement) {
        this.statement = statement;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    public void compileStatement() {

    }

}
