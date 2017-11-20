package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class VisitorDeclarationPart extends Pascal0LikeBaseVisitor<List<AbstractDeclaration>>{


    @Override public List<AbstractDeclaration> visitDeclaration_part(Pascal0LikeParser.Declaration_partContext ctx) {

        List<AbstractDeclaration> declarationList = new ArrayList<AbstractDeclaration>();
        VisitorDeclaration visitorDeclaration = new VisitorDeclaration();

        ParseTree tree = null;
        for(int i = 0; i < ctx.getChildCount();i++) {
            visitorDeclaration.visit(tree);
        }
//TODO find out, where is problem
       // for (ParseTree tree : ctx.children) {

        //    visitorDeclaration.visit(tree);


        //    declarationList.add(visitorDeclaration.visit(tree);

        // }

        System.out.println(declarationList);


        return declarationList;
    }

}
