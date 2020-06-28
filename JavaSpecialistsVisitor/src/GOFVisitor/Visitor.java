package GOFVisitor;

public interface Visitor {
    void visit(Number n);
    void visit(Plus p);
}
