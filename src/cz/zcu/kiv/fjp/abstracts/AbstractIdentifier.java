package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.IdentifierType;

public abstract class AbstractIdentifier {

    private IdentifierType identifierType;

    public AbstractIdentifier(IdentifierType type) {
        this.identifierType = type;
    }

    public IdentifierType getIdentifierType() {
        return identifierType;
    }
}
