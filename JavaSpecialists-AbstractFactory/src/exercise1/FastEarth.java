package exercise1;

// ConcreteFactory
public class FastEarth extends Earth {
    protected FastEarth() {
    }

    public void spin() {

        System.out.println("Earth is spinning faster");
    }

    public void warmUp() {

        System.out.println("Earth is warming up faster");
    }

    public Vehicle createVehicle() {

        return new Lamborghini();
    }

    public Animal createAnimal() {

        return new Cheetah();
    }
}
