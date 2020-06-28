
package exercise1;
//Invoker as per command pattern
public final class Switch {
    private final Command up,down;

    public Switch(Command up, Command down) {
        this.up = up;
        this.down = down;
    }

    public void flipUp() {

        //throw new UnsupportedOperationException("todo");
        up.execute();
    }

    public void flipDown() {

        //throw new UnsupportedOperationException("todo");
        down.execute();
    }
}
