package headfirst.designpatterns.decorator.starbuzz.topping;

import headfirst.designpatterns.decorator.starbuzz.Beverage;
import headfirst.designpatterns.decorator.starbuzz.CondimentDecorator;

/**
 * Soy class.
 */
public class Soy extends CondimentDecorator {

  Beverage beverage;
  private final double cost = .15;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return cost + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}
