package headfirst.designpatterns.decorator.starbuzzswithsizes.beverage;

import headfirst.designpatterns.decorator.starbuzzswithsizes.Beverage;

/**
 * Dark Roast class.
 */
public class DarkRoast extends Beverage {

  public DarkRoast() {
    setDescription("Dark Roast");
  }

  @Override
  public double cost() {
    return .99;
  }
}
