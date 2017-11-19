package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementIf extends AbstractStatement {

    private AbstractExpression expression;

    private AbstractStatement statement;

    private AbstractStatement elseStatement;

    public StatementIf() {
        super(StatementType.IF);
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    public void setExpression(AbstractExpression expression) {
        this.expression = expression;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    public void setStatement(AbstractStatement statement) {
        this.statement = statement;
    }

    public AbstractStatement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(AbstractStatement elseStatement) {
        this.elseStatement = elseStatement;
    }
}
