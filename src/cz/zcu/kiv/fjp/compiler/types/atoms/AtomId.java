package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

/**
 * Atom of type identifier
 * Used to store a name of the identifier
 */
public class AtomId extends AbstractAtom {

    /**
     * identifier
     */
    private String identifier;

    /**
     * @param identifier identifier
     */
    public AtomId(String identifier) {
        super(AtomType.ID);
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
