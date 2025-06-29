package src.AST.ComponentMetadata;

public class SelectorField implements ComponentMetadata {
        private final String selector;

        public SelectorField(String selector) {
            this.selector = selector;
        }

        public String getSelector() {
            return selector;
        }

        @Override
        public String toString() {
            return "selector: '" + selector + "'";
        }
    }
