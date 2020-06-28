package exercise1;

public class ExpressionFactory {
    // 1 + 2 + 3 + 4 + 5
    public static Expression getExpression1() {
        // Without Facade
//        return new Sum(new Value("1"),new Value("2")
//                ,new Value("3"),new Value("4"),new Value("5"));
//
        // With Facade
        return Expressions.sum("1","2","3","4","5");
    }

    // 1/2 + 3/4 + 5/6 + 7/8 + 9/10
    public static Expression getExpression2() {

        return Expressions.sum("1/2","3/4","5/6","7/8","9/10");
    }

    // 1/2 * 3/4 + 5/6 * 7/8 - 9/10
    public static Expression getExpression3() {

        Expression a = Expressions.product("1/2","3/4");// 1/2 * 3/4
        Expression b = Expressions.product("5/6","7/8");// 5/6 * 7/8
        return new Sum(a,b,new Value("-9/10"));
    }

    // ((1/2 * 1/3) - (5/12 + 3/12 + 2/12)) / 2/1
    public static Expression getExpression4() {
        // the expression re-write ((1/2 * 1/3) - (5/12 + 3/12 + 2/12)) / 2/1
        // ((1/2 * 1/3) + - (5/12 + 3/12 + 2/12) * 1/2)
        Expression a = Expressions.product("1/2","1/3");
        Expression b = Expressions.negate(
                Expressions.sum("5/12","3/12","2/12")
        );
        return new Product(new Sum(a,b),new Value("1/2"));
    }
}
