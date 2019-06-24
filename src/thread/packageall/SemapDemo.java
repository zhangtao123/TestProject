package src.thread.packageall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/4/10 16:17
 * @Version: 1.0
 */
public class SemapDemo implements Runnable {

    private volatile int n = 0;

    @Override
    public void run() {
        try {
            semp.acquire();
            Thread.sleep(2000);
            System.out.println("thread——name：" + Thread.currentThread().getName() + " done,time:" + System.currentTimeMillis() / 1000);
            semp.release();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    final Semaphore semp = new Semaphore(1);

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(15);
        final SemapDemo semapDemo = new SemapDemo();
        for (int i = 0; i < 15; i++) {
            exec.submit(semapDemo);
        }
    }
}
