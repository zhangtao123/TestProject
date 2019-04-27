package src.thread.package23;

import java.util.concurrent.TimeUnit;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/1/20 14:50
 * @Version: 1.0
 */
public class CountDownLatch extends Latch {

    protected Runnable runnable;

    public CountDownLatch(int limit, Runnable runnable) {
        super(limit);
        this.runnable = runnable;
    }

    @Override
    public void await() throws InterruptedException {
        synchronized (this) {
            while (limit > 0) {
                this.wait();
            }
        }
        if (null != runnable) {
            new Thread(runnable).start();
        }
    }

    @Override
    public void countDown() {
        synchronized (this) {
            if (limit < 0)
                throw new IllegalStateException("all of tsak already arrived");
            limit--;
            this.notifyAll();
        }
    }

    @Override
    public int getUnarrived() {
        return limit;
    }

    @Override
    public void await(TimeUnit unit, long time) throws InterruptedException, WaitTimeoutException {
        if (time < 0)
            throw new IllegalArgumentException("the time is valid");
        long remainingNanos = unit.toNanos(time);
        final long endNanos = System.nanoTime() + remainingNanos;
        synchronized (this) {
            while (limit > 0) {
                if (TimeUnit.NANOSECONDS.toMillis(remainingNanos) <= 0)
                    throw new WaitTimeoutException("the wait time over specify time");
                this.wait(TimeUnit.NANOSECONDS.toMillis(remainingNanos));
                remainingNanos = endNanos - System.nanoTime();
            }
        }
        if (null != runnable) {
            new Thread(runnable).start();
        }
    }
}
