package blockingQueue;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/23
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 * Description:消费者类
 */
public class Consumer implements Runnable {

    private String consumerName;
    private WorkDesk workDesk;

    public Consumer(String consumerName, WorkDesk workDesk) {
        this.consumerName = consumerName;
        this.workDesk = workDesk;
    }

    @Override
    public void run() {
        try {
            for (; ; ) {
                System.out.println(consumerName + "使用一个盘子");
                workDesk.useDish();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}