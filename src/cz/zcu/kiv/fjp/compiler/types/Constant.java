package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.abstracts.AbstractIdentifier;
import cz.zcu.kiv.fjp.enums.IdentifierType;

/**
 * Constant variable
 */
public class Constant extends AbstractIdentifier {

    /**
     * identifier
     */
    private String name;

    /**
     * @param name identifier
     */
    public Constant(String name) {
        super(IdentifierType.CONSTANT);
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
