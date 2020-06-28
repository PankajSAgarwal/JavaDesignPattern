package CollectionFactory;

import java.util.List;
import java.util.Map;

public class Client {
    private final List<Customer> name=
            CollectionFactory.getInstance().createList();
    private final Map<Customer,Account> accounts
            = CollectionFactory.getInstance().createMap();

    public static void main(String[] args) {


    }
}
