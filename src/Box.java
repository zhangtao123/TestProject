package src;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/2
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public Box() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}