package playground;
import static playground.Server.Builder;

public class Main {

    public static void main(String[] args) {
        Server server1 = new Server.Builder("/").port(8080).build();
        Server server2 = new Builder("/").port(7070).build();
    }
}
