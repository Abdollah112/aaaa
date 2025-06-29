package src.symbolTable;

public class ClassSymbol extends SymbolTableItem {
    private String className;
    private String superClassName;
    private boolean isExported;
    private SymbolTable classScope;

    public ClassSymbol(String className, String superClassName, boolean isExported) {
        this.className = className;
        this.superClassName = superClassName;
        this.isExported = isExported;
        this.classScope = new SymbolTable(SymbolTable.getCurrentScope());
    }

    @Override
    public String getKey() {
        return className;
    }

    public String getSuperClassName() {
        return superClassName;
    }

    public boolean isExported() {
        return isExported;
    }

    public SymbolTable getClassScope() {
        return classScope;
    }
}
