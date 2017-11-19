package cz.zcu.kiv.fjp.compiler.types.Statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.ForType;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementFor extends AbstractStatement {

    private String identifier;

    private ForType type;

    private AbstractExpression fromExpression;

    private AbstractExpression toExpression;

    private AbstractStatement statement;


    public StatementFor() {
        super(StatementType.FOR);
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ForType getType() {
        return type;
    }

    public void setType(ForType type) {
        this.type = type;
    }

    public AbstractExpression getFromExpression() {
        return fromExpression;
    }

    public void setFromExpression(AbstractExpression fromExpression) {
        this.fromExpression = fromExpression;
    }

    public AbstractExpression getToExpression() {
        return toExpression;
    }

    public void setToExpression(AbstractExpression toExpression) {
        this.toExpression = toExpression;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    public void setStatement(AbstractStatement statement) {
        this.statement = statement;
    }
}
