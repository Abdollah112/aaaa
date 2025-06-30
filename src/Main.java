package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import src.antlr4.AngularComponentLexer;
import src.antlr4.AngularComponentParser;
import src.AST.Program;
import src.visitors.MyAngularVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
    public static void main(String[] args) {
        try {
            String source = "Files/Text File.txt";
            CharStream cs = fromFileName(source);
            AngularComponentLexer lexer = new AngularComponentLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularComponentParser parser = new AngularComponentParser(token);
            ParseTree tree = parser.program();

            MyAngularVisitor firstScan = new MyAngularVisitor();
            Program program = (Program) firstScan.visit(tree);

            System.out.println("-------------------------program------------------------" + "\n" + program);

            System.out.println("-------------------------generateCode------------------------" + "\n");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); // Optional: print stack trace for debugging
        }
    }
}