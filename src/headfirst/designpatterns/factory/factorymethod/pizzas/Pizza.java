package headfirst.designpatterns.factory.factorymethod.pizzas;

import java.util.ArrayList;

public abstract class Pizza {

  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList();

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding source...");
    System.out.println("Adding toppings: ");
    for (String topping : toppings) {
      System.out.println("   " + topping);
    }
  }

  public void bake() {
    System.out.println("Baking for 25 minutes at 350...");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices...");
  }

  public void box() {
    System.out.println("Place the pizza in official PizzaStore box.");
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Pizza{");
    sb.append("name='").append(name).append('\'');
    sb.append(", dough='").append(dough).append('\'');
    sb.append(", sauce='").append(sauce).append('\'');
    sb.append(", toppings=").append(toppings);
    sb.append('}');
    return sb.toString();
  }
}
