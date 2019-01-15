package src.thread.package19;


import java.util.concurrent.atomic.AtomicInteger;

/*主要作用是在于提交任务时创建一个新的线程来受理该任务，进而达到任务异步执行的效果*/
public class FutureServiceImpl<IN, OUT> implements FutureService {

    private final static String FUTURE_THREAD_PREFIX = "FUTURE-";

    private final AtomicInteger nextCounter = new AtomicInteger(0);

    private String getNextName() {
        return FUTURE_THREAD_PREFIX + nextCounter.getAndIncrement();
    }

    @Override
    public Future<?> submit(Runnable runnable) {
        final FutureTask<Void> future = new FutureTask<>();
        new Thread(() -> {
            runnable.run();
            future.finish(null);
        }, getNextName()).start();
        return future;
    }

    @Override
    public Future submit(Task task, Object input) {
        final FutureTask<OUT> future = new FutureTask<>();
        new Thread(() -> {
            OUT result = (OUT) task.get(input);
            future.finish(result);
        }, getNextName()).start();
        return future;
    }


}
