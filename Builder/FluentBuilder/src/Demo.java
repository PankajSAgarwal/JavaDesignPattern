public class Demo {
    public static void main(String[] args) {

        EmployeeBuilder pb = new EmployeeBuilder();
        Person pankaj = pb
                .withName("Pankaj")
                .worksAt("Developer")
                .build();

        System.out.println("pankaj = " + pankaj);
    }
}
