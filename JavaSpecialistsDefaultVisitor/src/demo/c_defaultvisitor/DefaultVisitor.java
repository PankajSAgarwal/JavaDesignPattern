
package demo.c_defaultvisitor;

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
}
