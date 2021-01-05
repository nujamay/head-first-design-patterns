package headfirst.designpatterns.decorator.starbuzz.topping;

import headfirst.designpatterns.decorator.starbuzz.Beverage;
import headfirst.designpatterns.decorator.starbuzz.CondimentDecorator;

/**
 * Whip class.
 */
public class Whip extends CondimentDecorator {

  Beverage beverage;
  private final double cost = .10;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return cost + this.beverage.cost();
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Whip";
  }
}
