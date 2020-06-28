import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoggingHandler implements InvocationHandler {

    private final Object target;
    private Map<String,Integer> calls = new ConcurrentHashMap<>();

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String name = method.getName();
        if(name.contains("toString")){
            return calls.toString();
        }
        calls.merge(name,1,Integer::sum);
        return method.invoke(target,args);

    }
}
