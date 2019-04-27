package src.thread.package18;

import java.util.Arrays;
import java.util.List;

public class ImmutableTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd");
        Immutable t = new Immutable(list);
        t.getList().set(0, "eee");
        t.getList().forEach(System.out::println);
    }
}
