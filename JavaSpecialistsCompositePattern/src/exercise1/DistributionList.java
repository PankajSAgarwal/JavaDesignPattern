
package exercise1;

import java.util.*;

public class DistributionList extends Contact {
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

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Iterator<Contact> children() {
        return contacts.iterator();
    }
}
