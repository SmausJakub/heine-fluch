package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.enums.DeclarationType;
import cz.zcu.kiv.fjp.enums.VariableType;

import java.util.List;

/**
 * Declaration of simple variables
 */
public class DeclarationVariableSimple extends AbstractDeclaration {

    /**
     * variable list
     */
    private List<Variable> variableList;

    /**
     * expression
     */
    private AbstractExpression expression;

    /**
     * initialization
     */
    private boolean init;

    /**
     * variable type
     */
    private VariableType type;

    /**
     * constructor for uninitialized variables
     *
     * @param variableList list of variables
     * @param type         variable type
     * @param line         line number
     */
    public DeclarationVariableSimple(List<Variable> variableList, VariableType type, int line) {
        super(DeclarationType.VARIABLE, line);
        this.variableList = variableList;
        this.type = type;
        this.init = false;
    }

    /**
     * constructor for initialized variables
     * @param variableList list of variables
     * @param expression expression
     * @param type variable type
     * @param line line number
     */
    public DeclarationVariableSimple(List<Variable> variableList, AbstractExpression expression, VariableType type, int line) {
        super(DeclarationType.VARIABLE, line);
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

    public VariableType getType() {
        return type;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(type.getValue()).append(" ");

        for (int i = 0; i < variableList.size(); i++) {
            builder.append(variableList.get(i).getName());
            if (i + 1 < variableList.size()) {
                builder.append(", ");
            }
        }

        if (init) {
            builder.append(" := ").append(expression.toString());
        }

        builder.append(";");
        return builder.toString();
    }


}
