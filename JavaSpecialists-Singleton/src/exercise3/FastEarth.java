package exercise3;

public class FastEarth extends Earth{
    private FastEarth() {
    }

    @Override
    public void spin() {
        System.out.println("fastearth.spin");
    }

    @Override
    public void warmUp() {
        System.out.println("fastearth.warmup");
    }
}
