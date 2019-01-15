package src.thread.package19;
/*获取计算结果和判断任务是否完成*/
public interface Future<T> {
    T get() throws InterruptedException;

    boolean done();
}
