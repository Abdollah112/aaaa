parser grammar AngularComponentParser;
options { tokenVocab = AngularComponentLexer; }

program
    : importStmt* interfaceDecl? componentDecorator? classDecl? EOF
    ;

importStmt
    : IMPORT LeftBrace ID RightBrace From STRING SemiColon
    ;

componentDecorator
    : AT ID LeftParen componentMetadata RightParen
    ;

componentMetadata
    : LeftBrace (metadataField Comma?)* RightBrace
    ;

metadataField
    : Selector Colon STRING SemiColon?                                    # SelectorField
    | TEMPLATE COLON_HTML BACKTICK_HTML  element* END_TEMPLATE            # TemplateField
    | Styles COLON_CSS OPEN_LIST cssBody CLOSE_LIST Comma?                # StylesField
    ;

interfaceDecl
    : Interface ID LeftBrace interfaceField* RightBrace
    ;

interfaceField
    : ID Colon typeSpec SemiColon?
    ;

classDecl
    : Export? Class ID
      (Extends ID)?
      (Implements ID (Comma ID)*)?
      LeftBrace classMember* RightBrace
    ;

classMember
    : fieldDecl
    | methodDecl
    | constructorDecl
    ;

fieldDecl
    : (Public | Private | Protected)? ID (Bang | Question)? Colon typeSpec (EQUALS expression)? SemiColon
    ;

constructorDecl
    : Constructor LeftParen parameterList? RightParen LeftBrace statement* RightBrace
    ;

methodDecl
    : (Public | Private | Protected)? ID LeftParen parameterList? RightParen Colon typeSpec LeftBrace statement* RightBrace
    ;

parameterList
    : parameter (Comma parameter)*
    ;

parameter
    : (Public | Private | Protected)? ID Colon typeSpec
    ;

typeSpec
    : primaryType (Pipe primaryType )*
    ;

primaryType
    : ID (TAG_OPEN typeSpec TAG_CLOSE)?                             # GenericType
    | ID LeftBracket RightBracket                                   # ArrayType
    | functionType                                                  # FunctionTypee
    | literalType                                                   # LiteralTypee
    | LeftParen typeSpec RightParen                                 # GroupedType
    ;

functionType
    : LeftParen parameterList? RightParen Arrow typeSpec
    ;


literalType
    : STRING
    | NUMBER
    | True
    | False
    | Null
    ;

expression
    : primaryExpr                                             # PrimaryExpression
    | expression Dot ID                                       # PropertyAccessExpression
    | expression LeftParen argumentList? RightParen           # FunctionCallExpression
    | expression Increment                                    # IncrementExpression
    | expression op=(Multiply | Divide | Modulo) expression   # MultiplicativeExpression
    | expression op=(Plus | Minus) expression                 # AdditiveExpression
    | expression EQUALS expression                            # AssignmentExpression
    ;

primaryExpr
    : This
    | ID
    | NUMBER
    | STRING
    | True
    | False
    | Null
    | TEMPLATE_STRING
    | LeftParen expression RightParen
    | arrayLiteralExpression
    | objectLiteralExpression
    ;

arrayLiteralExpression
    : LeftBracket (expression (Comma expression)*)? RightBracket
    ;

objectLiteralExpression
    : LeftBrace (objectLiteralPair (Comma? objectLiteralPair)* Comma?)? RightBrace Comma?
    ;

objectLiteralPair
    : ID Colon expression
    ;

argumentList
    : expression (Comma expression)*
    ;

statement
    : expressionStatement
    | blockStatement
    ;

blockStatement
    : LeftBrace statement* RightBrace
    ;

expressionStatement
    : expression SemiColon
    ;






    element
        : tag                                                   # TagElement
        | NAME_HTML (COLON_HTML)?                               # HtmlName
        | interpolation                                         # InterpolationElement
        ;

    tag
        : openingTag element* closingTag
        | selfClosingTag
        ;

    openingTag
        : TAG_OPEN_START_HTML attributes* TAG_CLOSE_END_HTML
        ;

    closingTag
        : TAG_CLOSE_START_HTML NAME_HTML TAG_CLOSE_END_HTML
        ;

    selfClosingTag
        : TAG_OPEN_START_HTML attributes* TAG_END_HTML
        ;

    attributes
        : NAME_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML                   # RegularAttribute
        | STRUCTURAL_DIR_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML         # StructuralDirectiveAttribute
        | BINDING_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML                # PropertyBindingAttribute
        | EVENT_BINDING_HTML ATTRIBUTE_EQUALS_HTML STRING_HTML          # EventBindingAttribute
        ;


    interpolation
        : INTERPOLATION_START_HTML NAME_HTML INTERPOLATION_END_HTML
        ;


    cssBody
        : BACKTICK_CSS cssObjects BACKTICK_CSS COMMA_CSS?               # CssBodyContent
        ;

    cssObjects
        : csselement? (COMMA_CSS? csselement)*                          # CssObjectList
        ;

    csselement
        : DOT_CSS ID_CSS+ LBRACE_CSS bodyelement+ RBRACE_CSS            # CssRule
        ;

    bodyelement
        : ID_CSS COLON_CSS cssValue SEMICOLON_CSS                       # CssProperty
        ;

    cssValue
        : (PERCENT | ID_CSS) (ID_CSS ID_CSS?)?                          # CssValueExpression
        ;
