package cz.zcu.kiv.fjp;



import cz.zcu.kiv.fjp.compiler.SymbolMap;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    private static String inputFile;

    public static void main(String[] args) throws Exception{

        if(args.length > 0) {

            inputFile = args[0];
            CharStream inputStream = CharStreams.fromFileName(inputFile);

            Pascal0LikeLexer lexer = new Pascal0LikeLexer(inputStream);
            Pascal0LikeParser parser = new Pascal0LikeParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            Pascal0LikeBaseVisitor visitor = new Pascal0LikeBaseVisitor();
            visitor.visit(tree);

            System.out.println(SymbolMap.getSymbolMap().toString());

        }else {
            System.out.println("Nazev programu nebyl zadan. Zadejte prosim nazev souboru");
        }

    }

}
