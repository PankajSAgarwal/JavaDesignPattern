import java.util.concurrent.*;

public interface ThreadPoolBuilder {

    ThreadPoolSizeParameters buildSizeParameters();
    BlockingQueue<Runnable> buildWorkQueue();

    default ThreadFactory buildThreadFactory(){
        return Executors.defaultThreadFactory();
    }

    default RejectedExecutionHandler buildRejectedExecutionHandler(){
        return new ThreadPoolExecutor.AbortPolicy();
    }


}
