package cz.zcu.kiv.fjp;



import cz.zcu.kiv.fjp.compiler.SymbolMap;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {

        Pascal0LikeLexer lexer = new Pascal0LikeLexer(new ANTLRInputStream("begin end."));
        Pascal0LikeParser parser = new Pascal0LikeParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        Pascal0LikeBaseVisitor visitor = new Pascal0LikeBaseVisitor();
        visitor.visit(tree);

        System.out.println(SymbolMap.getSymbolMap().toString());

    }

}
