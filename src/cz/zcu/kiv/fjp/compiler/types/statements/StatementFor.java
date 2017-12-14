package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.ForType;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * For statement
 * Created by visitors and compiled by compilers
 */
public class StatementFor extends AbstractStatement {

    /**
     * identifier
     */
    private String identifier;

    /**
     * expression from
     */
    private AbstractExpression from;

    /**
     * expression to
     */
    private AbstractExpression to;

    /**
     * statement
     */
    private AbstractStatement statement;

    /**
     * for type
     */
    private ForType type;

    /**
     * @param identifier identifier
     * @param from       expression from
     * @param to         expression to
     * @param statement  statement
     * @param type       for type
     * @param line       line number
     */
    public StatementFor(String identifier, AbstractExpression from, AbstractExpression to, AbstractStatement statement, ForType type, int line) {
        super(StatementType.FOR, line);
        this.identifier = identifier;
        this.from = from;
        this.to = to;
        this.statement = statement;
        this.type = type;
    }


    public String getIdentifier() {
        return identifier;
    }

    public AbstractExpression getFrom() {
        return from;
    }

    public AbstractExpression getTo() {
        return to;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    public ForType getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("FOR ").append(identifier).append(" := ").append(from.toString()).append(" ").append(type.getName()).append(" ").append(to.toString()).append(" ").append(statement.toString());


        return builder.toString();
    }
}
