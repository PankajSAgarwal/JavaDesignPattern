import java.util.concurrent.TimeUnit;

public class ThreadPoolSizeParameters {

    private final int corePoolSize,maximumPoolSize;
    private final long keepAliveTime;
    private final TimeUnit unit;

    public ThreadPoolSizeParameters(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit) {
        this.corePoolSize = corePoolSize;
        this.maximumPoolSize = maximumPoolSize;
        this.keepAliveTime = keepAliveTime;
        this.unit = unit;
    }


    public int getCorePoolSize() {
        return corePoolSize;
    }

    public int getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public long getKeepAliveTime() {
        return keepAliveTime;
    }

    public TimeUnit getUnit() {
        return unit;
    }
}
