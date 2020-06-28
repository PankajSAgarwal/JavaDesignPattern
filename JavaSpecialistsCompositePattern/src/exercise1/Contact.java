
package exercise1;

import java.util.*;

public abstract class Contact {
    public void add(Contact contact) {
    }

    public void remove(Contact contact) {
    }

    public abstract void sendMail(String msg);

    public boolean isLeaf() {

        //throw new UnsupportedOperationException("todo");
        return true;
    }

    public Iterator<Contact> children() {

        //throw new UnsupportedOperationException("todo");
        return NullIterator.getInstance();
    }
}
