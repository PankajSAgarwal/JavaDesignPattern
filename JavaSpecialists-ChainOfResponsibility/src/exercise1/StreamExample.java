package exercise1;


import java.util.stream.Stream;

public class StreamExample {
    public static void main(String... args) {
        // the following code should run and produce the output:
        // PANKAJ
        // 5.0
        // 4.0
        // INTERESTING
        // S\u00dcSS or SÜSS

        Converter chain = new DoubleTrimmerConverter(
            new StringUpperCaseConverter(
                new StringTrimmerConverter(null)
            )
        );
        Stream.<Object>of("    pankaj   ", 4.5d, 4.49999999999d, "interesting", "süß")
                .map(StreamExample::trimString)
                .map(StreamExample::upperCaseString)
                .map(StreamExample::trimDouble)
                .forEach(System.out::println);

    }

    private static Object trimString(Object o){
        return o instanceof String ? ((String)o).trim():o;
    }
    private static Object upperCaseString(Object o){
        return o instanceof String ? ((String)o).toUpperCase() : o;
    }

    private static Object trimDouble(Object o){
        return o instanceof Double ? (double)(Math.round((Double)o)):o;
    }

//

}
