package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.DeclarationType;

public class AbstractDeclaration {

    private DeclarationType declarationType;

    public AbstractDeclaration(DeclarationType declarationType) {
        this.declarationType = declarationType;
    }

    public DeclarationType getDeclarationType() {
        return declarationType;
    }
}
