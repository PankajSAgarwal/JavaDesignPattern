package exercise3;

import java.lang.reflect.Constructor;

/**
 * Please make the Earth and the two methods spin() and warmUp() abstract.
 * <p/>
 * Next use the system property "earthclass" to decide what earth class to make.
 * Use the FastEarth as your default.
 */
public abstract class Earth {
    private volatile static Earth earth;

    public  static Earth getEarth() {
        if(earth == null) {
            synchronized (Earth.class) {

                String earthClassName = System.getProperty("earthclass",
                        FastEarth.class.getName());
                try {
                    Class<? extends Earth> earthClass = Class.forName(earthClassName, true,
                            Thread.currentThread().getContextClassLoader()).asSubclass(Earth.class);
                    Constructor<? extends Earth> earthConstructor = earthClass.getDeclaredConstructor();
                    earthConstructor.setAccessible(true);
                    earth = (Earth) earthConstructor.newInstance();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
        return earth;
    }

    protected Earth() {
    }

    public abstract void spin();

    public abstract void warmUp() ;
}
