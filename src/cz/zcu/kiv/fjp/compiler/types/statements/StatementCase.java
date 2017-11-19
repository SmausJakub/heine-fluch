package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.CaseLimb;
import cz.zcu.kiv.fjp.enums.StatementType;

import java.util.List;

public class StatementCase extends AbstractStatement {

    private AbstractExpression expression;

    private List<CaseLimb> caseLimbList;

    public StatementCase() {
        super(StatementType.CASE);
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    public void setExpression(AbstractExpression expression) {
        this.expression = expression;
    }

    public List<CaseLimb> getCaseLimbList() {
        return caseLimbList;
    }

    public void setCaseLimbList(List<CaseLimb> caseLimbList) {
        this.caseLimbList = caseLimbList;
    }
}
