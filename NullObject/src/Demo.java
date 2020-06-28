import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {

    @SuppressWarnings("unchecked")
    public static <T> T noOp(Class<T> itf){
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                (proxy,method,args)->{
                    if(method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                });
    }
    public static void main(String[] args) {
        //ConsoleLog log = new ConsoleLog();
        //NullLog nullLog = new NullLog();
        Log log = noOp(Log.class);
        BankAccount account = new BankAccount(log);
        account.deposit(100);
        BankAccount nullAccount = new BankAccount(log);
        nullAccount.deposit(100);
    }
}
