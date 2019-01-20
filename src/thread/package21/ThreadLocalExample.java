package src.thread.package21;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.Thread.currentThread;

/**
 * @Description: 使用ThreadLocal設計綫程上下文
 * @author: zhangtao
 * @CreateDate: 2019/1/19 22:14
 * @Version: 1.0
 */
public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<Integer> tLocal = new ThreadLocal<>();
        IntStream.range(0,10).forEach(i->new Thread(()->{
            try {
                tLocal.set(i);
                System.out.println(currentThread()+" set i " + tLocal.get());
                TimeUnit.SECONDS.sleep(1);
                System.out.println(currentThread()+" get i " + tLocal.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start());
    }

}
