public class Demo {

    public static void main(String[] args) {

        Neuron neuron = new Neuron();
        Neuron neuron2 = new Neuron();
        NeuronLayer layer = new NeuronLayer();
        NeuronLayer layer2 = new NeuronLayer();

        neuron.connectTo(neuron2);
        neuron.connectTo(layer);
        layer.connectTo(neuron);
        layer.connectTo(layer2);


    }
}
