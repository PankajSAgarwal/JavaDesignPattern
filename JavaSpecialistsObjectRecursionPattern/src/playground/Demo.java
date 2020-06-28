package playground;

public class Demo {


    public static void main(String[] args) {
        Address address = new Address("123 Village",
                "Mulund","123456","India");
        Employee emp = new Employee("Manager",address);
        StringBuilder sb = new StringBuilder();
        System.out.println(emp.append(sb));
        
    }
}
