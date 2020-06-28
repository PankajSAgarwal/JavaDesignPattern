package GOFVisitor;

public class Number extends Expression{
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
