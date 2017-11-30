package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.ForType;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementFor extends AbstractStatement {

    private String identifier;
    private AbstractExpression from;
    private AbstractExpression to;
    private AbstractStatement statement;

    private ForType type;


    public StatementFor(String identifier, AbstractExpression from, AbstractExpression to, AbstractStatement statement, ForType type) {
        super(StatementType.FOR);
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
        if (isLabelled()) {
            builder.append(getLabel().getValue()).append(": ");
        }
        builder.append("FOR ").append(identifier).append(" := ").append(from.toString()).append(" ").append(type.getName()).append(" ").append(to.toString()).append(" ").append(statement.toString());


        return builder.toString();
    }
}
