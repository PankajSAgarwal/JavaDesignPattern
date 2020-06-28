
package demo.b_originalvisitorwithminus;

public interface Visitor {
    void visitNumber(Number n);

    void visitPlus(Plus p);

    void visitMinus(Minus minus);

}
