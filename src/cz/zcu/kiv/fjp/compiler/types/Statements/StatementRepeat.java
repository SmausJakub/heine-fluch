package cz.zcu.kiv.fjp.compiler.types.Statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementRepeat extends AbstractStatement {

    private AbstractStatement statement;

    private AbstractExpression expression;

    public StatementRepeat() {
        super(StatementType.REPEAT);
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    public void setStatement(AbstractStatement statement) {
        this.statement = statement;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    public void setExpression(AbstractExpression expression) {
        this.expression = expression;
    }
}
