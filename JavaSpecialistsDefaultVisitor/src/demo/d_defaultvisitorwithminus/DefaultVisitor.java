
package demo.d_defaultvisitorwithminus;

public interface DefaultVisitor extends Visitor {
    default void visitExpression(Expression e){
        // do nothing
    };

    default void visitNumber(Number n){

        visitExpression(n);
    };

    default void visitPlus(Plus p){

        visitExpression(p);
    };

    default void visitMinus(Minus m){

        visitExpression(m);
    };
}
