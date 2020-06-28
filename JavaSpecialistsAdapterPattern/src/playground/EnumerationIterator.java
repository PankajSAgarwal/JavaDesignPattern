package playground;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Enumeration {
    private final Iterator adaptee;

    public EnumerationIterator(Iterator adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean hasMoreElements() {
        return adaptee.hasNext();
    }

    @Override
    public Object nextElement() {
        return adaptee.next();
    }
}
