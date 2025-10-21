lexer grammar PMLangLexer;

options {
    superClass=PMLangLexerBase;
}

// Ключевые слова
MATRIX : 'matrix' | '𝕄' | HASH ; // Матрица (𝕄 — U+1D540)

INT            : 'int'    | '∫'  ; // Интеграл
NSUM           : 'nsum'   | '∑'  ; // Сумма последовательности
PROD           : 'prod'   | '∏'  ; // Произведение
DIFF           : 'diff'   | '∂'  ; // Дифференциал
TENSOR         : 'tensor' | '𝕋'  ; // Тензор (𝕋 — U+1D54B)
GRAD           : 'grad'   | '∇'  ; // Градиент
DIV            : 'div'    | '∇·' ; // Дивергенция
CURL           : 'curl'   | '∇×' ; // Ротор
LAPLACE        : 'laplace'| '∆'  ; // Лапласиан
SCALAR_PRODUCT : 'sp'     | '·'  ; // Скалярное произведение
VECTOR_PRODUCT : 'vp'     | '×'  ; // Векторное произведение

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
RANGE    : 'range' | 'r'  ;
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
DOUBLE_VBAR : '||';
HASH       : '#' ;

ARROW_RIGHT : '->'  ;
ARROW_LEFT  : '<-'  ;
FROM        : 'from';
TO          : 'to'  ;


// Константы
fragment CONST_PI    : 'pi'    | 'π'; // Число π
fragment CONST_E     : 'e';                      // Основание натурального логарифма
fragment CONST_PHI   : 'phi'   | 'φ'; // Золотое сечение
fragment CONST_INF   : 'inf'   | '∞'; // Бесконечность
fragment CONST_DELTA : 'delta' | 'δ'; // Функция Дирака
fragment CONST_C     : 'c';                      // Скорость света
fragment CONST_HBAR  : 'hbar'  | 'ℏ'; // Постоянная Планка
fragment CONST_G     : 'G';                      // Гравитационная постоянная
fragment CONST_N_A   : 'N_A';                    // Число Авогадро
fragment CONST_I     : 'i'                     ; // Мнимая единица
fragment CONST_R_GAS : 'R_gas';                  // Газовая постоянная


CONSTANTS
    : CONST_PI
    | CONST_E
    | CONST_PHI
    | CONST_INF
    | CONST_DELTA
    | CONST_C
    | CONST_HBAR
    | CONST_G
    | CONST_N_A
    | CONST_I
    | CONST_R_GAS
    ;

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
fragment INTEGER          : '0' | MINUS? [1-9][0-9]*            ; // Целые числа
fragment FLOAT_NUMBER     : INTEGER? DOT [0-9]+          ; // Числа с плавающей точкой
fragment IMAGINARY_NUMBER : (INTEGER | FLOAT_NUMBER) 'i' ; // Мнимые числа
