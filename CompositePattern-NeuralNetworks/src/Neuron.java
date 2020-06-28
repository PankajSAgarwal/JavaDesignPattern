import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Neuron implements SomeNeuron {
    public ArrayList<Neuron> in, out;

    public void connectTo(Neuron other) {
        out.add(other);
        other.in.add(this);
    }

    @Override
    public void forEach(Consumer<? super Neuron> action) {
        action.accept(this);
    }

    @Override
    public Spliterator<Neuron> spliterator() {
        return Collections.singleton(this).spliterator();
    }

    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }
}
