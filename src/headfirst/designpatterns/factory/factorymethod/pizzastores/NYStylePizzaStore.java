package headfirst.designpatterns.factory.factorymethod.pizzastores;

import headfirst.designpatterns.factory.factorymethod.pizzas.NYStyleCheesePizza;
import headfirst.designpatterns.factory.factorymethod.pizzas.NYStylePepperoniPizza;
import headfirst.designpatterns.factory.factorymethod.pizzas.Pizza;

public class NYStylePizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    // Create concrete class by type.
    // This part is mutable. Type of pizza might be changed.
    if (type.equals("Cheese")) {
      return new NYStyleCheesePizza();
    } else if (type.equals("Pepperoni")) {
      return new NYStylePepperoniPizza();
    } else {
      return new NYStyleCheesePizza();
    }
  }
}
