package src.symbolTable;

import java.util.Arrays;
import java.util.List;

public class HtmlAttributeValidator {
    private static final List<String> VALID_HTML_ATTRIBUTES = Arrays.asList(
            "id", "class", "style", "title", "lang", "dir", "accesskey", "tabindex",
            // Common attributes
            "src", "alt", "href", "target", "rel", "type", "value", "name", "placeholder",
            // ARIA attributes
            "aria-label", "aria-hidden", "aria-expanded", "aria-disabled",
            // Angular-specific attributes
            "*ngIf", "*ngFor", "ngSwitch", "ngModel", "ngClass", "ngStyle"
    );

    private static final List<String> VALID_CSS_PROPERTIES = Arrays.asList(
            "display", "width", "height", "gap", "border-right", "border-bottom",
            "list-style-type", "padding", "align-items", "cursor", "object-fit",
            "margin-bottom", "color", "background", "font-size", "text-align"
    );

    public static boolean isValidHtmlAttribute(String attributeName) {
        // Check for standard HTML attributes
        if (VALID_HTML_ATTRIBUTES.contains(attributeName)) {
            return true;
        }

        // Check for Angular structural directives (*ngIf, *ngFor, etc.)
        if (attributeName.startsWith("*")) {
            String directive = attributeName.substring(1);
            return VALID_HTML_ATTRIBUTES.contains(directive) ||
                    directive.startsWith("ng");
        }

        // Check for property bindings ([property])
        if (attributeName.startsWith("[") && attributeName.endsWith("]")) {
            String prop = attributeName.substring(1, attributeName.length() - 1);
            return VALID_HTML_ATTRIBUTES.contains(prop) ||
                    VALID_CSS_PROPERTIES.contains(prop);
        }

        // Check for event bindings ((event))
        if (attributeName.startsWith("(") && attributeName.endsWith(")")) {
            String event = attributeName.substring(1, attributeName.length() - 1);
            return event.startsWith("on") ||
                    event.equals("click") ||
                    event.equals("submit") ||
                    event.equals("change");
        }

        return false;
    }

    public static boolean isValidCssProperty(String propertyName) {
        return VALID_CSS_PROPERTIES.contains(propertyName);
    }
}