package exercise1;

import java.util.Iterator;

/**
 * This class should implement Iterable<B>.  The remove() method should remove
 * the item from the input Iterable.
 */
public class MorphIterable<A, B> implements Iterable<B>{
    private Iterable<A> input;
    private Morpher<A, B> morpher;

    public MorphIterable(Iterable<A> input, Morpher<A, B> morpher) {
        this.input = input;
        this.morpher = morpher;


    }

    @Override
    public Iterator<B> iterator() {
        Iterator<A> it= input.iterator();
        return new Iterator<B>() {
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public B next() {
                return morpher.morph(it.next());
            }

            @Override
            public void remove() {
                it.remove();
            }
        };
    }

    public interface Morpher<A, B> {
        B morph(A a);
    }
}
