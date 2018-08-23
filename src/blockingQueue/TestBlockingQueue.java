package blockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/23
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TestBlockingQueue {
    public static void main(String[] args) {
        WorkDesk workDesk = new WorkDesk();

        ExecutorService service = Executors.newCachedThreadPool();
        //四个生产者线程
        Producer producer1 = new Producer("生产者-1-", workDesk);
        Producer producer2 = new Producer("生产者-2-", workDesk);
        Producer producer3 = new Producer("生产者-3-", workDesk);
        Producer producer4 = new Producer("生产者-4-", workDesk);
        //两个消费者线程
        Consumer consumer1 = new Consumer("消费者-1-", workDesk);
        Consumer consumer2 = new Consumer("消费者-2-", workDesk);

        service.execute(producer1);
        service.execute(producer2);
        service.execute(producer3);
        service.execute(producer4);
        service.execute(consumer1);
        service.execute(consumer2);

    }
}