package exercise1;

import maths.*;

import java.util.stream.*;

//DON'T CHANGE
public class Product implements Expression {
    private final Expression[] expressions;

    public Product(Expression... expressions) {
        this.expressions = expressions;
    }

    public String interpret() {
        return Stream.of(expressions)
            .map(Object::toString)
            .map(Fraction::new)
            .reduce(Fraction.ONE, Fraction::multiply).toString();
    }

    public String toString() {
        return interpret();
    }
}
