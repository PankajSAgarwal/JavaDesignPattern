package CopyConstructors;

public class Demo {
    public static void main(String[] args) {
        Employee john = new Employee("John",
                new Address("XYZ", "Hyderabad", "India"));

        // Employee chris = john
        Employee chris = new Employee(john);
        chris.name = "Chris";

        System.out.println(john);
        System.out.println(chris);

    }
}
