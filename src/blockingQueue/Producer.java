package blockingQueue;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/23
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 * Description:生产者类
 */
public class Producer implements Runnable {

    private String producerName;
    private WorkDesk workDesk;

    public Producer(String producerName, WorkDesk workDesk) {
        this.producerName = producerName;
        this.workDesk = workDesk;
    }

    @Override
    public void run() {
        try {
            for (; ; ) {
                System.out.println(producerName + "洗好一个盘子");
                workDesk.washDish();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}