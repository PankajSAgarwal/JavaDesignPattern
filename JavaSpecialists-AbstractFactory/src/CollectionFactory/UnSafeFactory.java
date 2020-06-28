package CollectionFactory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class UnSafeFactory extends CollectionFactory {

    @Override
    public <E> List<E> createList() {

        return new ArrayList<>();
    }

    @Override
    public <K, V> Map<K, V> createMap() {

        return new HashMap<>();
    }
}
