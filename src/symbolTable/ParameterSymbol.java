package src.symbolTable;

public class ParameterSymbol extends SymbolTableItem {
    private String paramName;
    private String type;

    public ParameterSymbol(String paramName, String type) {
        this.paramName = paramName;
        this.type = type;
    }

    @Override
    public String getKey() {
        return paramName;
    }

    public String getType() {
        return type;
    }
}

