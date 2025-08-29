package src.symbolTable;

public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException() {
        super("Item already exists in symbol table");
    }
}

