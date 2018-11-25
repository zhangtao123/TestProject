package src;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/2
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Box<K> {
    private K data;

    public Box(K data) {
        this.data = data;
    }

    public Box() {
    }

    public K getData() {
        return data;
    }

    public void setData(K data) {
        this.data = data;
    }
}