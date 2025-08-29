package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import src.antlr4.AngularComponentLexer;
import src.antlr4.AngularComponentParser;
import src.AST.Program;
import src.visitors.MyAngularVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String source = "Files/counter .txt";
            CharStream cs = fromFileName(source);
            AngularComponentLexer lexer = new AngularComponentLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularComponentParser parser = new AngularComponentParser(token);  
            ParseTree tree = parser.program();

            MyAngularVisitor firstScan = new MyAngularVisitor();
            Program program = (Program) firstScan.visit(tree);

            System.out.println("-------------------------program------------------------" + "\n" + program);

            String generatedCode = program.generateCode();
            System.out.println("-------------------------generateCode------------------------" + "\n" + generatedCode);

            // Write to generatedCode.html file
            writeToFile("index.html", generatedCode);
            System.out.println("Successfully generated index.html");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); // Optional: print stack trace for debugging
        }
    }


    private static void writeToFile(String fileName, String content) throws IOException {
        Path path = Paths.get(fileName);
        byte[] bytes = content.getBytes();
        Files.write(path, bytes);
    }

}