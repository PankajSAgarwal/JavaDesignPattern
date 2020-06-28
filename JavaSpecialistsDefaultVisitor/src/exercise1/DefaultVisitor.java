/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package exercise1;

//DON'T CHANGE
public interface DefaultVisitor extends Visitor{
    default void visit(Contact c){
        //do nothing
    }

    default void visit(AbstractleafContact c){
        visit((Contact)c);
    }

    default void visit(AbstractCompositeContact c){
        visit((Contact)c);
    }
    default void visit(Person p){
        visit((AbstractleafContact) p);
    };

    default void visit(DistributionList dl){
        visit((AbstractCompositeContact) dl);
    };
}
