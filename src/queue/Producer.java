package src.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread {
    ArrayBlockingQueue<String> abq;

    public Producer(ArrayBlockingQueue<String> abq) {
        this.abq = abq;
    }

    @Override
    public void run() {
        int i = 0;
        boolean flag;
        while(true) {
            try {
                Thread.sleep(1000);
                flag = abq.add(""+i);
                System.out.println("状态:"+flag+"存放数据：===="+i+"\t剩余数据量："+abq.size());
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
