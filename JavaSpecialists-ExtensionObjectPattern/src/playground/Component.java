package playground;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

// maintains registry of extensions for component
public abstract class Component {

    private final Map<Class<? extends ComponentExtension>
            ,ComponentExtension> extensions =
            new ConcurrentHashMap<>();

    public final  <E extends ComponentExtension> Optional<E>
    getExtension(Class<E> type) {
        return Optional.ofNullable((E)extensions.get(type));
    }

    protected final <E extends ComponentExtension> void register(
            Class<E> type,E extension){
        extensions.put(type,extension);
    }
}
