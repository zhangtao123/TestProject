package src.thread.packageall;

import sun.misc.Unsafe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/4/10 16:17
 * @Version: 1.0
 */
public class SemapDemo5 {
    private static final Unsafe unsafe = Unsafe.getUnsafe();
    private static final long valueOffset;

    static {
        try {
            valueOffset = unsafe.objectFieldOffset
                    (AbstractQueuedSynchronizer.class.getDeclaredField("value"));
        } catch (Exception ex) { throw new Error(ex); }
    }


    private volatile int n = 0;
    private void do1(){
        //unsafe.compareAndSwapInt(this,)
    }


    public static void main(String[] args) {
        new SemapDemo5().do1();

    }
}
