package src.thread.packageall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/4/10 16:17
 * @Version: 1.0
 */
public class SemapDemo2 implements Runnable {

    private volatile int n = 0;

    @Override
    public void run() {
        for (; ; ) {
            try {
                semp.acquire();
                n++;
                TimeUnit.SECONDS.sleep(1);
                System.out.println("thread——name：" + Thread.currentThread().getName() + ",n:" + n);
                semp.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    final Semaphore semp = new Semaphore(1, true);

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(3);
        final SemapDemo2 semapDemo = new SemapDemo2();
        for (int i = 0; i < 3; i++) {
            exec.submit(semapDemo);
        }
    }
}
