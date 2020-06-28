package exercise1;

//Refined Abstraction

public class Rectangle extends Shape{

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Rectangle(Drawing drawing, int x1, int y1, int x2, int y2) {
        super(drawing);

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        drawLine(x1,y1,x2,y1);
        drawLine(x1,y2,x2,y2);
        drawLine(x1,y1,x1,y2);
        drawLine(x2,y1,x2,y2);
    }
}
