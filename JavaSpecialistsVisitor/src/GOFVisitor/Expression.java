package GOFVisitor;

public abstract class Expression {
    public abstract void accept(Visitor v);
}
