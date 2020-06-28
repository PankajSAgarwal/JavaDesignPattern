
package exercise1;

//DON'T CHANGE
public class MailClient {
    public static void main(String... args) {
        Contact tjsn = new DistributionList();
        tjsn.add(new Person("john@aol.com"));
        Contact students = new DistributionList();
        students.add(new Person("peterz@intnet.mu"));
        tjsn.add(students);
        tjsn.add(new Person("anton@bea.com"));
        tjsn.sendMail(
                "Welcome to The Java Specialists' Newsletter");
    }
}
