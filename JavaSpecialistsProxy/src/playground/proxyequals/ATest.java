package playground.proxyequals;



public class ATest {

    public static void main(String[] args) {
        C c1 = new C(new C(new C(new B(42))));
        C c2 = new C(c1);
        //A dyn = Proxies.makeSimpleProxy(A.class,c1);
        B b1 = new B(42);
        B b2 = new B(42);
        System.out.println(b1.equals(b2));//true
        System.out.println(b2.equals(b1));//true
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(b1));
        System.out.println(b1.equals(c1));

    }
}
