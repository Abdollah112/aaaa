package src.AST.ComponentMetadata;

import src.AST.Node;

public class SelectorField extends Node implements ComponentMetadata {
        private final String selector;

    public SelectorField(int lineNumber, int columnNumber, String selector) {
        super(lineNumber, columnNumber);
            this.selector = selector;
        }

        public String getSelector() {
            return selector;
        }

        @Override
        public String toString() {
            return "selector: '" + selector + "'";
        }

        @Override
        public String generateHTML() { return ""; }
        @Override
        public String generateCSS() { return ""; }
        @Override
        public String generateJS() { return ""; }
    }
