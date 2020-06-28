package exercise1;

import maths.Fraction;

import java.util.stream.Stream;

/**
 * Facade for Expression elements, to make the framework easier to use.
 */
public class Expressions {
    // Most facade has a private do-nothing constructor
    private Expressions(){}
    public static Expression sum(String... numbers) {

       return new Value(
               Stream.of(numbers)
                       .map(Fraction::new)
                       .reduce(Fraction.ZERO,Fraction::add).toString()

       ) ;
    }

    public static Expression product(String... numbers) {

        return new Value(
                Stream.of(numbers)
                                .map(Fraction::new)
                                .reduce(Fraction.ONE,Fraction::multiply).toString()
            );

    }

    public static Expression negate(Expression exp) {

        return new Product(new Value("-1"),exp);
    }
}
