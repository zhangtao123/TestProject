package src.thread.package16;

public class EatNoodleThread extends Thread {
    private final String name;

    private final Tableware leftTool;

    private final Tableware rightTool;

    public EatNoodleThread(String name, Tableware leftTool, Tableware rightTool) {
        this.name = name;
        this.leftTool = leftTool;
        this.rightTool = rightTool;
    }

    @Override
    public void run() {
        while (true) {
            this.eat();
        }
    }

    /*死锁的原因：交叉锁导致两个线程之间相互等待彼此释放持有的锁*/
    private void eat() {
        synchronized (leftTool) {
            System.out.println(name + " take up " + leftTool + "(left)");
            synchronized (rightTool) {
                System.out.println(name + "take up " + rightTool + "(right)");
                System.out.println(name + " is eating now.");
                System.out.println(name + "put down " + rightTool + "(right)");
            }
            System.out.println(name + "put down " + leftTool + "(left)");
        }
    }

    public static void main(String[] args) {
        Tableware fork = new Tableware("fork");
        Tableware knife = new Tableware("knife");

       /* Tableware fork1 = new Tableware("fork");
        Tableware knife1 = new Tableware("knife");*/
        /*这两个线程中的monitor引用是一致的，所以可以起到同步互斥的效果*/
        new EatNoodleThread("A", fork, knife).start();
        new EatNoodleThread("B", knife, fork).start();
    }
}
