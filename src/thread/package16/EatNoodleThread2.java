package src.thread.package16;

public class EatNoodleThread2 extends Thread {
    private final String name;

    private final TablewarePair tablewarePair;

    public EatNoodleThread2(String name, TablewarePair tablewarePair) {
        this.name = name;
        this.tablewarePair = tablewarePair;
    }

    @Override
    public void run() {
        while (true) {
            this.eat();
        }
    }


    private void eat() {
        synchronized (tablewarePair) {
            System.out.println(name + " take up " + tablewarePair.getLeftTool() + "(left)");
            System.out.println(name + "take up " + tablewarePair.getRightTool() + "(right)");
            System.out.println(name + " is eating now.");
            System.out.println(name + "put down " + tablewarePair.getRightTool() + "(right)");
            System.out.println(name + "put down " + tablewarePair.getLeftTool() + "(left)");
        }
    }


    public static void main(String[] args) {
        Tableware fork = new Tableware("fork");
        Tableware knife = new Tableware("knife");
        TablewarePair tablewarePair = new TablewarePair(fork, knife);
        /*这两个线程中的monitor引用是一致的，所以可以起到同步互斥的效果*/
        new EatNoodleThread2("A", tablewarePair).start();
        new EatNoodleThread2("B", tablewarePair).start();
    }

}
