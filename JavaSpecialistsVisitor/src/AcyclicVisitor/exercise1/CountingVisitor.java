
package AcyclicVisitor.exercise1;

import maths.*;

import java.util.concurrent.atomic.*;

/**
 * This must count how many leaves there are in structure, how many distribution
 * lists and what the average number of contacts in a distribution list.
 * <p/>
 * Use the Statistics class to work out the mean and variance for the list
 * lengths.
 */

public class CountingVisitor implements Visitor,PersonVisitor,DistributionListVisitor {
    private final LongAdder leaves = new LongAdder();
    private final Statistics stats = new Statistics();

    @Override
    public void visit(Person p) {
        leaves.increment();
    }

    @Override
    public void visit(DistributionList dl) {
        stats.add(dl.getNumberOfChildren());
    }

    public int getNumberOfLeaves() {
        return leaves.intValue();
    }

    public int getNumberOfComposites() {
        return stats.size();
    }

    public double getAverageNumberOfChildrenPerComposite() {
        return stats.getMean();
    }

    public double getVarianceNumberOfChildrenPerComposite() {
        return stats.getVariance();
    }
}
