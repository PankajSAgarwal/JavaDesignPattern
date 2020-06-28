package exercise1;

import java.util.Iterator;
import java.util.concurrent.locks.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

// this class should implement Iterable<T>
public class ThreadSafeIterable<T> implements Iterable<T>{
    private final Iterable<T> delegate;

    // synchronize on the lock and copy the source into a new collection
    public ThreadSafeIterable(Iterable<T> source, Object lock) {
        synchronized (lock){
            delegate = copy(source);
        }
    }

    private Iterable<T> copy(Iterable<T> source) {
        return StreamSupport.stream(source.spliterator(),false)
                            .collect(Collectors.toUnmodifiableList());
    }

    // lock() the Java 5 lock and copy the source into a new collection
    public ThreadSafeIterable(Iterable<T> source, Lock lock) {
            lock.lock();
                try {
                    delegate=copy(source);
                } finally {
                    lock.unlock();
                }
    }

    @Override
    public Iterator<T> iterator() {
        return delegate.iterator();
    }
}
