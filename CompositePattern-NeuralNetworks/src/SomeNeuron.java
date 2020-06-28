public interface SomeNeuron extends Iterable<Neuron> {

    default void connectTo(SomeNeuron other){

        if(this == other)
            return;
        for(Neuron from:this)
            for(Neuron to:other){
                from.out.add(to);
                to.in.add(from);
            }
    }
}
