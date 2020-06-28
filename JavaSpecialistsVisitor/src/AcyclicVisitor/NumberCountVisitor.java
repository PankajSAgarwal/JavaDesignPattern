package AcyclicVisitor;

import java.util.concurrent.atomic.LongAdder;

public class NumberCountVisitor implements Visitor,NumberVisitor {

    private final LongAdder count = new LongAdder();

    @Override
    public void visit(Number n) {
        count.increment();
    }

    public long getCount(){
        return count.longValue();
    }
}
