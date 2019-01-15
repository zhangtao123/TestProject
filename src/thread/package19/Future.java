package src.thread.package19;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/1/15 22:01
 * @Version: 1.0
 */
public interface Future<T> {
    T get() throws InterruptedException;

    boolean done();
}