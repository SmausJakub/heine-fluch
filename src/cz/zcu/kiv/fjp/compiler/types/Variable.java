package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.abstracts.AbstractIdentifier;
import cz.zcu.kiv.fjp.enums.IdentifierType;

/**
 * Varible
 */
public class Variable extends AbstractIdentifier {

    /**
     * identifier
     */
    private String name;

    /**
     * @param name identifier
     */
    public Variable(String name) {
        super(IdentifierType.VARIABLE);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
