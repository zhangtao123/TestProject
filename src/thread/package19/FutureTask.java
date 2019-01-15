package src.thread.package19;

public class FutureTask<T> implements Future<T> {

    //计算结果
    private T result;

    //任务是否完成
    private boolean isDone = false;

    //定义对象锁
    private final Object LOCK = new Object();

    @Override
    public T get() throws InterruptedException {
        synchronized (LOCK) {
            while (!isDone) {
                LOCK.wait();
            }
            return result;
        }
    }


    //主要用于为FutureTask设置计算结果
    protected void finish(T result) {
        synchronized (LOCK) {
            if (isDone)
                return;
            this.result = result;
            this.isDone = true;
            LOCK.notifyAll();
        }
    }


    @Override
    public boolean done() {
        return isDone;
    }
}
