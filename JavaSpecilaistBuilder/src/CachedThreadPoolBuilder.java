import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class CachedThreadPoolBuilder implements ThreadPoolBuilder {


    public CachedThreadPoolBuilder() {
    }

    @Override
    public ThreadPoolSizeParameters buildSizeParameters() {
        return new ThreadPoolSizeParameters(0,Integer.MAX_VALUE,1, TimeUnit.MINUTES);

    }

    @Override
    public BlockingQueue<Runnable> buildWorkQueue() {
        return new SynchronousQueue<>();
    }
}
