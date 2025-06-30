package src.AST;

public class ImportStmt {
    private final String lib;
    private final String from;

    public ImportStmt(String lib, String from) {
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
