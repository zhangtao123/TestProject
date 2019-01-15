package src.thread.package19;

/*主要用于提交任务*/
public interface FutureService<IN, OUT> {
    //提交不需要返回值得任务，future.get方法返回的是null
    Future<?> submit(Runnable runnable);

    //提交需要返回值得任务，其中Task接口代替了Runnable接口
    Future<OUT> submit(Task<IN, OUT> task, IN input);

    //使用静态方法创建一个FutureService的实现
    static <T, R> FutureService<T, R> newService() {
        return new FutureServiceImpl<>();
    }
}
