
package exercise2;

import java.util.function.Supplier;

public class Norwegian extends Scandinavian {
    private final Lutefisk lutefisk = Proxies.virtual(
            Lutefisk.class,
            RealLutefisk::new
    );
    public void work() {
        System.out.println("Working hard whilst it is dark outside.");
    }

    public void learn() {
        System.out.println("Learn Java Proxy Pattern");
    }

    public void celebrateChristmas() {
        lutefisk.eat();
    }

    public void entertain() {
        System.out.println("Chasing reindeer");
    }
}
