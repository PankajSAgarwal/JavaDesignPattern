package exercise1;
//Refined Abstraction
public class Circle extends Shape{

    private final int x;
    private final int y;
    private final int r;

    public Circle(Drawing drawing,
                  int x, int y, int r) {
        super(drawing);

        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        drawCircle(x,y,r);
    }
}
