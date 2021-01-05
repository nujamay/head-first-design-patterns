package headfirst.designpatterns.decorator.starbuzz.beverage;

import headfirst.designpatterns.decorator.starbuzz.Beverage;

/**
 * House Blend class.
 */
public class HouseBlend extends Beverage {

  public HouseBlend() {
    setDescription("HouseBlend");
  }

  @Override
  public double cost() {
    return .89;
  }
}
