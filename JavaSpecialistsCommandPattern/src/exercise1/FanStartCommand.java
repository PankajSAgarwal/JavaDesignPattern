package exercise1;

public class FanStartCommand implements Command {
    private final Fan fan;
    public FanStartCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.startRotate();
    }
}
