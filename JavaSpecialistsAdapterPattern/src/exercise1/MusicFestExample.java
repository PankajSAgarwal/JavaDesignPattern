package exercise1;

public class MusicFestExample {
    public static void main(String... args) {
        MusicFest fest = new MusicFest();
        fest.addSinger(new Bass());
        fest.addSinger(new Soprano());
        // TODO: write the Rapper adapters
        fest.addSinger(new RapperObjectAdapter(new Rapper()));
        fest.addSinger(new RapperClassAdapter());
        fest.singAll();
    }
}
