package exercise3;

public class SlowEarth extends Earth{

    private SlowEarth(){}

    @Override
    public void spin() {
        System.out.println("slowearth.spin");
    }

    @Override
    public void warmUp() {
        System.out.println("slowearth.warmup");
    }
}
