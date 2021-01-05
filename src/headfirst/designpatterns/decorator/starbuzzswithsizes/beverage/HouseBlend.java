package headfirst.designpatterns.decorator.starbuzzswithsizes.beverage;

import headfirst.designpatterns.decorator.starbuzzswithsizes.Beverage;

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
