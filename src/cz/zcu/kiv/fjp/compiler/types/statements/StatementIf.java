package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * If statement
 * Created by visitors and compiled by compilers
 */
public class StatementIf extends AbstractStatement {

    /**
     * condition
     */
    private AbstractExpression condition;

    /**
     * else statement
     */
    private AbstractStatement elseStatement;

    /**
     * statement
     */
    private AbstractStatement statement;

    /**
     * constructor for if with else statement
     *
     * @param condition     condition expression
     * @param statement     statement
     * @param elseStatement else statement
     * @param line          line number
     */
    public StatementIf(AbstractExpression condition, AbstractStatement statement, AbstractStatement elseStatement, int line) {
        this(condition, statement, line);
        this.elseStatement = elseStatement;
    }

    /**
     * constructor for if statement w/o else
     * @param condition condition
     * @param statement statement
     * @param line line number
     */
    public StatementIf(AbstractExpression condition, AbstractStatement statement, int line) {
        super(StatementType.IF, line);
        this.condition = condition;
        this.statement = statement;
    }


    public AbstractExpression getCondition() {
        return condition;
    }

    public AbstractStatement getElseStatement() {
        return elseStatement;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("IF ").append(condition.toString()).append(" THEN ").append(statement.toString());
        if (elseStatement != null) {
            builder.append(" ELSE THEN ").append(elseStatement.toString());
        }

        return builder.toString();
    }
}
