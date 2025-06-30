package src.AST.ComponentMetadata.HTML;

public class InterpolationElement implements Element{
    private String value;

    public InterpolationElement(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nInterpolationElement{" +
                "\nvalue='" + value + '\'' +
                "\n}";
    }

}
