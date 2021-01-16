package headfirst.designpatterns.factory.factorymethod.pizzastores;

import headfirst.designpatterns.factory.factorymethod.pizzas.Pizza;

public abstract class PizzaStore {

  public PizzaStore() {
  }

  // Each Pizza store must use common order operation.
  public Pizza orderPizza(String type) {

    Pizza pizza = createPizza(type);

    // This part immutable. Operation might not be changed.
    System.out.println("--- Making a " + pizza.getName() + " ---");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  // Declare abstract method to create Pizza.
  // Each Pizza store can create their original Pizza.
  protected abstract Pizza createPizza(String type);

}
