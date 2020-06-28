
package exercise2;

import java.util.function.Supplier;

public class Swede extends Scandinavian {
    private final Lutefisk lutefisk = Proxies.virtual(
            Lutefisk.class, RealLutefisk::new
    );

    public void work() {
        System.out.println("Slaving away to pay my taxes (Jan-Nov)");
    }

    public void learn() {
        System.out.println("Going to learn Java Proxy Pattern");
    }

    public void celebrateChristmas() {
        lutefisk.eat();
        System.out.println(lutefisk);
    }

    public void entertain() {
        lutefisk.eat();
    }
}
