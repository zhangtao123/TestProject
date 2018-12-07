import java.util.LinkedList;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/12
 * Time: 21:36
 * To change this template use File | Settings | File Templates.
 * Description:线程池中，先生成核心线程，核心线程满了就往阻塞队列你塞，阻塞队列塞满了就再生成线程最大数，
 * 如果maximumPoolSize也满了，拒绝处理任务时的策略：RejectedExecutionHandler;
 *
 *
 *
 *
 *
 * 线程池中的核心线程数，当提交一个任务时，线程池创建一个新线程执行任务，直到当前线程数等于corePoolSize；
 * 如果当前线程数为corePoolSize，继续提交的任务被保存到阻塞队列中，等待被执行；如果阻塞队列满了，
 * 那就创建新的线程执行当前任务；直到线程池中的线程数达到maxPoolSize,这时再有任务来，只能执行reject()处理该任务
 */
public class TestThreadPool {
        public static void main(String[] args) {

            ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,6000,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(5));

//            ExecutorService executor1 = Executors.newSingleThreadExecutor();
//
//            ExecutorService executor2 = Executors.newFixedThreadPool(10);
//
            ArrayBlockingQueue array = new ArrayBlockingQueue(10);
//
            LinkedBlockingQueue array1 = new LinkedBlockingQueue();


            for(int i=0;i<15;i++){
                try {
                    Thread.sleep(300);
                    System.out.println(">>>>>>>>>>>>>>>>>>>>正在加入task"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MyTask myTask = new MyTask(i);
                executor.execute(myTask);
                System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                        executor.getQueue().size()+"，已执行完毕的任务数目："+executor.getCompletedTaskCount());
            }
            executor.shutdown();
        }

}