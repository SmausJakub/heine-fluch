grammar Pascal0Like;


/**
* Rules
**/

program
   : PROGRAM LPAREN IDENT RPAREN SEMI declare_mode? block DOT
   ;

declare_mode
    :
    USE LEGACY SEMI #legacyMode |
    USE DEFAULT SEMI #defaultMode |
    USE STRICT SEMI #strictMode
    ;

block
    : declaration_part statement_part
    ;

declaration_part
    :
    (label_declaration_part
   | constant_declaration_part
   | variable_declaration_part
   | procedure_declaration_part)*
    ;

procedure_declaration_part
    :
     PROCEDURE IDENT SEMI block SEMI
    ;

constant_declaration_part
    :
    CONST type identifier_list ASSIGN atom SEMI
    ;

label_declaration_part
    :
    LABEL label_list SEMI
    ;

variable_declaration_part
    :
    type identifier_list ASSIGN expression SEMI #varSimpleAs |
    type identifier_list  SEMI #varSimpleUnAs |
    type identifier_list ASSIGN LBRACK expression_list RBRACK SEMI #varParallel
    ;

label_list
    :
    INT ( COMMA INT )*
    ;

identifier_list
    :
    IDENT ( COMMA IDENT )*
    ;

expression_list
    :
    expression ( COMMA expression )*
    ;


statement_part
    :
    BEGIN (statement)* END
    ;

statement
   : INT COLON ( compound_statement | while_do_statement | do_while_statement | repeat_statement | for_statement | if_statement | case_statement | assignment_statement | procedure_statement | goto_statement | ternary_statement | io_statement )  #labelled
   | ( compound_statement | while_do_statement | do_while_statement | repeat_statement | for_statement | if_statement | case_statement | assignment_statement | procedure_statement | goto_statement | ternary_statement | io_statement ) #nonlabelled
   ;

io_statement
   :
   op=( WRITE | READ ) IDENT SEMI
   ;

ternary_statement
    :
	IDENT ASSIGN expression TERNARY_ONE expression TERNARY_TWO expression SEMI
    ;

assignment_statement
    :
    IDENT ASSIGN expression SEMI
    ;

goto_statement
    :
    GOTO INT SEMI
    ;

procedure_statement
    :
    CALL IDENT SEMI
    ;

compound_statement
    :
    BEGIN statement_list END SEMI
    ;

statement_list
    :
   statement? (statement)*
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
    FOR IDENT ASSIGN expression op=(TO | DOWNTO) expression DO statement
    ;

if_statement
    :
    IF expression THEN statement ( ELSE THEN statement )?
    ;

case_statement
    :
    CASE expression OF
    case_limb_list
    END SEMI
    ;

case_limb_list
    :
    case_limb+
    ;

case_limb
    :
    case_label_list DO statement
    ;

case_label_list
    :
    atom ( COMMA atom )*
    ;

type
    :
	op=( REAL | INTEGER | BOOLEAN | VAR )
    ;

expression
    :
    MINUS expression #unaryExpr
    | NOT expression #notExpr
    | ODD expression #oddExpr
    | expression  op=( MULTIPLY | DIVIDE | MODULO ) expression #multiplicationExpr
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
    | op=(TRUE | FALSE) #booleanAtom
    | IDENT #idAtom
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

VAR
    :
    V A R
    ;

LEGACY
   :
   L E G A C Y
   ;

PROGRAM
    :
    P R O G R A M
    ;

USE
    :
    U S E
    ;

DEFAULT
    :
    D E F A U L T
    ;

STRICT
    :
    S T R I C T
    ;

ODD
    :
    O D D
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

MODULO
    : '%'
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
    : '!'
    ;




IDENT
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;


WS
   : [ \t\r\n] -> skip
   ;