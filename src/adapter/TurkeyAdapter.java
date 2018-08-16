package adapter;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/16
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}