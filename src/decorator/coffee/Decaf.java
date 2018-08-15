package decorator.coffee;

import decorator.Beverage;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/15
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 * Description:低咖啡因
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}