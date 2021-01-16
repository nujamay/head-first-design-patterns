package headfirst.designpatterns.factory.factorymethod;

import headfirst.designpatterns.factory.factorymethod.pizzas.Pizza;
import headfirst.designpatterns.factory.factorymethod.pizzastores.ChicagoStylePizzaStore;
import headfirst.designpatterns.factory.factorymethod.pizzastores.NYStylePizzaStore;
import headfirst.designpatterns.factory.factorymethod.pizzastores.PizzaStore;

public class PizzaTestDrive {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYStylePizzaStore();
    PizzaStore chicagoStore = new ChicagoStylePizzaStore();

    Pizza nyStyleCheesePizza = nyStore.orderPizza("Cheese");
    System.out.println(nyStyleCheesePizza);

    System.out.println("");

    Pizza chicagoStylePepperoniPizza = chicagoStore.orderPizza("Pepperoni");
    System.out.println("We ordered a " + chicagoStylePepperoniPizza.getName());
    System.out.println(chicagoStylePepperoniPizza);

  }

}
