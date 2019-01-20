package src.thread.package24;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/1/20 17:10
 * @Version: 1.0
 */
public class TaskHandler implements Runnable {


    private final Request request;

    public TaskHandler(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("begin handle " + request);
        slowly();
        System.out.println("End handle " + request);
    }

    private void slowly() {
        try {
            TimeUnit.SECONDS.sleep(current().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
