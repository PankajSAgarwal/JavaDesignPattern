
package exercise1;

//DON'T CHANGE
public class ScandinvianExample {
    public static void main(String... args) {
        Scandinavia sc = new Scandinavia();
        sc.addCitizen(new Norwegian());
        sc.addCitizen(new Norwegian());
        sc.addCitizen(new Swede());
        sc.addCitizen(new Swede());
        sc.normalTime();
        sc.christmasTime();
    }
}
