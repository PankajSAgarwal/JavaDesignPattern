package exercise1;

public abstract class Converter {
    // you will need a handle to the next converter
    private final Converter next;

    public Converter(Converter next) {
        this.next = next;
    }

    public Object handle(Object o) {
        // if the next converter is non-null, we call its handle method
        return next == null ? o : next.handle(o);

    }
}
