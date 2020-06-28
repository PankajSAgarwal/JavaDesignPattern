package ClassicImplementation;

public class LightSwitch {
    private State state;

    public LightSwitch() {
        state = new OffState();
    }

    void on(){
        state.on(this);
    }

    void off(){
        state.off(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
