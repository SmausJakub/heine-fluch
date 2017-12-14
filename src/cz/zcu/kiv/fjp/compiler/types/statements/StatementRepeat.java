package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementRepeat extends AbstractStatement {

    private AbstractExpression condition;
    private AbstractStatement statement;

    public StatementRepeat(AbstractExpression condition, AbstractStatement statement, int line) {
        super(StatementType.REPEAT, line);
        this.statement = statement;
        this.condition = condition;
    }


    public AbstractExpression getCondition() {
        return condition;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isLabelled()) {
            builder.append(getLabel().getValue()).append(": ");
        }
        builder.append("REPEAT ").append(statement.toString()).append(" UNTIL ").append(condition.toString());

        return builder.toString();
    }
}
