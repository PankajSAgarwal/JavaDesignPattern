package playground.twowayadapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumIterAdapter<E> implements Enumeration, Iterator {

    private final Iterator<E> adaptee;

    public EnumIterAdapter(Iterator<E> iter) {
        this.adaptee = iter;
    }

    public EnumIterAdapter(Enumeration<E> en){
        this(new Iterator<E>() {// Java9 <> works with anonymous inner class
            @Override
            public boolean hasNext() {
                return en.hasMoreElements();
            }

            @Override
            public E next() {
                return en.nextElement();
            }
            // remove is optional in iterator.
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        });
    }

    @Override
    public boolean hasMoreElements() {
        return adaptee.hasNext();
    }

    @Override
    public E nextElement() {
        return adaptee.next();
    }

    @Override
    public boolean hasNext() {
        return adaptee.hasNext();
    }

    @Override
    public E next() {
        return adaptee.next();
    }

    @Override
    public void remove() {
        adaptee.remove();
    }
}
