parser grammar PMLang;

options {
    tokenVocab = PMLangLexer;
}

program: expr EOF;

expr
    : literal
    | range
    | matrix_expr
    ;

literal
    : NUMBER
    | CONSTANTS
    ;


range: RANGE LBRACE range_body RBRACE;

range_body
    : (LSQB|LPAR) literal COMMA literal (RSQB|RPAR)
    | (LSQB|LPAR) literal COMMA NUMBER COMMA literal (RSQB|RPAR)
    | range_body (PLUS|MINUS)? LBRACE literal_list RBRACE
    | range_body (EXCLUDE|INCLUDE) (literal|literal_list)
    | range_body STEP literal
    ;

literal_list: literal (COMMA literal)*;

matrix_expr
    : matrix
    | inv_matrix
    | det_matrix
    | transpose_matrix
    ;

inv_matrix: INV LPAR matrix_expr RPAR;
det_matrix: DET LPAR matrix_expr RPAR;
transpose_matrix: TRANSPOSE LPAR matrix_expr RPAR;

matrix
    : MATRIX LPAR matrix_row (matrix_row)* RPAR
    | MATRIX LSQB matrix_row (matrix_row)* RSQB
    | MATRIX LBRACE matrix_row (matrix_row)* RBRACE
    | MATRIX VBAR matrix_row (matrix_row)* VBAR
    | MATRIX DOUBLE_VBAR matrix_row (matrix_row)* DOUBLE_VBAR
    ;


matrix_row: LSQB literal_list RSQB;
