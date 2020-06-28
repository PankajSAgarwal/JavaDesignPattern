package exercise1;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;

public class TextAnalyzerClient {
    public static void main(String... args) throws IOException {
        TextAnalyzer ta = new TextAnalyzer("newsletter.txt");
        int totalLetters = 0;
        for (int i = 0; i < 52; i++) {
            Map.Entry<Character, Long> entry = ta.getEntry(i);
                totalLetters += entry.getValue();
            System.out.print(entry + " ");
        }
        System.out.println();

        assertEquals(90, totalLetters);
    }
}
