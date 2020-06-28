package exercise1;

import java.lang.reflect.*;

//DON'T CHANGE
//Abstract Factory
public abstract class Earth {
    private static volatile Earth earth;

    public static Earth getEarth() {
        if (earth == null) {
            synchronized (Earth.class) {
                if (earth == null) {
                    String className = System.getProperty("earthclass",
                        FastEarth.class.getName());
                    try {
                        Class<?> aClass = Class.forName(
                            className, true,
                            Thread.currentThread().getContextClassLoader());
                        Class<? extends Earth> clazz =
                            aClass.asSubclass(Earth.class);
                        Constructor<? extends Earth> constructor = clazz.getDeclaredConstructor();
                        constructor.setAccessible(true);
                        earth = constructor.newInstance();
                    } catch (ReflectiveOperationException e) {
                        throw new IllegalStateException(
                            "Singleton not initialized: " + className, e);
                    }
                }
            }
        }
        return earth;
    }

    protected Earth() {
    }

    public abstract void spin();

    public abstract void warmUp();

    public abstract Vehicle createVehicle();

    public abstract Animal createAnimal();
}
