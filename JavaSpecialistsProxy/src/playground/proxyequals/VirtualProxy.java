package playground.proxyequals;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.function.Supplier;

public class VirtualProxy<T> implements InvocationHandler {
    private final Supplier<T> supplier;
    private T realSubject;

    public VirtualProxy(Supplier<T> supplier){
        this.supplier = supplier;
    }

    private T realSubject(){
        synchronized (this){
            if(realSubject == null){
                realSubject = supplier.get();
            }
        }
        return realSubject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(realSubject(),args);
    }
}
