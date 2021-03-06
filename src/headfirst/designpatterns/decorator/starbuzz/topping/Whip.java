package headfirst.designpatterns.decorator.starbuzz.topping;

import headfirst.designpatterns.decorator.starbuzz.Beverage;
import headfirst.designpatterns.decorator.starbuzz.CondimentDecorator;

/**
 * Whip class.
 */
public class Whip extends CondimentDecorator {

  private final double cost = .10;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return cost + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
