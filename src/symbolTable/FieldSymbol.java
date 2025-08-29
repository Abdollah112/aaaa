package src.symbolTable;

public class FieldSymbol extends SymbolTableItem {
    private String fieldName;
    private String type;
    private boolean isPublic;
    private boolean isPrivate;
    private boolean isProtected;

    public FieldSymbol(String fieldName, String type, String accessModifier) {
        this.fieldName = fieldName;
        this.type = type;
        this.isPublic = "public".equals(accessModifier);
        this.isPrivate = "private".equals(accessModifier);
        this.isProtected = "protected".equals(accessModifier);
    }

    @Override
    public String getKey() {
        return fieldName;
    }

    public String getType() {
        return type;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public boolean isProtected() {
        return isProtected;
    }
}

