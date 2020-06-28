package exercise1;

/**
 * In the first exercise, please change the Earth to contain a static final
 * field that points to Earth and make the spin() and warmUp() methods
 * non-static.
 */
public class Earth {
    private final static Earth earth = new Earth();
    private Earth(){}

    public static Earth getInstance(){
        return earth;
    }
    public  void spin() {
        System.out.println("Earth is spinning");
    }

    public  void warmUp() {
        System.out.println("Earth is warming up");
    }
}
