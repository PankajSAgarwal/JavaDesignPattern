package util;

public class Which {
    public static Class<?> caller(int level) {
        try {
            return Class.forName(new Throwable().getStackTrace()[level].getClassName());
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
