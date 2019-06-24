package src.thread.packageall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/4/10 16:17
 * @Version: 1.0
 */
public class SemapDemo3 implements Runnable {

    private volatile int n = 0;
    private final ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        for (; ; ) {
            lock.lock();
            try {
                n++;
                TimeUnit.SECONDS.sleep(1);
                System.out.println("thread——name：" + Thread.currentThread().getName() + ",n:" + n);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        final SemapDemo3 semapDemo = new SemapDemo3();
        for (int i = 0; i < 2; i++) {
            exec.submit(semapDemo);
        }
    }
}
