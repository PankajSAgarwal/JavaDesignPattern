package exercise1;

/**
 * Call this with
 * -Dearthclass=abstractfactory.exercise1.SlowEarth
 * to see a Tractor and a Sloth and with
 * -Dearthclass=abstractfactory.exercise1.FastEarth
 * to see a Lamborghini and a Cheetah.
 */
//DON'T CHANGE
public class SpaceTraveller {
    public static void main(String... args) {
        Vehicle car = Earth.getEarth().createVehicle();
        Animal pet = Earth.getEarth().createAnimal();

        car.drive();
        pet.sprint();
    }
}
