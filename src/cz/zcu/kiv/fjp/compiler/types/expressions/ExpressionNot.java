package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

public class ExpressionNot extends AbstractExpression {

    private AbstractExpression expression;

    public ExpressionNot() {
        super(ExpressionType.NOT);
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    public void setExpression(AbstractExpression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return " not " + expression;
    }

}
