package thread.package3;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/12/23
 * Time: 21:56
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = IntStream.range(1, 4).mapToObj(ThreadJoin::create).collect(Collectors.toList());
        threads.forEach(Thread::start);



        threads.get(0).join();
        /*for (Thread thread : threads) {
            thread.join();
        }*/
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "#" + i);
            shortSleep();
        }
    }


    private static Thread create(int seq) {
        return new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "#" + i);
                shortSleep();
            }
        }, String.valueOf(seq));
    }

    private static void shortSleep() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}