package src.AST;

public class ImportStmt extends Node {
    private final String lib;
    private final String from;

    public ImportStmt(int lineNumber, int columnNumber, String lib, String from) {
        super(lineNumber, columnNumber);
        this.lib = lib;
        this.from = from;
    }
    public String getLib() {
        return lib;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "import { " + lib + " } from '" + from + "';";
    }
}
