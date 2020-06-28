package exercise1;

public class ConverterExample {
    public static void main(String... args) {
        // the following code should run and produce the output:
        // PANKAJ
        // 5.0
        // 4.0
        // INTERESTING
        // S\u00dcSS

        Converter chain = new DoubleTrimmerConverter(
            new StringUpperCaseConverter(
                new StringTrimmerConverter(null)
            )
        );
        System.out.println(chain.handle("    pankaj   "));
        System.out.println(chain.handle(4.5d));
        System.out.println(chain.handle(4.49999999999d));
        System.out.println(chain.handle("interesting"));
        System.out.println(chain.handle("s\u00fc\u00df"));
//
    }
}
