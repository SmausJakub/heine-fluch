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


    public DeclarationVariableParallel(List<Variable> variableList, List<AbstractExpression> expressionList, VariableType type, int line) {
        super(DeclarationType.VARIABLE_PARALLEL, line);
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

        StringBuilder builder = new StringBuilder();

        builder.append(type.getValue()).append(" ");

        for (int i = 0; i < variableList.size(); i++) {
            builder.append(variableList.get(i).getName());
            if (i + 1 < variableList.size()) {
                builder.append(", ");
            }
        }

        builder.append(" := [ ");

        for (int j = 0; j < expressionList.size(); j++) {
            builder.append(expressionList.get(j).toString());
            if (j + 1 < expressionList.size()) {
                builder.append(", ");
            }
        }

        builder.append(";");

        return builder.toString();
    }

}
