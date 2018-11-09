package src.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread {
    ArrayBlockingQueue<String> abq;

    public Consumer(ArrayBlockingQueue<String> abq) {
        super();
        this.abq = abq;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                String msg = abq.remove();
                System.out.println("取数据：====" + msg + "\t剩余数据量：" + abq.size());
            } catch (Exception e) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
