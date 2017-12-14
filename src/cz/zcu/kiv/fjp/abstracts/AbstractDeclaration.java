package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.DeclarationType;

/**
 * Abstract class of declaration
 * All declarations extend this class
 * Used to store the declaration type of declaration
 */
public abstract class AbstractDeclaration extends AbstractLineNumbered implements Comparable<AbstractDeclaration> {

    /**
     * declaration type
     */
    private DeclarationType declarationType;

    /**
     * @param declarationType declaration type
     * @param lineNumber      line number
     */
    public AbstractDeclaration(DeclarationType declarationType, int lineNumber) {
        super(lineNumber);
        this.declarationType = declarationType;
    }

    public DeclarationType getDeclarationType() {
        return declarationType;
    }

    @Override
    public int compareTo(AbstractDeclaration declaration) {

        if (declaration.declarationType == DeclarationType.PROCEDURE && this.declarationType == DeclarationType.PROCEDURE) {
            return 0;
        } else if (declaration.declarationType == DeclarationType.PROCEDURE) {
            return -1;
        } else if (this.declarationType == DeclarationType.PROCEDURE) {
            return 1;
        }

        return 0;
    }
}
