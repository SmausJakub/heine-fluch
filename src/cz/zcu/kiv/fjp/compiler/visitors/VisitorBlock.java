package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.Block;

import java.util.*;

public class VisitorBlock extends Pascal0LikeBaseVisitor<Block> {

    @Override public Block visitBlock(Pascal0LikeParser.BlockContext ctx) {


        Block block = new Block();





        //   VisitorDeclarationPart visitorDeclarationPart = new VisitorDeclarationPart();
        //  List<AbstractDeclaration> declarationList = visitorDeclarationPart.visit(ctx.declaration_part());

        List<AbstractDeclaration> declarationList = new ArrayList<AbstractDeclaration>();
        VisitorDeclaration visitorDeclaration = new VisitorDeclaration();

        for (int i = 0; i < ctx.declaration_part().getChildCount(); i++) {

            AbstractDeclaration declaration = (visitorDeclaration.visit(ctx.declaration_part().getChild(i)));
            System.out.println(declaration);
            declarationList.add(declaration);
        }


        System.out.println(declarationList);

        block.setDeclarationList(declarationList);

        System.out.println(declarationList);

        return block;
    }
}
