import java.util.Objects;
import java.util.stream.Stream;

public class Sum implements Expression {
    private final Expression[] expressions;

    public Sum(Expression... expressions) {
        this.expressions = expressions;
    }

    @Override
    public String interpret() {
        return Stream.of(expressions)
                .map(Object::toString)
                .map(Fraction::new)
                .reduce(Fraction.Zero,Fraction::add)
                .toString();
    }
}
