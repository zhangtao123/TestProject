/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/12
 * Time: 21:37
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class MyTask implements Runnable {
    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
       /* try {
            Thread.currentThread().sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("task "+taskNum+"执行完毕");
    }
}