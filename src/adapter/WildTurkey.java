package adapter;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/16
 * Time: 17:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}