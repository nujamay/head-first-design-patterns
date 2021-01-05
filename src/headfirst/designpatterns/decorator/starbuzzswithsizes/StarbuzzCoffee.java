package headfirst.designpatterns.decorator.starbuzzswithsizes;

import headfirst.designpatterns.decorator.starbuzzswithsizes.Beverage.Size;
import headfirst.designpatterns.decorator.starbuzzswithsizes.beverage.DarkRoast;
import headfirst.designpatterns.decorator.starbuzzswithsizes.beverage.Espresso;
import headfirst.designpatterns.decorator.starbuzzswithsizes.beverage.HouseBlend;
import headfirst.designpatterns.decorator.starbuzzswithsizes.topping.Mocha;
import headfirst.designpatterns.decorator.starbuzzswithsizes.topping.Soy;
import headfirst.designpatterns.decorator.starbuzzswithsizes.topping.Whip;

/**
 * Starbuzz coffee class (Client Code).
 */
public class StarbuzzCoffee {

  public static void main(String[] args) {
    // Request an Espresso without any toppings.
    Beverage espresso = new Espresso();
    System.out.println(espresso.getDescription() + ": $" + String.format("%.2f", espresso.cost()));
    separator();

    // Request a Dark Roast with double Mocha and Whip.
    Beverage darkRoast = new DarkRoast();
    darkRoast.setSize(Size.VENTI);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out
        .println(darkRoast.getDescription() + ": $" + String.format("%.2f", darkRoast.cost()));
    separator();

    // Request a House Blend with Soy, Mocha and Whip.
    Beverage houseBlend = new HouseBlend();
    houseBlend.setSize(Size.GRANDE);
    houseBlend = new Soy(houseBlend);
    houseBlend = new Mocha(houseBlend);
    houseBlend = new Whip((houseBlend));
    System.out
        .println(houseBlend.getDescription() + ": $" + String.format("%.2f", houseBlend.cost()));
  }

  private static void separator() {
    System.out.println("----------------------");
  }

}
