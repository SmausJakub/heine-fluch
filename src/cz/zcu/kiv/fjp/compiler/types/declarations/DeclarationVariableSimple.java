package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.enums.DeclarationType;

import java.util.List;

public class DeclarationVariableSimple extends AbstractDeclaration {

    private List<Variable> variableList;
    private List<AbstractExpression> expressionList;

    private boolean init = false;


    public DeclarationVariableSimple() {
        super(DeclarationType.VARIABLE);
    }

    public List<Variable> getVariableList() {
        return variableList;
    }

    public void setVariableList(List<Variable> variableList) {
        this.variableList = variableList;
    }

    public List<AbstractExpression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<AbstractExpression> expressionList) {
        this.expressionList = expressionList;
    }

    public boolean isInit() {
        return init;
    }

    public void setInit(boolean init) {
        this.init = init;
    }

    public String toString() {
        return "init " + init ;
    }

}
