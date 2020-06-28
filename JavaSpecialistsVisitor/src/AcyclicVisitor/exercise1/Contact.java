
package AcyclicVisitor.exercise1;

//DON'T CHANGE
public abstract class Contact {
    public void add(Contact contact) {
    }

    public void remove(Contact contact) {
    }

    public abstract void sendMail(String msg);

    public abstract void accept(Visitor visitor);
}
