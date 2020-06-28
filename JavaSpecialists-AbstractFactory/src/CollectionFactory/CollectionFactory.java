package CollectionFactory;

import java.util.List;
import java.util.Map;

public abstract class CollectionFactory {

    private static CollectionFactory factory;

    public static CollectionFactory getInstance() {
        return factory;
    }

    public abstract <E> List<E> createList();
    public abstract <K,V> Map<K,V> createMap();

    // code for setting singleton instance
}
