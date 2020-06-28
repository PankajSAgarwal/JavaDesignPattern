package exercise2;

/**
 * Please add a getSpeed() method to return the speed as an int.
 * This should be passed in as a JVM system property earthspeed.
 */
public class Earth {
    private final int speed;
    private static final Earth earth = new Earth();

    public static Earth getEarth() {
        return earth;
    }

    private Earth() {
        speed = Integer.getInteger("earthspeed",2000);
    }

    public void spin() {
        System.out.println("Earth is spinning at " + speed);
    }

    public void warmUp() {
        System.out.println("Earth is warming up");
    }

    public int getSpeed() {
        return speed;
    }
}
