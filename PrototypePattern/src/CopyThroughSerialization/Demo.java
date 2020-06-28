package CopyThroughSerialization;

import org.apache.commons.lang3.SerializationUtils;

public class Demo {

    public static void main(String[] args) {
        Foo foo = new Foo(42, "life");
        Foo foo1 = SerializationUtils.roundtrip(foo);

        foo1.whatever = "xyz";

        System.out.println(foo);
        System.out.println(foo1);
    }
}
