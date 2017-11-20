package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;

import java.util.List;

public class Block {

    private List<AbstractDeclaration> declarationList;
    private List<AbstractStatement> statementList;






    public List<AbstractStatement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<AbstractStatement> statementList) {
        this.statementList = statementList;
    }

    public List<AbstractDeclaration> getDeclarationList() {
        return declarationList;
    }

    public void setDeclarationList(List<AbstractDeclaration> declarationList) {
        this.declarationList = declarationList;
    }
}
