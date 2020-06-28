public class Demo {

    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                    .at("123 XYZ")
                    .in("ABC Land")
                    .withPostCode("123456")
                .works()
                    .at("XYZ Corp")
                    .asA("developer")
                    .earning(100_000)
                .build();
        System.out.println(person);


    }
}
