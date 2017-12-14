package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.Constant;
import cz.zcu.kiv.fjp.enums.DeclarationType;
import cz.zcu.kiv.fjp.enums.VariableType;

import java.util.List;

/**
 * Declaration of constant
 */
public class DeclarationConstant extends AbstractDeclaration {

    /**
     * list of constant variables
     */
    private List<Constant> constantList;

    /**
     * assigned value
     */
    private AbstractAtom value;

    /**
     * variable type
     */
    private VariableType type;

    /**
     * @param constantList list of constant variables
     * @param type         variable type
     * @param atom         assigned value
     * @param line         line number
     */
    public DeclarationConstant(List<Constant> constantList, VariableType type, AbstractAtom atom, int line) {
        super(DeclarationType.CONSTANT, line);
        this.constantList = constantList;
        this.value = atom;
        this.type = type;
    }

    public VariableType getType() {
        return type;
    }

    public List<Constant> getConstantList() {
        return constantList;
    }

    public AbstractAtom getValue() {
        return value;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("CONST ").append(type.getValue()).append(" ");

        for (int i = 0; i < constantList.size(); i++) {
            builder.append(constantList.get(i).getName());
            if (i + 1 < constantList.size()) {
                builder.append(", ");
            }
        }

        builder.append(" := ").append(value.toString()).append(";");

        return builder.toString();
    }

}
