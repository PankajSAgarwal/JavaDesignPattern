
package exercise2;

import java.lang.reflect.*;
import java.util.function.*;

//DON'T CHANGE
public class Proxies {
    public static <T> T virtual(ClassLoader loader, Class<T> subject, Supplier<? extends T> supplier) {
        return subject.cast(Proxy.newProxyInstance(
            loader, new Class<?>[]{subject}, new VirtualProxy<T>(supplier)));
    }

    public static <T> T virtual(Class<T> subject, Supplier<? extends T> supplier) {
        return virtual(Thread.currentThread().getContextClassLoader(),
            subject, supplier);
    }

    public static <T> T makeSimpleProxy(Class<T> subject,T realSubject){
        return makeSimpleProxy(Thread.currentThread().getContextClassLoader(),
                subject,
                realSubject);

    }

    private static <T> T makeSimpleProxy(ClassLoader contextClassLoader, Class<T> subject, T realSubject) {
        return subject.cast(Proxy.newProxyInstance(contextClassLoader,
                new Class<?>[]{subject},
                ((proxy, method, args) -> method.invoke(realSubject,args))));
    }

    private static class VirtualProxy<T> implements InvocationHandler {
        private final Supplier<? extends T> supplier;
        private volatile T realSubject;

        public VirtualProxy(Supplier<? extends T> supplier) {
            this.supplier = supplier;
        }

        private T realSubject() {
            if(realSubject == null){

                synchronized (this) {
                    if (realSubject == null)
                        realSubject = supplier.get();
                }

            }
            return realSubject;
        }

        // called whenever any method is called on interface
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return method.invoke(realSubject(), args);
        }
    }
}
