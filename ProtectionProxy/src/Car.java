public class Car implements Drivable {
    Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }
}
