package SingletonPatterns;

public class EffectiveJavaHolderSingleton {

    public void foo() {

    }

    private static class SingletonHolder {
        static final EffectiveJavaHolderSingleton instance
                = makeSingleton();
    }

    //private constructor
    private EffectiveJavaHolderSingleton(){
        notifyAll();// will cause IllegalMonitorStateException
    }

    private static EffectiveJavaHolderSingleton makeSingleton() {
        return new EffectiveJavaHolderSingleton();
    }
    public static EffectiveJavaHolderSingleton getInstance(){
        return SingletonHolder.instance;
    }


}
