public class Demo {

    public static void main(String[] args) {
        // without facade
        Buffer buffer = new Buffer(30, 20);
        ViewPort viewPort = new ViewPort(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewPort(viewPort);
        console.render();

        // with facade
        Console console1 = new Console(30,20);
        console1.render();

    }
}
