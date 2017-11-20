package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;

import java.util.List;

public class VisitorStatementPart extends Pascal0LikeBaseVisitor<List<AbstractStatement>> {


    @Override public List<AbstractStatement> visitStatement_part(Pascal0LikeParser.Statement_partContext ctx) {
        

        
        return visitChildren(ctx);
    }
}
