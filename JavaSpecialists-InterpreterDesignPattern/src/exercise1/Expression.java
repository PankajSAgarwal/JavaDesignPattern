package exercise1;

/**
 * Expression language for fraction maths:
 * <p>
 * expression ::= sum
 * sum ::= product ((' + ' | ' - ') product)*
 * product ::= value ((' * ' | ' / ') value)*
 * value ::= -?\d+(/-?\d+)? | '(' expression ')'
 * <p>
 * 1/3 + 2/3 / 1/2 * 3/4 + 1/2 - 5/6
 */
//DON'T CHANGE
public interface Expression {
    String interpret();
}
