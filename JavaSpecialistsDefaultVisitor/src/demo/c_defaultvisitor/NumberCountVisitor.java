
package demo.c_defaultvisitor;

import java.util.concurrent.atomic.*;

public class NumberCountVisitor implements DefaultVisitor {
    private final LongAdder count = new LongAdder();

    public void visitNumber(Number n) {

        count.increment();
    }



    public long getCount() {
        return count.longValue();
    }
}
