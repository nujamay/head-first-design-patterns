package headfirst.designpatterns.decorator.starbuzzswithsizes.beverage;

import headfirst.designpatterns.decorator.starbuzzswithsizes.Beverage;

/**
 * Espresso class.
 */
public class Espresso extends Beverage {

  public Espresso() {
    setDescription("Espresso");
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
