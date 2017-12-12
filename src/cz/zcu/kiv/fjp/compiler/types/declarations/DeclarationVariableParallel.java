package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.enums.DeclarationType;
import cz.zcu.kiv.fjp.enums.VariableType;

import java.util.List;

public class DeclarationVariableParallel extends AbstractDeclaration {

    private List<Variable> variableList;
    private List<AbstractExpression> expressionList;

    private VariableType type;


    public DeclarationVariableParallel(List<Variable> variableList, List<AbstractExpression> expressionList, VariableType type) {
        super(DeclarationType.VARIABLE_PARALEL);
        this.variableList = variableList;
        this.expressionList = expressionList;
        this.type = type;
    }

    public VariableType getType() {
        return type;
    }

    public List<Variable> getVariableList() {
        return variableList;
    }

    public List<AbstractExpression> getExpressionList() {
        return expressionList;
    }

    public String toString() {
        return type.getValue() + " " + variableList.toString() + " := " + expressionList.toString();
    }

}
