
package demo.d_defaultvisitorwithminus;

public class PrintVisitor implements DefaultVisitor {
    protected final StringBuilder sb = new StringBuilder();
    @Override
    public void visitPlus(Plus s) {

        sb.append("+ ");
    }

    @Override
    public void visitNumber(Number n) {

        sb.append(n.getValue()).append(' ');
    }

    @Override
    public void visitExpression(Expression e) {
        sb.append("? ");
    }

    public String toString() {

        return sb.toString().trim();
    }
}
