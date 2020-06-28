package exercise1;
public class SwitchFactory {
    public static Switch make(Fan fan) {

        //throw new UnsupportedOperationException("todo");

        return new Switch(
                new FanStartCommand(fan),
                new FanStopCommand(fan)
        );
    }

    public static Switch make(Light light) {

        //throw new UnsupportedOperationException("todo");
        return new Switch(
            new LightOnCommand(light),
            new LightOffCommand(light)
        );
    }
}
