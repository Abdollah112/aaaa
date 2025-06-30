lexer grammar AngularComponentLexer;

// === KEYWORDS ===
IMPORT      : 'import';
Export      : 'export';
Class       : 'class';
Interface   : 'interface';
Extends     : 'extends';
Implements  : 'implements';
Constructor : 'constructor';
Public      : 'public';
Private     : 'private';
Protected   : 'protected';
This        : 'this';
True        : 'true';
False       : 'false';
Null        : 'null';
From        : 'from';
Selector    : 'selector';
TEMPLATE : 'template' ->pushMode(HTML);
Styles      : 'styles'->pushMode(CSS);

// === COMPONENT DECORATOR ===
AT          : '@';
ANG_FOR     : '*ngFor';
ANG_IF      : '*ngIf';

// === SYMBOLS ===
LeftBrace   : '{';
RightBrace  : '}';
LeftParen   : '(';
RightParen  : ')';
LeftBracket : '[';
RightBracket: ']';
Dot         : '.';
Comma       : ',';
Colon       : ':';
SemiColon   : ';';
EQUALS      : '=';
Arrow       : '=>';
Bang        : '!';
Question    : '?';
Pipe        : '|';
Plus        : '+';
Minus       : '-';
Multiply    : '*';
Divide      : '/';
Modulo      : '%';
Increment   : '++';
SingleQuote : '`';
DoubleQuote : '"';
// === OPERATORS AND TAGS ===
TAG_OPEN    : '<';
TAG_CLOSE   : '>';
TAG_SLASH_CLOSE : '/>';
HANDLEBAR_OPEN: '{{';
HANDLEBAR_CLOSE: '}}';

// === LITERALS ===
 TEMPLATE_STRING
    : '`' (~'`' | '\\' .)* '`'
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

ID
    : [a-zA-Z_$][a-zA-Z0-9_$]*
    ;


// === COMMENTS & WHITESPACE ===
COMMENT
    : '/*' .*? '*/' -> skip
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;
WS
    : [ \t\r\n]+ -> skip
    ;


// === HTML TEXT FRAGMENTS ===
fragment ESCAPE_SEQUENCE
    : '\\' .
    ;


mode HTML ;

LINE_COMMENT_HTML: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT_HTML: '/*' .*? '*/' -> skip;
// Start of the template block                // End of the template block

// Tag-related tokens
TAG_OPEN_START_HTML    : '<' NAME_HTML;                     // Opening tag start: <div
TAG_CLOSE_START_HTML   : '</' ;                    // Closing tag start: </div
TAG_CLOSE_END_HTML     : '>';                          // End of a tag: >
TAG_END_HTML           : '/>';                         // Self-closing tag: />

// Attribute-related tokens
ATTRIBUTE_EQUALS_HTML  : '=';                          // Equals sign for attributes
STRING_HTML            : '"' (~["\r\n])* '"';          // Quoted string values
STRUCTURAL_DIR_HTML    : '*' NAME_HTML;                     // Structural directive (e.g., *ngFor)
BINDING_HTML           : '[' NAME_HTML ']';                 // Property binding (e.g., [src])
EVENT_BINDING_HTML     : '(' NAME_HTML ')';                 // Event binding (e.g., (click))

// Angular-specific characters
NEGATION_HTML          : '!';                          // Angular negation (e.g., *ngIf="!condition")
COLON_HTML             : ':';                          // Colon for event and property bindings (e.g., (click), [src])

// Object path and interpolation
INTERPOLATION_START_HTML : '{{';                         // Start of Angular interpolation
INTERPOLATION_END_HTML  : '}}';                         // End of Angular interpolation
DOT_HTML               : '.';                          // Dot for object path access (e.g., product.name)
NAME_HTML: [a-zA-Z_][a-zA-Z0-9_!.-]*;
WS_HTML                : [ \t\r\n]+ -> skip;           // Ignore whitespace globally
END_TEMPLATE : '`,' -> popMode;

BACKTICK_HTML: '`';



mode CSS ;
BACKTICK_CSS: '`';
COLON_CSS : ':';
COMMA_CSS: ',';
// End of the template block
OPEN_LIST : '[';
CLOSE_LIST :']'->popMode;
DOT_CSS: '.';
SEMICOLON_CSS : ';';
LBRACE_CSS     : '{';
RBRACE_CSS     : '}';
PERCENT : '%';
WS_CSS         : [ \t\r\n]+ -> skip;
LINE_COMMENT_CSS: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT_CSS: '/*' .*? '*/' -> skip;
PX   : 'px';
EM   : 'em';
REM  : 'rem';
ID_CSS
    : [0-9]+ (PX | EM | REM | PERCENT)?
    | '#' [0-9a-fA-F]+            // Match hex color codes like #333 or #ff0000
    | [a-zA-Z_-][a-zA-Z0-9_-]*   // General identifiers
    ;