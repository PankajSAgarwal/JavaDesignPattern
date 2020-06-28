package SingletonPatterns;

public class LazySingleton {
    private final static LazySingleton instance = new LazySingleton();

    public static LazySingleton getInstance(){
        return instance;
    }

    private LazySingleton() {
        // purposefully done to cause IllegalMonitorStateException:Don't do it in real code
        notifyAll();
    }

    public void foo(){}

    public void bar(){}

}
