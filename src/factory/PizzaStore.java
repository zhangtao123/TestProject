package factory;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/15
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public abstract class PizzaStore {
    Pizza pizza;
    public Pizza orderPizza(String type){
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}