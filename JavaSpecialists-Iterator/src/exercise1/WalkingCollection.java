package exercise1;

import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

public class WalkingCollection<E>
    extends AbstractCollection<E> {
    private final Collection<E> wrappedCollection;
    private final ReentrantReadWriteLock rwLock =
            new ReentrantReadWriteLock();

    public WalkingCollection(Collection<E> wrappedCollection) {

        this.wrappedCollection = wrappedCollection;
    }

    public void iterate(Processor<? super E> processor) {
        // lock using a ReadLock, then iterate through collection calling
        // processor.process(e) on each element
        rwLock.readLock().lock();
        try{
            for (E e : wrappedCollection) {
                if(!processor.process(e)) return;
            }
        }finally {
            rwLock.readLock().unlock();
        }
    }

    public Iterator<E> iterator() {
        // this method should not really be called by users anymore, instead
        // they should call the iterate(Processor) method

        // return an iterator that locks a ReadLock on hasNext() and next()
        // and a WriteLock on remove().

        // Should throw IllegalMonitorStateException if a thread tries to call
        // remove() during iteration.
        rwLock.readLock().lock();
        try{
            Iterator<E> it = wrappedCollection.iterator();
            return new Iterator<>() {
                @Override
                public boolean hasNext() {
                    rwLock.readLock().lock();
                    try {
                        return it.hasNext();

                    }finally {
                        rwLock.readLock().unlock();
                    }
                }

                @Override
                public E next() {
                    rwLock.readLock().lock();
                    try {
                        return it.next();
                    } finally {
                        rwLock.readLock().unlock();
                    }

                }

                @Override
                public void remove() {
                    checkReadLockStatus();
                    rwLock.writeLock().lock();
                    try {
                        it.remove();
                    } finally {
                        rwLock.writeLock().unlock();
                    }

                }
            };
        }finally {
            rwLock.readLock().unlock();
        }
    }

    private void checkReadLockStatus() {
        if(rwLock.getReadHoldCount()>0){
            throw new IllegalMonitorStateException(
                    "tried to upgrade read lock to write lock"
            );
        }
    }

    public int size() {
        // the size of the wrappedCollection, but wrapped with a ReadLock
        rwLock.readLock().lock();
        try {
            return wrappedCollection.size();
        } finally {
            rwLock.readLock().unlock();
        }

    }

    public boolean add(E e) {
        // adds the element to the collection, throws IllegalMonitorStateException
        // if that thread is busy iterating
        checkReadLockStatus();
        rwLock.writeLock().lock();
        try {
            return wrappedCollection.add(e);
        } finally {
            rwLock.writeLock().unlock();
        }

    }
}
