package GOFVisitor;

public class Plus extends Expression{

    private final Expression first;
    private final Expression second;

    public Plus(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void accept(Visitor v) {
        first.accept(v);
        second.accept(v);
        v.visit(this);
    }
}
