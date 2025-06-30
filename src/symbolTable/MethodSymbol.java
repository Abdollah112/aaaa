package src.symbolTable;

import java.util.ArrayList;
import java.util.List;

public class MethodSymbol extends SymbolTableItem {
    private String methodName;
    private String returnType;
    private List<ParameterSymbol> parameters;
    private SymbolTable methodScope;

    public MethodSymbol(String methodName, String returnType) {
        this.methodName = methodName;
        this.returnType = returnType;
        this.parameters = new ArrayList<>();
        this.methodScope = new SymbolTable(SymbolTable.getCurrentScope());
    }

    @Override
    public String getKey() {
        return methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<ParameterSymbol> getParameters() {
        return parameters;
    }

    public void addParameter(ParameterSymbol parameter) {
        parameters.add(parameter);
    }

    public SymbolTable getMethodScope() {
        return methodScope;
    }
}
