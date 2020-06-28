
package demo.b_originalvisitorwithminus;

public class PrintVisitor implements Visitor {
    protected final StringBuilder sb = new StringBuilder();

    public void visitPlus(Plus s) {
        sb.append("+ ");
    }

    @Override
    public void visitMinus(Minus minus) {
        sb.append("- ");
    }

    public void visitNumber(Number n) {
        sb.append(n.getValue()).append(' ');
    }

    public String toString() {
        return sb.toString().trim();
    }
}
