package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.enums.DeclarationType;

import java.util.List;

public class DeclarationVariableParalel extends AbstractDeclaration {

    private List<Variable> variableList;
    private List<AbstractExpression> expressionList;


    public DeclarationVariableParalel() {
        super(DeclarationType.VARIABLE_PARALEL);
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
}
