public class Person extends Contact {

    private final String email;

    public Person(String email) {
        this.email = email;
    }

    @Override
    public void sendMail(String msg) {
        System.out.println("To: " + email);
        System.out.println("Message:" + msg);
        System.out.println();
    }
}
