package exercise1;

public abstract class State {
    public int pay(Employee employee) {

        return 0;
    }

    public void advance(Employee employee) {


    }

    public void fire(Employee employee) {


    }

    @Override
    public final String toString() {
        return getClass().getSimpleName();
    }
}
