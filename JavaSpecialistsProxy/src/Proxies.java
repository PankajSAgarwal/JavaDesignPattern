import java.lang.reflect.Proxy;
import java.util.function.Supplier;

public class Proxies {

    public static<T> T virtual(ClassLoader loader,
                               Class<T> subject,
                               Supplier<T> supplier){

        return subject.cast(Proxy.newProxyInstance(
           loader,new Class<?>[]{subject},new VirtualProxy<>(supplier)
        ));
    }

    public static<T> T virtual(Class<T> subject,Supplier<T> supplier){
        return virtual(Thread.currentThread().getContextClassLoader(),
                subject,supplier);
    }
}
