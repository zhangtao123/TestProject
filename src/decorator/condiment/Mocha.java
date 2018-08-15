package decorator.condiment;

import decorator.Beverage;
import decorator.CondimentDecorator;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/15
 * Time: 11:16
 * To change this template use File | Settings | File Templates.
 * Description:摩卡是一个装饰者，所以让它扩展自CondimentDecorator
 */
public class Mocha extends CondimentDecorator {

    /*用一个实例变量记录饮料，也就是被装饰者*/ Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}