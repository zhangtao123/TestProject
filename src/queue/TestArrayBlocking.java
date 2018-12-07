package src.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestArrayBlocking {
    public static void main(String[] args) {
        final ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        LinkedBlockingQueue<String> linkQueue = new LinkedBlockingQueue<>();

        Thread consumer = new Consumer(queue);
        Thread product1 = new Producer(queue);
        Thread product2 = new Producer(queue);
        Thread product3 = new Producer(queue);
        Thread product4 = new Producer(queue);
        consumer.start();
        product1.start();
        product2.start();
        product3.start();
        product4.start();
    }
}
