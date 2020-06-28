
package demo.b_originalvisitorwithminus;

import java.util.concurrent.atomic.*;

public class NumberCountVisitor implements Visitor {
    private final LongAdder count = new LongAdder();

    public void visitNumber(Number n) {
        count.increment();
    }

    public void visitPlus(Plus p) {
        // do nothing
    }

    @Override
    public void visitMinus(Minus minus) {
        // do nothing
    }

    public long getCount() {
        return count.longValue();
    }
}
