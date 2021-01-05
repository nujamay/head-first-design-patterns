package headfirst.designpatterns.decorator.starbuzzswithsizes.topping;

import headfirst.designpatterns.decorator.starbuzzswithsizes.Beverage;
import headfirst.designpatterns.decorator.starbuzzswithsizes.CondimentDecorator;

/**
 * Whip class.
 */
public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    if (beverage.getSize() == Size.TALL) {
      return beverage.cost() + .10;
    } else if (beverage.getSize() == Size.GRANDE) {
      return beverage.cost() + .15;
    } else if (beverage.getSize() == Size.VENTI) {
      return beverage.cost() + .20;
    } else {
      System.out.println("Get undefined size, so use `TALL size` cost.");
      return beverage.cost() + .10;
    }
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
