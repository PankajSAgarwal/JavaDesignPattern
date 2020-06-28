package SingletonPatterns;

public class EffectiveJavaHolderSingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try{
                EffectiveJavaHolderSingleton.getInstance().foo();

            }catch (Throwable t){
                t.printStackTrace();
            }

        }
    }
}
