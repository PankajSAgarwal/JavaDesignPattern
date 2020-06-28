import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolBuilder implements ThreadPoolBuilder{

    private final int size;

    public FixedThreadPoolBuilder(int size) {
        this.size = size;
    }

    @Override
    public ThreadPoolSizeParameters buildSizeParameters() {
        return new ThreadPoolSizeParameters(size,size,0, TimeUnit.SECONDS);
    }

    @Override
    public BlockingQueue<Runnable> buildWorkQueue() {
        return new LinkedBlockingQueue<>();
    }
}
