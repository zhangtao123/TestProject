package src.thread.package5;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EventClient {

    public static final EventQueue eventQueue = new EventQueue();

    public static void main(String[] args) {

        List<Thread> offers = IntStream.range(1, 4).mapToObj(EventClient::createOffer).collect(Collectors.toList());
        List<Thread> takes = IntStream.range(1, 4).mapToObj(EventClient::createTake).collect(Collectors.toList());
        offers.forEach(Thread::start);
        takes.forEach(Thread::start);
    }

    public static Thread createOffer(int seq) {
        return new Thread(() -> {
            for (; ; ) {
                eventQueue.offer((new EventQueue.Event()));
            }
        }, "client" + seq);
    }

    public static Thread createTake(int seq) {
        return new Thread(() -> {
            for (; ; ) {
                eventQueue.take();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "consumer" + seq);
    }
}
