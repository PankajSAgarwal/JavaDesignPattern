public class Client {
    public static void main(String[] args) {
        System.out.println(
                new Sum(
                        new Value("1/3"), new Product(
                        new Value("2/3"), new Value("2/1"), new Value("3/4")), new Value("1/2"),
                        new Value("-5/6"))
        );//output 1

        System.out.println(
                new Sum(
                        new Value("1/2"),
                        new Value("1/4"),
                        new Value("1/8"),
                        new Value("1/16"),
                        new Value("1/32"),
                        new Value("1/64"))
        );// output 63/64
    }
}
