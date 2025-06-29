package src.symbolTable;

public class ComponentSymbol extends SymbolTableItem {
    private final String componentName;

    public ComponentSymbol(String componentName) {
        this.componentName = componentName;
    }

    @Override
    public String getKey() {
        return "Component:" + componentName;
    }

    public String getComponentName() {
        return componentName;
    }
}