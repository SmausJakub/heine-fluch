package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.AtomType;

/**
 * Abstract class of atom
 * All atoms extend this class
 * Used to store the type of atom
 */
public abstract class AbstractAtom {

    /**
     * type of atom
     */
    private AtomType atomType;

    /**
     * @param atomType atom type
     */
    public AbstractAtom(AtomType atomType) {
        this.atomType = atomType;
    }

    public AtomType getAtomType() {
        return atomType;
    }

}
