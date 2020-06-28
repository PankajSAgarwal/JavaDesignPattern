public class Demo {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(100);
        Memento m1 = ba.deposit(50);
        Memento m2 = ba.deposit(25);
        System.out.println(ba); // output 175
        // restore to m1
        ba.restore(m1); // output 150
        System.out.println(ba);
        // restore to m2
        ba.restore(m2); // output 175
        System.out.println(ba);

    }
}
