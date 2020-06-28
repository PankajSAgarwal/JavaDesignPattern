import java.util.Arrays;
/*
Clone method does a shallow copy rather than deep copy
 */
public class Person implements Cloneable{
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return new Person(names,address);// will not work as it copies refernces
        return new Person(names.clone(), (Address) address.clone());
    }
}
