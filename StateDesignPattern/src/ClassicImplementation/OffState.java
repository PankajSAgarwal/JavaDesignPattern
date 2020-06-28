package ClassicImplementation;

public class OffState extends State {

    public OffState() {
        System.out.println("Light turned off");
    }

    @Override
    void on(LightSwitch ls) {
        System.out.println("Switching Light on...");
        ls.setState(new OnState());
    }
}
