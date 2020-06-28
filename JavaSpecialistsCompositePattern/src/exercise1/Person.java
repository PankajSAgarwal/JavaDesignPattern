
package exercise1;

//DON'T CHANGE
public class Person extends Contact {
    private final String email;

    public Person(String email) {
        this.email = email;
    }

    public void sendMail(String msg) {
        System.out.println("To: " + email);
        System.out.println("Msg: " + msg);
        System.out.println();
    }

    public String toString() {
        return "<" + email + ">";
    }
}
