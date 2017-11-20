package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.declarations.DeclarationVariableSimple;

public class VisitorDeclaration extends Pascal0LikeBaseVisitor<AbstractDeclaration>{

    @Override public AbstractDeclaration visitVariable_simple_declaration(Pascal0LikeParser.Variable_simple_declarationContext ctx) {
        System.out.println("ahoj");
        DeclarationVariableSimple simple = new DeclarationVariableSimple();
        simple.setInit(true);
        return new DeclarationVariableSimple(); }






}
