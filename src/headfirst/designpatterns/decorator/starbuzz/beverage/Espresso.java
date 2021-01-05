package headfirst.designpatterns.decorator.starbuzz.beverage;

import headfirst.designpatterns.decorator.starbuzz.Beverage;

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
