package src.jdk8.optional;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @Description: java类作用描述
 * @Author: zHangTao
 * @CreateDate: 2019/6/24 22:57
 * @Version: 1.0
 */
public class OptionalApi {
    private static void ofTest() {
        Optional<String> optional = Optional.of("123");
        System.out.println(optional.get());
        Optional<String> optional1 = Optional.of(null);
        System.out.println(optional1.get());
    }

    private static void ofNullableTest() {
        Optional optional = Optional.ofNullable(null);
        System.out.println(optional.get());
    }

    private static void emptyTest() {
        Optional optional = Optional.empty();
        System.out.println(optional.get());
    }

    private static void orElseTest() {
        Optional<String> optional = Optional.empty();
        String str = optional.orElse("default");
        System.out.println(str);
        optional = Optional.of("test");
        String str1 = optional.orElse("default");
        System.out.println(str1);
    }

    private static void orElseGetTest() {
        Optional<String> optional = Optional.empty();
        System.out.println(optional.orElseGet(() -> "123"));
    }

    public static void main(String[] args) {
        //ofTest();
        //emptyTest();
        //ofNullableTest();
        //orElseTest();
        orElseGetTest();
    }
}
