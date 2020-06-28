package exercise1;

//Refined Abstraction

public class Triangle extends Shape{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public Triangle(Drawing drawing,
                    int x1, int y1,
                    int x2, int y2,
                    int x3, int y3) {
        super(drawing);


        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public void draw() {
        drawLine(x1,y1,x2,y2);
        drawLine(x1,y1,x3,y3);
        drawLine(x2,y2,x3,y3);
    }
}
