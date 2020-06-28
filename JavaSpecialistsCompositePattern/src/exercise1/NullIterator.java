
package exercise1;

import java.util.*;

//DON'T CHANGE
public class NullIterator<T> implements Iterator<T> {
    private final static NullIterator<Object> instance = new NullIterator<>();

    @SuppressWarnings("unchecked")
    public static <T> NullIterator<T> getInstance() {

        return (NullIterator<T>) instance;
    }

    private NullIterator() {
    }

    public boolean hasNext() {
        return false;
    }

    public T next() {

        throw new NoSuchElementException("null iterator");
    }

    public void remove() {

        throw new IllegalStateException("null iterator");
    }
}
