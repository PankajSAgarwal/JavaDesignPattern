public class Demo {

    public static void main(String[] args) {
        Car car = new CarProxy(new Driver(12));
        car.drive();
    }
}
