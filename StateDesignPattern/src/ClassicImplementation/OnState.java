package ClassicImplementation;

public class OnState extends State {

    public OnState(){
        System.out.println("Light Turned On");
    }

    @Override
    void off(LightSwitch ls) {
        System.out.println("Switching Light off..");
        ls.setState(new OffState());
    }
}
