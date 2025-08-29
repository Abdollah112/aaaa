package src.symbolTable;

public class TagMismatchException extends Exception {
    public TagMismatchException(String expected, String found) {
        super("Expected closing tag </" + expected + ">, but found </" + found + ">.");
    }

    public TagMismatchException(String message) {
        super(message);
    }
}