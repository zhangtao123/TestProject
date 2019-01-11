package src.thread.package18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ImmutableTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");
        Immutable t= new Immutable(list);
        IntStream.range(0,3).forEach(i->new Thread(()->{

        }));
    }
}
