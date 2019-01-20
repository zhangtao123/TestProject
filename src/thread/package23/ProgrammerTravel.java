package src.thread.package23;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/1/20 15:12
 * @Version: 1.0
 */
public class ProgrammerTravel extends Thread {
    private final Latch latch;

    private final String programmer;

    private final String transportation;

    public ProgrammerTravel(Latch latch, String programmer, String transportation) {
        this.latch = latch;
        this.programmer = programmer;
        this.transportation = transportation;
    }

    @Override
    public void run() {
        System.out.println(programmer + " start take the transportation [" + transportation + "]");
        try {
            TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(programmer + " arrived by " + transportation);
        latch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        Latch latch = new CountDownLatch(4, () -> System.out.println("我們已經開始了。。。"));
        new ProgrammerTravel(latch, "Alex", "Bus").start();
        new ProgrammerTravel(latch, "Gavin", "Walking").start();
        new ProgrammerTravel(latch, "Jack", "Subway").start();
        new ProgrammerTravel(latch, "Dillon", "Bicycle").start();
        /*latch.await();*/
        try {
            latch.await(TimeUnit.SECONDS, 9);
            System.out.println(" == all of programmer arrived ==");
        } catch (WaitTimeoutException e) {
            e.printStackTrace();
        }
    }
}
