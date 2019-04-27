package src.thread.package23;

import java.util.concurrent.TimeUnit;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/1/20 14:50
 * @Version: 1.0
 */
public abstract class Latch {
    protected int limit;

    public Latch(int limit) {
        this.limit = limit;
    }

    public abstract void await() throws InterruptedException;

    public abstract void countDown();

    public abstract int getUnarrived();

    public abstract void await(TimeUnit unit, long time) throws InterruptedException, WaitTimeoutException;
}
