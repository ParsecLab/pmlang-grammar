grammar PMLang;

options {
    tokenVocab = PMLangLexer;
}

program: expr EOF;

expr: ;
