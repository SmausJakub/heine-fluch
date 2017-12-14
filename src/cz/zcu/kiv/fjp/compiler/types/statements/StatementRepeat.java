package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * Repeat until statement
 * Created by visitors and compiled by compilers
 */
public class StatementRepeat extends AbstractStatement {

    /**
     * condition expression
     */
    private AbstractExpression condition;

    /**
     * statement
     */
    private AbstractStatement statement;

    /**
     * @param condition condition
     * @param statement statement
     * @param line      line number
     */
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
        builder.append(super.toString());
        builder.append("REPEAT ").append(statement.toString()).append(" UNTIL ").append(condition.toString());

        return builder.toString();
    }
}
