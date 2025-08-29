// HtmlElementSymbol.java
package src.symbolTable;

public class HtmlElementSymbol extends SymbolTableItem {
    private String tagName;

    public HtmlElementSymbol(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String getKey() {
        return tagName;
    }

    public String getTagName() {
        return tagName;
    }
}