package SingletonPatterns;

public class DoubleCheckLockingSingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try{
                DocubleCheckLockingSingleton.getInstance().foo();

            }catch (Throwable t){
                t.printStackTrace();
            }

        }
    }
}
