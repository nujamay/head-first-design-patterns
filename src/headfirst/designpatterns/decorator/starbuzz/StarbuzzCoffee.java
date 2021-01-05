package headfirst.designpatterns.decorator.starbuzz;

import headfirst.designpatterns.decorator.starbuzz.beverage.DarkRoast;
import headfirst.designpatterns.decorator.starbuzz.beverage.Espresso;
import headfirst.designpatterns.decorator.starbuzz.beverage.HouseBlend;
import headfirst.designpatterns.decorator.starbuzz.topping.Mocha;
import headfirst.designpatterns.decorator.starbuzz.topping.Soy;
import headfirst.designpatterns.decorator.starbuzz.topping.Whip;

/**
 * Starbuzz coffee class (Client Code).
 */
public class StarbuzzCoffee {

  public static void main(String[] args) {
    // Request an Espresso without any toppings.
    Beverage espresso = new Espresso();
    System.out.println(espresso.getDescription() + ": $" + espresso.cost());
    separator();

    // Request a Dark Roast with double Mocha and Whip.
    Beverage darkRoast = new DarkRoast();
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out.println(darkRoast.getDescription() + ": $" + darkRoast.cost());
    separator();

    // Request a House Blend with Soy, Mocha and Whip.
    Beverage houseBlend = new HouseBlend();
    houseBlend = new Soy(houseBlend);
    houseBlend = new Mocha(houseBlend);
    houseBlend = new Whip((houseBlend));
    System.out.println(houseBlend.getDescription() + ": $" + houseBlend.cost());
  }

  private static void separator() {
    System.out.println("----------------------");
  }

}
