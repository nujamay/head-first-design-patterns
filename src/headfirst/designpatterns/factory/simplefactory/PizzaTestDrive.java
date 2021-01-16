package headfirst.designpatterns.factory.simplefactory;

import headfirst.designpatterns.factory.simplefactory.pizzas.Pizza;

public class PizzaTestDrive {

  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);

    Pizza cheesePizza = store.orderPizza("Cheese");
    System.out.println("We ordered a " + cheesePizza.getName());
    System.out.println(cheesePizza);

    System.out.println("--------");

    Pizza greekPizza = store.orderPizza("Greek");
    System.out.println("We ordered a " + greekPizza.getName());
    System.out.println(greekPizza);

  }

}
