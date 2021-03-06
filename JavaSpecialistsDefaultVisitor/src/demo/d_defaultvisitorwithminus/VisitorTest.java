
package demo.d_defaultvisitorwithminus;

import org.junit.*;

import static org.junit.Assert.*;

public class VisitorTest {
    @Test
    public void onePlusTwoPlusThreePlusFourCounting() {
        Expression expression = new Plus(new Number(1), new Plus(new Number(2), new Plus(new Number(3), new Number(4))));
        NumberCountVisitor counter = new NumberCountVisitor();
        expression.accept(counter);
        assertEquals(4, counter.getCount());
    }

    @Test
    public void onePlusTwoPlusThreePlusFourNestedCounting() {
        Expression expression = new Plus(new Plus(new Number(1), new Number(2)), new Plus(new Number(3), new Number(4)));
        NumberCountVisitor counter = new NumberCountVisitor();
        expression.accept(counter);
        assertEquals(4, counter.getCount());
    }

    @Test
    public void onePlusTwoPlusThreePlusFourEval() {
        Expression expression = new Plus(new Number(1), new Plus(new Number(2), new Plus(new Number(3), new Number(4))));
        EvalVisitor eval = new EvalVisitor();
        expression.accept(eval);
        assertEquals(10, eval.getValue());
    }

    @Test
    public void onePlusTwoPlusThreePlusFourNestedEval() {
        Expression expression = new Plus(new Plus(new Number(1), new Number(2)), new Plus(new Number(3), new Number(4)));
        EvalVisitor eval = new EvalVisitor();
        expression.accept(eval);
        assertEquals(10, eval.getValue());
    }

    @Test
    public void onePlusTwoPlusThreePlusFourPrinting() {
        Expression expression = new Plus(new Number(1), new Plus(new Number(2), new Plus(new Number(3), new Number(4))));
        PrintVisitor print = new PrintVisitor();
        expression.accept(print);
        assertEquals("1 2 3 4 + + +", print.toString());
    }

    @Test
    public void onePlusTwoPlusThreePlusFourNestedPrinting() {
        Expression expression = new Plus(new Plus(new Number(1), new Number(2)), new Plus(new Number(3), new Number(4)));
        PrintVisitor print = new PrintVisitor();
        expression.accept(print);
        assertEquals("1 2 + 3 4 + +", print.toString());
    }
}
