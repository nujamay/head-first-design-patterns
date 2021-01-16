package headfirst.designpatterns.factory.factorymethod.pizzastores;

import headfirst.designpatterns.factory.factorymethod.pizzas.ChicagoStyleCheesePizza;
import headfirst.designpatterns.factory.factorymethod.pizzas.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.factory.factorymethod.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    // Create concrete class by type.
    // This part is mutable. Type of pizza might be changed.
    if (type.equals("Cheese")) {
      return new ChicagoStyleCheesePizza();
    } else if (type.equals("Pepperoni")) {
      return new ChicagoStylePepperoniPizza();
    } else {
      return new ChicagoStyleCheesePizza();
    }
  }
}
