// SymbolTable.java
package src.symbolTable;

import java.util.HashMap;
import java.util.Stack;

public class SymbolTable {
	private SymbolTable parent;
	private HashMap<String, SymbolTableItem> items;
	private static final Stack<String> htmlTagStack = new Stack<>();

	public HashMap<String, SymbolTableItem> getItems() {
		return items;
	}

	// Static members for scope management
	private static final Stack<SymbolTable> scopeStack = new Stack<>();
	private static SymbolTable currentScope;

	public static void pushScope(SymbolTable symbolTable) {
		if (currentScope != null) {
			scopeStack.push(currentScope);
		}
		currentScope = symbolTable;
	}

	public static void popScope() {
		currentScope = scopeStack.isEmpty() ? null : scopeStack.pop();
	}

	public static SymbolTable getCurrentScope() {
		return currentScope;
	}

	public SymbolTable() {
		this(null);
	}

	public SymbolTable(SymbolTable parent) {
		this.parent = parent;
		this.items = new HashMap<>();
	}

	public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
		String key = item.getKey();
		if (items.containsKey(key)) {
			throw new ItemAlreadyExistsException();
		}
		items.put(key, item);
	}

	public SymbolTableItem getInCurrentScope(String key) {
		return items.get(key);
	}

	public SymbolTableItem get(String key) throws ItemNotFoundException {
		SymbolTableItem item = items.get(key);
		if (item != null) {
			return item;
		}
		if (parent != null) {
			return parent.get(key);
		}
		throw new ItemNotFoundException();
	}

	public SymbolTable getParent() {
		return parent;
	}

	public boolean contains(String key) {
		return items.containsKey(key);
	}

	public boolean containsInAnyScope(String key) {
		if (items.containsKey(key)) {
			return true;
		}
		return parent != null && parent.containsInAnyScope(key);
	}






	public static void pushHtmlTag(String tagName) {
		htmlTagStack.push(tagName);
	}

	public static void popAndValidateHtmlTag(String tagName) throws TagMismatchException {
		if (htmlTagStack.isEmpty()) {
			throw new TagMismatchException("nothing", tagName);
		}
		String expected = htmlTagStack.pop();
		if (!expected.equals(tagName)) {
			throw new TagMismatchException(expected, tagName);
		}
	}

	public static void clearHtmlTags() {
		htmlTagStack.clear();
	}



}