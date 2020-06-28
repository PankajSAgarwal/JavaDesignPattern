public class MailClient {

    public static void main(String[] args) {
        Contact tjsn = new DistributionList();
        tjsn.add(new Person("Pankaj@pankajsoft.com"));

        Contact students = new DistributionList();
        students.add(new Person("xyz@xyz.com"));
        tjsn.add(students);

        tjsn.add(new Person("yyy@yyy.com"));

        tjsn.sendMail("Special Offer..");
    }
}
