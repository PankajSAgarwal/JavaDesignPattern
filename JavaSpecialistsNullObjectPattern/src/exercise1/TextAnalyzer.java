package exercise1;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class TextAnalyzer {
    private final Map<Character, Long> map ;
    private static final char[] characterArray =
            ("aeiouAEIOUbcdfghjklmnpqrstvwxyz" +
                "BCDFGHJKLMNPQRSTVWXYZ").toCharArray();

    public TextAnalyzer(String filename) throws IOException {
        Path path = Paths.get(filename);
        String contents = new String(Files.readAllBytes(path),
            StandardCharsets.UTF_8);
        map = contents.chars()
                        .filter(Character::isLetter)
                        .mapToObj(i->(char)i)
                        .collect(Collectors.groupingByConcurrent(Function.identity(),
                                    Collectors.counting()));
        System.out.println(map.getClass());

    }

    public Map.Entry<Character, Long> getEntry(int n) {
        Objects.checkIndex(n,characterArray.length);
        char key = characterArray[n];
        return Map.entry(key,
                map.getOrDefault(key,0L));
            }
}
