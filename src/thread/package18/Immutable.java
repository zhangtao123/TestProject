package src.thread.package18;

import java.util.List;

public final class Immutable {
    private final List<String> list;

    public Immutable(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return this.list;
    }
}
