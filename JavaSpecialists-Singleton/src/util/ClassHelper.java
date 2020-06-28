package util;

public class ClassHelper {
    public static Class<?> getClass(String className) throws ClassNotFoundException {
        Class<?> caller = Which.caller(2);
        String fullName = caller.getPackageName() + "." + className;
        return Class.forName(fullName);
    }
}
