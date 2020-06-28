package exercise1;

public class FanStopCommand implements Command {
    private final Fan fan;

    public FanStopCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stopRotate();
    }
}
