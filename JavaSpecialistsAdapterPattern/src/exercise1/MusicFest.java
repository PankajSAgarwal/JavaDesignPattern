package exercise1;

import java.util.*;

//DON'T CHANGE
public class MusicFest {
    private final List<Singer> singers = new ArrayList<>();

    public void addSinger(Singer singer) {
        singers.add(singer);
    }

    public void singAll() {
        singers.forEach(Singer::sing);
    }
}
