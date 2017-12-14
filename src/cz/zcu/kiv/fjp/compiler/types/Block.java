package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;

import java.util.List;

/**
 * Block of program
 */
public class Block {

    /**
     * list of declarations
     */
    private List<AbstractDeclaration> declarationList;

    /**
     * List of statements
     */
    private List<AbstractStatement> statementList;

    /**
     * @param declarationList list of declarations
     * @param statementList   list of statements
     */
    public Block(List<AbstractDeclaration> declarationList, List<AbstractStatement> statementList) {
        this.declarationList = declarationList;
        this.statementList = statementList;
    }


    public List<AbstractStatement> getStatementList() {
        return statementList;
    }

    public List<AbstractDeclaration> getDeclarationList() {
        return declarationList;
    }

}
