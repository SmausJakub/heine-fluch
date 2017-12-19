package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

public class ExpressionOdd extends AbstractExpression {

    private AbstractExpression expression;

    public ExpressionOdd(AbstractExpression expression) {
        super(ExpressionType.ODD);
        this.expression = expression;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ODD " + expression.toString();
    }
}
