package observer;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/14
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}