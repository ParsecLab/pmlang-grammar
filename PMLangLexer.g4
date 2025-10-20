lexer grammar PMLangLexer;

options {
    superClass=PMLangLexerBase;
}

// Ключевые слова
MATRIX : 'matrix' | '\uD835\uDD40' | '𝕄' | HASH ; // Матрица (𝕄 — U+1D540)

INT            : 'int'    | '\u222B'       | '∫'  ; // Интеграл
NSUM           : 'nsum'   | '\u2211'       | '∑'  ; // Сумма последовательности
PROD           : 'prod'   | '\u220F'       | '∏'  ; // Произведение
DIFF           : 'diff'   | '\u2202'       | '∂'  ; // Дифференциал
TENSOR         : 'tensor' | '\uD835\uDD4B' | '𝕋'  ; // Тензор (𝕋 — U+1D54B)
GRAD           : 'grad'   | '\u2207'       | '∇'  ; // Градиент
DIV            : 'div'    | '\u2207\u002E' | '∇·' ; // Дивергенция
CURL           : 'curl'   | '\u2207\u00D7' | '∇×' ; // Ротор
LAPLACE        : 'laplace'| '\u2206'       | '∆'  ; // Лапласиан
SCALAR_PRODUCT : 'sp'     | '\u00B7'       | '·'  ; // Скалярное произведение
VECTOR_PRODUCT : 'vp'     | '\u00D7'       | '×'  ; // Векторное произведение

LIM      : 'lim'      ; // Предел
VEC      : 'vec'      ; // Вектор
CONSTR   : 'constr'   ; // Ограничения
SYS      : 'sys'      ; // Системы уравнений
FIELD    : 'field'    ; // Скалярные/векторные поля
MEAN     : 'mean'     ; // Среднее
VAR      : 'var'      ; // Дисперсия
STD      : 'std'      ; // Стандартное отклонение
GRAPH    : 'graph'    ; // Графы
SIMPLIFY : 'simplify' ; // Упрощение
EXPAND   : 'expand'   ; // Разложение
FACTOR   : 'factor'   ; // Факторизация
SOLVE    : 'solve'    ; // Численное решение
TRANSPOSE: 'transpose'; // Транспонирование
INV      : 'inv'      ; // Обратная матрица
DET      : 'det'      ; // Детерминированная матрица
RANGE    : 'R'        ;
INCLUDE  : 'include'  ;
EXCLUDE  : 'exclude'  ;
STEP     : 'step'     ;


// Операторы
PLUS       : '+' ;
MINUS      : '-' ;
STAR       : '*' ;
SLASH      : '/' ;
CARET      : '^' ;
EQUAL      : '=' ;
COMMA      : ',' ;
DOT        : '.' ;
LPAR       : '(' ;
RPAR       : ')' ;
LSQB       : '[' ;
RSQB       : ']' ;
LBRACE     : '{' ;
RBRACE     : '}' ;
VBAR       : '|' ;
DOUBLEVBAR : '||';
HASH       : '#' ;

ARROW_RIGHT : '->'  ;
ARROW_LEFT  : '<-'  ;
FROM        : 'from';
TO          : 'to'  ;


// Константы
CONST_PI : 'pi'  | '\u03C0' | 'π' ; // Число π
CONST_E  : 'e'                    ; // Основание натурального логорифма
CONST_PHI: 'phi' | '\u03C6' | 'φ' ; // Золотое сечение


NUMBER // Числа
    : INTEGER
    | FLOAT_NUMBER
    | IMAGINARY_NUMBER
    ;

STRING // Строки
    : '\'' ~['\r\n]* '\''
    | '"'  ~['\r\n]*  '"'
    ;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]*; // Идентификаторы(имена переменных или функций)

// Пропуск пробелов и комментариев
WS       : [ \t\r\n]+ -> channel(HIDDEN);
COMMENT  : HASH ~[\r\n]* -> channel(HIDDEN);

// Нераспознанные символы
ERRORTOKEN : . ; // PMLangLexerBase будет обрабатывать ошибки

// Фрагменты
fragment INTEGER          : '0' | [1-9][0-9]*            ; // Целые числа
fragment FLOAT_NUMBER     : INTEGER? DOT [0-9]+          ; // Числа с плавающей точкой
fragment IMAGINARY_NUMBER : (INTEGER | FLOAT_NUMBER) 'i' ; // Мнимые числа
