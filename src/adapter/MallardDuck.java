package adapter;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/16
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}