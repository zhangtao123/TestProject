package decorator;

import decorator.coffee.DarkRoast;
import decorator.coffee.Espresso;
import decorator.coffee.HouseBlend;
import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/15
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class StarbuzzCoffee {


    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        //制造出一个DarkRoast对象
        Beverage beverage2 = new DarkRoast();
        //用Mocha装饰它
        beverage2 = new Mocha(beverage2);
        //用第二个Mocha装饰它
        beverage2 = new Mocha(beverage2);
        //用Whip装饰它
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        //再来一杯调料为豆浆、摩卡、奶泡的HouseBlend咖啡
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

/*
        FileInputStream f = new FileInputStream();
        BufferedInputStream bs = new BufferedInputStream(f);*/
    }


}