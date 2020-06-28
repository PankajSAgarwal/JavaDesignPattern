package exercise1;

import java.awt.*;
//ConcreteImplementor
public class DrawingImpl2 implements Drawing {
    private final static DrawingTool2 tool = new DrawingTool2();
    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        tool.drawLine(new Point(x1,y1),new Point(x2,y2));
    }

    @Override
    public void drawCircle(int x, int y, int r) {
        tool.drawCircle(new Point(x,y),r);
    }
}
