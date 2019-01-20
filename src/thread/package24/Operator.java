package src.thread.package24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @Description: 相当于一个接线员，当由于电花打进来是，接线员将客户的请求封装成一个工单request，然后开辟一个工作线程去处理
 * @Author: zhangtao
 * @CreateDate: 2019/1/20 17:04
 * @Version: 1.0
 */
public class Operator {
    private final ExecutorService threadPool = new ScheduledThreadPoolExecutor(10);

    public void call(String business) {
        TaskHandler taskHandler = new TaskHandler(new Request(business));
        threadPool.submit(taskHandler);
    }

}
