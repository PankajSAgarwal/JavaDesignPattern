
package memento.exercise1;

import java.util.function.Consumer;

public class HIVLab {
    public static void main(String... args) {
        LabRat mickey = new LabRat();
        while (true) {
            experiment(LabRat::feedDrugs,mickey);
            experiment(LabRat::blastWithRadar,mickey);

        }
    }

    private static void experiment(Consumer<LabRat> experiment,LabRat rat) {
        Memento previous = rat.createMemento();
        experiment.accept(rat);
        if(!rat.isAlive())
            rat.setMemento(previous);

    }
}
