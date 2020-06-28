package exercise1;

/**
 * Code without clear state machine transitions.  It is very
 * ugly.  Your job is to use the state pattern to clean things
 * up.
 */
public class Employee {
    private State state = new ProgrammerState();




    public int pay() {
        return state.pay(this);
    }

    public void advance() {
        state.advance(this);
    }

    public void fire() {
        state.fire(this);
    }


    void setState(State newState) {
        if(newState != state){
            System.out.println(state + " -> " + newState);
            this.state = newState;
        }
    }
}
