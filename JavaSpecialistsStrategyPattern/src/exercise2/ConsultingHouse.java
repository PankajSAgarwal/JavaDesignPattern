
package exercise2;

import java.util.*;
import java.util.stream.*;

public class ConsultingHouse {
    private final Programmer[] programmers;

    public ConsultingHouse(Programmer... programmers) {
        this.programmers = programmers.clone();
    }

    public Stream<Programmer> getProgrammersByRichestSmartest() {

        return Stream.of(programmers).sorted(
                Comparator.comparingDouble(Programmer::getSalary)
                .thenComparingInt(p->p.getLanguages().size())
                .reversed()
                .thenComparing(Programmer::getName)
        );
    }

    public Stream<Programmer> getProgrammersBySmartestRichest() {
        return Stream.of(programmers)
                .sorted(Comparator.comparingInt(ConsultingHouse::getNumberOfLanguagesByProgrammer)
                .thenComparingDouble(Programmer::getSalary)
                .reversed()
                .thenComparing(Programmer::getName)
                );
    }


    private static int getNumberOfLanguagesByProgrammer(Programmer p){
        return p.getLanguages().size();
    }

    public Stream<Programmer> getProgrammersByName() {

        return Stream.of(programmers).sorted(
                Comparator.comparing(Programmer::getName)
        );
    }
}
