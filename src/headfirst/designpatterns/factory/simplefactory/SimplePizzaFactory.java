package headfirst.designpatterns.factory.simplefactory;

import headfirst.designpatterns.factory.simplefactory.pizzas.CheesePizza;
import headfirst.designpatterns.factory.simplefactory.pizzas.GreekPizza;
import headfirst.designpatterns.factory.simplefactory.pizzas.PepperoniPizza;
import headfirst.designpatterns.factory.simplefactory.pizzas.Pizza;
import headfirst.designpatterns.factory.simplefactory.pizzas.StandardPizza;

public class SimplePizzaFactory {

  public Pizza createPizza(String type) {

    Pizza pizza = null;

    // Create concrete class by type.
    // This part is mutable. Type of pizza might be changed.
    if (type.equals("Cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("Greek")) {
      pizza = new GreekPizza();
    } else if (type.equals("Pepperoni")) {
      pizza = new PepperoniPizza();
    } else {
      pizza = new StandardPizza();
    }

    return pizza;
  }
}
