package GOFState;

public abstract class State {
    void accepted(){}; // ignore
    void printDocument(){
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
