package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementDoWhile extends AbstractStatement {


    private AbstractExpression expression;

    private AbstractStatement statement;

    public StatementDoWhile() {
        super(StatementType.DO_WHILE);
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
}
