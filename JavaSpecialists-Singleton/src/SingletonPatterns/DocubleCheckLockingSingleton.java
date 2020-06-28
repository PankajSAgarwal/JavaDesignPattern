package SingletonPatterns;

public class DocubleCheckLockingSingleton {
    // volatile extremely important
    private static volatile DocubleCheckLockingSingleton instance;


    public static DocubleCheckLockingSingleton getInstance(){

        if(instance == null){
            synchronized (DocubleCheckLockingSingleton.class){
                if(instance == null){
                    instance = new DocubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

    private DocubleCheckLockingSingleton() {
        // purposefully done to cause IllegalMonitorStateException:Don't do it in real code
        notifyAll();
    }

    public void foo(){}

    public void bar(){}

}
