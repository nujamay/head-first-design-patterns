package headfirst.designpatterns.decorator.starbuzz.beverage;

import headfirst.designpatterns.decorator.starbuzz.Beverage;

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
