package blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/23
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class WorkDesk {
    //BlockingQueue<String> desk = new LinkedBlockingQueue<String>(10);

    BlockingQueue<String> desk = new SynchronousQueue(true);


    public void washDish() throws InterruptedException {
        desk.put("洗好一个盘子");
    }

    public String useDish() throws InterruptedException {
        return desk.take();
    }
}