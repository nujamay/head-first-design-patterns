package headfirst.designpatterns.factory.simplefactory;

import headfirst.designpatterns.factory.simplefactory.pizzas.Pizza;

public class PizzaStore {

  private final SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  Pizza orderPizza(String type) {

    Pizza pizza = factory.createPizza(type);

    // This part immutable. Operation might not be changed.
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

}
