
package AcyclicVisitor.exercise1;

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

    public void accept(Visitor visitor) {
        if(visitor instanceof Person)
            ((PersonVisitor) visitor).visit(this);


    }

    public String getEmail() {
        return email;
    }
}
