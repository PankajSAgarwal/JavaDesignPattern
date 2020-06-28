package exercise1;

//ConcreteImplementor
public class DrawingImpl1 implements Drawing {
    private final DrawingTool1 tool1 = new DrawingTool1();
    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        tool1.draw_line(x1,x2,y1,y2);
    }

    @Override
    public void drawCircle(int x, int y, int r) {
        tool1.draw_circle(x,y,r);
    }
}
