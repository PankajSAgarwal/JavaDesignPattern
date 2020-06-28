
package AcyclicVisitor.exercise1;

import java.util.*;
import java.util.concurrent.*;

/**
 * This visitor must return a unique set of all emails in the contact structure
 * in alphabetical order.
 */

public class EmailGatheringVisitor implements Iterable<String>, Visitor,PersonVisitor {
    private final Collection<String> emails = new ConcurrentSkipListSet<>();

    public Iterator<String> iterator() {
        return emails.iterator();
    }

    @Override
    public void visit(Person p) {

        emails.add(p.getEmail());
    }

}
