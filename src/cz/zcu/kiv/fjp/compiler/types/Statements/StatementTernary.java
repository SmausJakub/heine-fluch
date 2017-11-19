package cz.zcu.kiv.fjp.compiler.types.Statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementTernary extends AbstractStatement {

    private String identifier;

    private AbstractExpression firstExpression;
    private AbstractExpression secondExpression;

    public StatementTernary() {
        super(StatementType.TERNARY);
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public AbstractExpression getFirstExpression() {
        return firstExpression;
    }

    public void setFirstExpression(AbstractExpression firstExpression) {
        this.firstExpression = firstExpression;
    }

    public AbstractExpression getSecondExpression() {
        return secondExpression;
    }

    public void setSecondExpression(AbstractExpression secondExpression) {
        this.secondExpression = secondExpression;
    }
}
