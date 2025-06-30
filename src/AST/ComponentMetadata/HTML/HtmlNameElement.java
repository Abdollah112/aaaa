package src.AST.ComponentMetadata.HTML;

public class HtmlNameElement implements Element{
    String name ;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nHtmlNameElement{" +
                "\nname='" + name + '\'' +
                "\n}";
    }

}
