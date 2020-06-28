package exercise1;

// Abstraction
public abstract class Shape {
    private final Drawing drawing;

    public Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    public abstract void draw();
    protected final void drawCircle(int x,int y,int radius ){
        drawing.drawCircle(x,y,radius);
    }

    protected final void drawLine(int x1, int y1, int x2, int y2){
        drawing.drawLine(x1,y1,x2,y2);
    }
}
