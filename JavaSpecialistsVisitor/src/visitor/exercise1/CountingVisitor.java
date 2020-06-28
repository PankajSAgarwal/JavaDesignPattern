/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package visitor.exercise1;

import maths.*;

/**
 * This must count how many leaves there are in structure, how many distribution
 * lists and what the average number of contacts in a distribution list.
 * <p/>
 * Use the maths.Statistics class to work out the mean and variance for the list
 * lengths.
 */
public class CountingVisitor implements Visitor{
    private int leaves = 0 ;
    private final Statistics composites = new Statistics();

    public int getNumberOfLeaves() {

        //throw new UnsupportedOperationException("todo");
        return leaves;
    }

    public int getNumberOfComposites() {

        //throw new UnsupportedOperationException("todo");
        return composites.size();
    }

    public double getAverageNumberOfChildrenPerComposite() {

        //throw new UnsupportedOperationException("todo");
        return composites.getMean();
    }

    public double getVarianceNumberOfChildrenPerComposite() {

        //throw new UnsupportedOperationException("todo");
        return  composites.getVariance();
    }

    @Override
    public void visit(Person p) {
        leaves++;
    }

    @Override
    public void visit(DistributionList dl) {
        composites.add(dl.getNumberOfChildren());
    }
}
