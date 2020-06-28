package GOFVisitor;

import java.util.concurrent.atomic.LongAdder;

public class NumberCountVisitor implements Visitor {

    private final LongAdder count = new LongAdder();

    @Override
    public void visit(Plus p) {
        // Do nothing as we need to count n and not plus
    }

    @Override
    public void visit(Number n) {
        count.increment();
    }

    public long getCount(){
        return count.longValue();
    }

}
