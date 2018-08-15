package factory.pizza.ChicagoPizza;

import factory.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Sauce and Veggie Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
