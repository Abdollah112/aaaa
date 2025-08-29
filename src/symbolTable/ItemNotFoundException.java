package src.symbolTable;

public class ItemNotFoundException extends Exception {
    public ItemNotFoundException() {
        super("Item not found in symbol table");
    }
}