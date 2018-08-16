package factory.pizzaStore;

import factory.Pizza;
import factory.PizzaStore;
import factory.pizza.nypizza.NYStyleCheesePizza;
import factory.pizza.nypizza.NYStyleClamPizza;
import factory.pizza.nypizza.NYStylePepperoniPizza;
import factory.pizza.nypizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
