import java.util.stream.Stream;

public class Product implements Expression {
    private final Expression[] expressions;

    public Product(Expression... expressions) {

        this.expressions = expressions;
    }

    @Override
    public String interpret() {
        return Stream.of(expressions)
                .map(Object::toString)
                .map(Fraction::new)
                .reduce(Fraction.One,Fraction::multiply)
                .toString();
    }
}
