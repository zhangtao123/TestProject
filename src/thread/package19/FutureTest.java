package src.thread.package19;

import java.text.SimpleDateFormat;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2019/1/15
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class FutureTest {
    public void do1() throws InterruptedException {
        FutureService<Void, Void> service = FutureService.newService();
        Future<?> future = service.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am finish do.");
        });
        System.out.println("result:" + future.get());
    }


    public void do2() throws InterruptedException {
        FutureService<String, Integer> service = FutureService.newService();
        Future<Integer> future = service.submit(input -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return input.length();
        }, "hello");
        System.out.println(future.get());
    }


    public void do3() {
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2222222222");
        }, "thread1").start();
        System.out.println("111111111");
    }


    public static void main(String[] args) throws InterruptedException {
        new FutureTest().do1();
        //new FutureTest().do2();
        //new FutureTest().do3();
    }
}