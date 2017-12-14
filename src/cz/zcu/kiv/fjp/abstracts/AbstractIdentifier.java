package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.IdentifierType;

/**
 * Abstract class of identifier
 * All classes which can be identified extend this class
 * Used to store the identifier type
 */
public abstract class AbstractIdentifier {

    /**
     * identifier type
     */
    private IdentifierType identifierType;

    /**
     * @param type identifier type
     */
    public AbstractIdentifier(IdentifierType type) {
        this.identifierType = type;
    }

    public IdentifierType getIdentifierType() {
        return identifierType;
    }
}
