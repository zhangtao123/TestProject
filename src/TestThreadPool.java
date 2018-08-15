import java.util.LinkedList;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/12
 * Time: 21:36
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TestThreadPool {
        public static void main(String[] args) {
            //ExecutorService executor = Executors.newSingleThreadExecutor();

            ExecutorService executor = Executors.newFixedThreadPool(10);


            ArrayBlockingQueue array = new ArrayBlockingQueue(10);

            LinkedBlockingQueue array1 = new LinkedBlockingQueue();


            for(int i=0;i<15;i++){
               /* try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                MyTask myTask = new MyTask(i);
                executor.execute(myTask);
                /*System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                        executor.getQueue().size()+"，已执行完毕的任务数目："+executor.getCompletedTaskCount());*/
            }
            executor.shutdown();
        }

}