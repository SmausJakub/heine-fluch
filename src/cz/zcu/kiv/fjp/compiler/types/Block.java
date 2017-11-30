package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;

import java.util.List;

public class Block {

    private List<AbstractDeclaration> declarationList;
    private List<AbstractStatement> statementList;

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
