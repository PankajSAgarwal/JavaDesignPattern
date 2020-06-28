package playground.proxyequals;

import java.util.Objects;

// proxy
public class C implements A{

    private final A a;

    public C(A a) {
        Objects.requireNonNull(a);
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        return a.equals(o);
    }

    @Override
    public int hashCode() {
        return a.hashCode();
    }
}
