package factory;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Shredded Mozzarella Chesses");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
