package src.thread.package24;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/1/20 17:12
 * @Version: 1.0
 */
public class Request {

    private final String business;

    public Request(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "Request{" +
                "business='" + business + '\'' +
                '}';
    }
}
