package CollectionFactory;

import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class SafeFactory extends CollectionFactory {

    @Override
    public <E> List<E> createList() {
        return new Vector<>();
    }

    @Override
    public <K, V> Map<K, V> createMap() {
        return new ConcurrentHashMap<>();
    }
}
