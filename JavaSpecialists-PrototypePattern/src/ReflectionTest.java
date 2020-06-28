import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set("Hello",value.get("cheers"));
        System.out.println("Hello");// output cheers

    }
}
