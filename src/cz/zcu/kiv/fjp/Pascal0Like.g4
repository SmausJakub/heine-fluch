grammar Pascal0Like;


/**
* Rules
**/

program
   : block DOT
   ;

block
    : declaration_part statement_part
    ;

declaration_part
    :
   ( label_declaration_part | constant_declaration_part | variable_declaration_part | procedure_declaration_part)*
    ;

procedure_declaration_part
    :
     procedure_heading SEMI procedure_body
    ;

procedure_body
    :
    block
    ;

procedure_heading
	:
	PROCEDURE IDENT
    ;

constant_declaration_part
    :
    CONST type constant_declaration SEMI ( constant_declaration SEMI )*
    ;

constant_declaration
    :
    identifier_list ASSIGN atom
    ;

label_declaration_part
    :
    LABEL label ( COMMA label )* SEMI
    ;

variable_declaration_part
    :
    variable_simple_declaration  SEMI |
    variable_paralel_declaration SEMI
    ;

variable_simple_declaration
    :
    type identifier_list ASSIGN expression_list |
    type identifier_list
    ;

variable_paralel_declaration
    :
    type identifier_list ASSIGN LBRACK expression_list RBRACK
    ;

identifier_list
    :
    IDENT ( COMMA IDENT )*
    ;

expression_list
    :
    expression ( COMMA expression )*
    ;

label
    :
    INT
    ;


statement_part
    :
    BEGIN statement_sequence END
    ;

statement_sequence
    :
    statement* ( SEMI statement )*
    ;

statement
   : label COLON (simple_statement | structured_statement)
   | (simple_statement | structured_statement)
   ;

simple_statement
    :
    ( assignment_statement | procedure_statement | goto_statement | ternary_statement | io_statement )
    ;

io_statement
   :
   ( WRITE | READ ) IDENT
   ;

ternary_statement
    :
	IDENT ASSIGN expression TERNARY_ONE expression TERNARY_TWO expression
    ;

assignment_statement
    :
    IDENT ASSIGN expression
    ;

goto_statement
    :
    GOTO label
    ;

procedure_statement
    :
    CALL IDENT
    ;

structured_statement
    :
    ( compound_statement | repetitive_statement | conditional_statement )
    ;

compound_statement
    :
    BEGIN statement_sequence END
    ;

repetitive_statement
    :
    ( while_do_statement | do_while_statement | repeat_statement | for_statement )
    ;

conditional_statement
    :
    ( if_statement | case_statement )
    ;

while_do_statement
    :
    WHILE expression DO statement
    ;

do_while_statement
    :
    DO statement WHILE expression
    ;

repeat_statement
    :
    REPEAT statement UNTIL expression
    ;

for_statement
    :
    FOR IDENT ASSIGN expression (TO | DOWNTO) expression DO statement
    ;

if_statement
    :
    IF expression THEN statement ( ELSE statement )?
    ;

case_statement
    :
    CASE expression OF
    case_limb ( SEMI case_limb )* ( SEMI )?
    END
    ;

case_limb
    :
    case_label_list COLON statement
    ;

case_label_list
    :
    atom ( COMMA atom )*
    ;

type
    :
	( STR | REAL | INTEGER | BOOLEAN )
    ;

expression
    :
    MINUS expression #unaryExpr
    | NOT expression #notExpr
    | expression  op=( MULTIPLY | DIVIDE ) expression #multiplicationExpr
    | expression  op=( PLUS | MINUS ) expression #additiveExpr
    | expression op=( EQUAL | NOT_EQUAL | LT | LE | GT | GE ) expression #relationalExpr
    | expression op=( AND | OR ) expression #logicExpr
    | atom #atomExpr
    | LPAREN expression RPAREN #parExpr
     ;

atom
    :
    INT #intAtom
    | FLOAT  #realAtom
    | b=(TRUE | FALSE) #booleanAtom
    | IDENT #idAtom
    | STRING #stringAtom
    ;

STRING
    : '\'' ('\'\'' | ~ ('\''))* '\''
    ;

INT
 : [0-9]+
 ;

 FLOAT
  : [0-9]+ '.' [0-9]*
  | '.' [0-9]+
  ;




/**
* FRAGMENTS
**/


fragment A
   : ('a' | 'A')
   ;


fragment B
   : ('b' | 'B')
   ;


fragment C
   : ('c' | 'C')
   ;


fragment D
   : ('d' | 'D')
   ;


fragment E
   : ('e' | 'E')
   ;


fragment F
   : ('f' | 'F')
   ;


fragment G
   : ('g' | 'G')
   ;


fragment H
   : ('h' | 'H')
   ;


fragment I
   : ('i' | 'I')
   ;


fragment J
   : ('j' | 'J')
   ;


fragment K
   : ('k' | 'K')
   ;


fragment L
   : ('l' | 'L')
   ;


fragment M
   : ('m' | 'M')
   ;


fragment N
   : ('n' | 'N')
   ;


fragment O
   : ('o' | 'O')
   ;


fragment P
   : ('p' | 'P')
   ;


fragment Q
   : ('q' | 'Q')
   ;


fragment R
   : ('r' | 'R')
   ;


fragment S
   : ('s' | 'S')
   ;


fragment T
   : ('t' | 'T')
   ;


fragment U
   : ('u' | 'U')
   ;


fragment V
   : ('v' | 'V')
   ;


fragment W
   : ('w' | 'W')
   ;


fragment X
   : ('x' | 'X')
   ;


fragment Y
   : ('y' | 'Y')
   ;


fragment Z
   : ('z' | 'Z')
   ;





/**
* KEYWORDS
**/


BEGIN
   : B E G I N
   ;

AND
    : A N D
    ;

BOOLEAN
   : B O O L E A N
   ;


CASE
   : C A S E
   ;


CONST
   : C O N S T
   ;


DO
   : D O
   ;

OF
   : O F
   ;


DOWNTO
   : D O W N T O
   ;


ELSE
   : E L S E
   ;


END
   : E N D
   ;


FOR
   : F O R
   ;


GOTO
   : G O T O
   ;


IF
   : I F
   ;


INTEGER
   : I N T E G E R
   ;


LABEL
   : L A B E L
   ;

OR
   : O R
   ;


PROCEDURE
   : P R O C E D U R E
   ;


REAL
   : R E A L
   ;


REPEAT
   : R E P E A T
   ;


THEN
   : T H E N
   ;


TO
   : T O
   ;


UNTIL
   : U N T I L
   ;


WHILE
   : W H I L E
   ;

STR
    : S T R I N G
    ;

CALL
    : C A L L
    ;

READ
    : R E A D
    ;

WRITE
    : W R I T E
    ;

NOT
    : N O T
    ;

TRUE
    :
    T R U E
    ;

FALSE
    :
    F A L S E
    ;

/**
* SYMBOLS
**/



MULTIPLY
   : '*'
   ;


DIVIDE
   : '/'
   ;

DOT
   : '.'
   ;


ASSIGN
   : ':='
   ;


COMMA
   : ','
   ;


SEMI
   : ';'
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


NOT_EQUAL
   : '<>'
   ;

LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;

LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


LBRACK
   : '['
   ;

RBRACK
   : ']'
   ;

TERNARY_ONE
    : '?'
    ;

TERNARY_TWO
    : ':'
    ;




IDENT
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;


WS
   : [ \t\r\n] -> skip
   ;