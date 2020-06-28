
package demo.d_defaultvisitorwithminus;

public interface Visitor {
    void visitNumber(Number n);

    void visitPlus(Plus p);

    void visitMinus(Minus m);

}
