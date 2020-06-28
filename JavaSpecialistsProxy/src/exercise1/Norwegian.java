
package exercise1;

public class Norwegian extends Scandinavian {
    private final Lutefisk lutefisk = new VirtualLutefisk();

    public void work() {
        System.out.println("Working hard whilst it is dark outside.");
    }

    public void learn() {
        System.out.println("Going to Learn Java Proxy Pattern");
    }

    public void celebrateChristmas() {
        lutefisk.eat();
    }

    public void entertain() {
        System.out.println("Chasing reindeer");
    }
}
