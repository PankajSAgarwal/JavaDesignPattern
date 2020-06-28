import java.util.ArrayList;
import java.util.List;

public class DistributionList extends Contact {

    private final List<Contact> contacts = new ArrayList<>();

    @Override
    public void add(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void remove(Contact contact) {

        contacts.remove(contact);
    }

    @Override
    public void sendMail(String msg) {
        for (Contact contact : contacts) {
            contact.sendMail(msg);

        }
    }


}
