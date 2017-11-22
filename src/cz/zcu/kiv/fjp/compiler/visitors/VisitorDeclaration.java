package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.declarations.*;

public class VisitorDeclaration extends Pascal0LikeBaseVisitor<AbstractDeclaration>{


    @Override public AbstractDeclaration visitVarSimpleAs(Pascal0LikeParser.VarSimpleAsContext ctx) {
        return new DeclarationVariableSimple(true);
    }

    @Override public AbstractDeclaration visitVarSimpleUnAs(Pascal0LikeParser.VarSimpleUnAsContext ctx) {
        return new DeclarationVariableSimple(false);
    }


    @Override public AbstractDeclaration visitVarParalel(Pascal0LikeParser.VarParalelContext ctx) {
        return new DeclarationVariableParalel();
    }


    @Override public AbstractDeclaration visitProcedure_declaration_part(Pascal0LikeParser.Procedure_declaration_partContext ctx) {
        return new DeclarationProcedure();
    }

    @Override public AbstractDeclaration visitConstant_declaration_part(Pascal0LikeParser.Constant_declaration_partContext ctx) {
        return new DeclarationConstant();
    }

    @Override public AbstractDeclaration visitLabel_declaration_part(Pascal0LikeParser.Label_declaration_partContext ctx) {
        return new DeclarationLabel();
    }


}
