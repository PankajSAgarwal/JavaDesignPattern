public class ViewPort {

    private final Buffer buffer;
    private final int width;
    private final int height;
    private final int offSetX;
    private final int offSetY;

    public ViewPort(Buffer buffer, int width, int height, int offSetX, int offSetY) {
        this.buffer = buffer;
        this.width = width;
        this.height = height;
        this.offSetX = offSetX;
        this.offSetY = offSetY;
    }

    public char charAt(int x, int y){
        return buffer.charAt(x+offSetX,y+offSetY);
    }

}
