package exercise1;

//ConcreteFactory
public class SlowEarth extends Earth {
    protected SlowEarth() {
    }

    public void spin() {

        System.out.println("Earth is spinning slower");
    }

    public void warmUp() {

        System.out.println("Earth is warming up slower");
    }

    public Vehicle createVehicle() {

        return new Tractor();
    }

    public Animal createAnimal() {

        return new Sloth();
    }
}
