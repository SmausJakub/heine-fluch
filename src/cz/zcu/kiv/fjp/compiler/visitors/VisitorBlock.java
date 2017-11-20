package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.Block;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class VisitorBlock extends Pascal0LikeBaseVisitor<Block> {

    @Override public Block visitBlock(Pascal0LikeParser.BlockContext ctx) {


        Block block = new Block();


                
             

          VisitorDeclarationPart visitorDeclarationPart = new VisitorDeclarationPart();
        List<AbstractDeclaration> declarationList = visitorDeclarationPart.visit(ctx.declaration_part());


        block.setDeclarationList(declarationList);

        System.out.println(declarationList);

        return block;
    }
}
