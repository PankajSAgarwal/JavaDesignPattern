import java.util.function.Predicate;
import java.util.stream.Stream;

public class Value implements Expression {

    public static final Predicate<String> VALUE_FILTER=
            value -> value.matches("^-?[0-9]+(/-?[0-9]+)?");

    private final Fraction value;

    public Value(String value) {

        if(!VALUE_FILTER.test(value))
            throw new IllegalArgumentException("Invalid value in \""
                    +value + "\"");
        this.value = new Fraction(value);
    }

    @Override
    public String interpret() {
        return value.toString();
    }

    @Override
    public String toString() {
        return interpret();
    }
}
