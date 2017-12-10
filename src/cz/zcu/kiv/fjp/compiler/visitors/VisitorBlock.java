package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.Block;

import java.util.ArrayList;
import java.util.List;

public class VisitorBlock extends Pascal0LikeBaseVisitor<Block> {

    @Override
    public Block visitBlock(Pascal0LikeParser.BlockContext ctx) {

        List<AbstractDeclaration> declarationList = new ArrayList<>();
        List<AbstractStatement> statementList = new ArrayList<>();
        VisitorDeclaration visitorDeclaration = new VisitorDeclaration();
        VisitorStatement visitorStatement = new VisitorStatement();

        for (int i = 0; i < ctx.declaration_part().getChildCount(); i++) {

            AbstractDeclaration declaration = visitorDeclaration.visit(ctx.declaration_part().getChild(i));
            declarationList.add(declaration);
        }


        for (int j = 0; j < ctx.statement_part().getChildCount(); j++) {
            AbstractStatement statement = visitorStatement.visit(ctx.statement_part().getChild(j));
            if (statement == null) {
                continue;
            }
            statementList.add(statement);
        }

        return new Block(declarationList, statementList);
    }
}
