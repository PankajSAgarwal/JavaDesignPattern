/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package visitor.exercise1;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * This visitor must return a unique set of all emails in the contact structure
 * in alphabetical order.
 */
public class EmailGatheringVisitor implements Iterable<String>,Visitor {
    private final Set<String> emails = new ConcurrentSkipListSet<>();
    private final Collection<String> emailsUnmodifiable = Collections.unmodifiableCollection(this.emails);
    @Override
    public void visit(Person p) {
        emails.add(p.getEmail());
    }

    @Override
    public void visit(DistributionList dl) {
        // do nothing
    }

    public Iterator<String> iterator() {

        return emailsUnmodifiable.iterator();

    }
}
