package classicvisitor;

public interface ExpressionVisitor {
    void visit(DoubleExpression doubleExpression);

    void visit(AdditionExpression additionExpression);

}
