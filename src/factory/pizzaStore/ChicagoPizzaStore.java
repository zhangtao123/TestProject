package factory.pizzaStore;

import factory.Pizza;
import factory.PizzaStore;
import factory.pizza.ChicagoPizza.ChicagoStyleCheesePizza;
import factory.pizza.ChicagoPizza.ChicagoStyleClamPizza;
import factory.pizza.ChicagoPizza.ChicagoStylePepperoniPizza;
import factory.pizza.ChicagoPizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else if(type.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if (type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
