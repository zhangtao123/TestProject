package decorator;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/15
 * Time: 11:06
 * To change this template use File | Settings | File Templates.
 * Description:所有的调料装饰者都必须重新实现getDescription()方法。
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}