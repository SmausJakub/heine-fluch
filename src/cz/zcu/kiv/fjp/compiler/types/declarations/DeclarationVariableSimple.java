package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.enums.DeclarationType;
import cz.zcu.kiv.fjp.enums.VariableType;

import java.util.List;

public class DeclarationVariableSimple extends AbstractDeclaration {

    private List<Variable> variableList;
    private AbstractExpression expression;

    private boolean init;

    private VariableType type;

    public DeclarationVariableSimple(List<Variable> variableList, VariableType type) {
        super(DeclarationType.VARIABLE);
        this.variableList = variableList;
        this.type = type;
        this.init = false;
    }


    public DeclarationVariableSimple(List<Variable> variableList, AbstractExpression expression, VariableType type) {
        super(DeclarationType.VARIABLE);
        this.expression = expression;
        this.variableList = variableList;
        this.type = type;
        this.init = true;
    }

    public List<Variable> getVariableList() {
        return variableList;
    }

    public boolean isInit() {
        return init;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    @Override
    public String toString() {

        if (init) {
            return type.getValue() + " " + variableList.toString() + " := " + expression.toString();
        } else {
            return type.getValue() + " " + variableList.toString();
        }
    }


}
