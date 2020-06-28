package exercise1;

//DON'T CHANGE
public interface Processor<E> {
    /**
     * Returns "true" if we should continue iterating; "false" otherwise
     */
    boolean process(E e);
}
