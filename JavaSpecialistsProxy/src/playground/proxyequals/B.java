package playground.proxyequals;

import java.util.Objects;

// real subject
public final class B implements A{
    private final int i;

    public B(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o != null && getClass() == o.getClass() ) {
            B b = (B) o;
            return i == b.i;
        }
        return o.equals(this);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
