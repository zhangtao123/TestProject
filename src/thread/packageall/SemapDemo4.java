package src.thread.packageall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/4/10 16:17
 * @Version: 1.0
 */
public class SemapDemo4 {

    private volatile int n = 0;
    private final ReentrantLock lock = new ReentrantLock();

    private void do1() {
        lock.lock();
        try {
            System.out.println("開始");
            do2();
            System.out.println("结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    private void do2() throws InterruptedException {
        System.out.println("開始2");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("结束2");
    }


    public static void main(String[] args) {
        new SemapDemo4().do1();

    }
}
