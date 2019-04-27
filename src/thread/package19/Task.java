package src.thread.package19;

/**
 * 提供给调用者实现计算逻辑之用
 * */
@FunctionalInterface
public interface Task<IN, OUT> {
    OUT get(IN input);
}
