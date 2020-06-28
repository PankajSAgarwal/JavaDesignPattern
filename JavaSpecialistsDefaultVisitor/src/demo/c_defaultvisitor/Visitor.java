
package demo.c_defaultvisitor;

public interface Visitor {
    void visitNumber(Number n);

    void visitPlus(Plus p);
}
