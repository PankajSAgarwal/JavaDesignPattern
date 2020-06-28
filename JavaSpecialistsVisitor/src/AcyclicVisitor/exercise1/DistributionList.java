
package AcyclicVisitor.exercise1;

import java.util.*;

public class DistributionList extends Contact  {
    private final List<Contact> contacts = new ArrayList<>();

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void remove(Contact contact) {
        contacts.remove(contact);
    }

    public void sendMail(String msg) {
        for (Contact contact : contacts) {
            contact.sendMail(msg);
        }
    }

    public void accept(Visitor visitor) {
        if (visitor instanceof DistributionListVisitor)
            ((DistributionListVisitor) visitor).visit(this);

        contacts.forEach(contact -> contact.accept(visitor));
    }

    public int getNumberOfChildren() {
        return contacts.size();
    }
}
