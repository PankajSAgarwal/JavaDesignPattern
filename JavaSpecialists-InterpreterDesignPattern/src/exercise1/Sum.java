package exercise1;

import maths.*;

import java.util.stream.*;

//DON'T CHANGE
public class Sum implements Expression {
    private final Expression[] expressions;

    public Sum(Expression... expressions) {
        this.expressions = expressions;
    }

    public String interpret() {
        return Stream.of(expressions)
            .map(Object::toString)
            .map(Fraction::new)
            .reduce(Fraction.ZERO, Fraction::add)
            .toString();
    }

    public String toString() {
        return interpret();
    }
}
