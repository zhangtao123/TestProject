package src.thread.package18;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public final class FinalIntegerAccumulator {

    private final int init;

    private FinalIntegerAccumulator(int init) {
        this.init = init;
    }

    private FinalIntegerAccumulator(FinalIntegerAccumulator accumulator, int init) {
        this.init = accumulator.getValue() + init;
    }

    public FinalIntegerAccumulator add(int i) {
        return new FinalIntegerAccumulator(this, i);
    }

    private int getValue() {
        return this.init;
    }


    public static void main(String[] args) {
        FinalIntegerAccumulator integerAccumulator = new FinalIntegerAccumulator(0);
        IntStream.range(0, 3).forEach(i -> new Thread(() -> {
            int inc = 0;
            while (true) {
                int oldValue = integerAccumulator.getValue();
                int result = integerAccumulator.add(inc).getValue();
                System.out.println(oldValue + "+" + inc + "=" + result);
                if (inc + oldValue != result) {
                    System.err.println("ERROR:" + oldValue + "+" + inc + "=" + result);
                }
                inc++;
                slowly();
            }
        }).start());
    }


    private static void slowly() {
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
