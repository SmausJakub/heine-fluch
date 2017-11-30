package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

public class ExpressionNot extends AbstractExpression {

    private AbstractExpression expression;

    public ExpressionNot(AbstractExpression expression) {
        super(ExpressionType.NOT);
        this.expression = expression;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return " not " + expression.toString();
    }

}
