import java.util.concurrent.*;

public class ThreadPoolDirector {

    private final ThreadPoolBuilder builder;

    public ThreadPoolDirector(ThreadPoolBuilder builder) {
        this.builder = builder;
    }

    public ExecutorService construct(){

        ThreadPoolSizeParameters params = builder.buildSizeParameters();
        BlockingQueue<Runnable> queue = builder.buildWorkQueue();
        ThreadFactory factory = builder.buildThreadFactory();
        RejectedExecutionHandler reh = builder.buildRejectedExecutionHandler();
        return new ThreadPoolExecutor(
                params.getCorePoolSize(),
                params.getMaximumPoolSize(),
                params.getKeepAliveTime(),
                params.getUnit(),
                queue,
                factory,
                reh
        );
    }
}
