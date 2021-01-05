package headfirst.designpatterns.decorator.starbuzz;

/**
 * <pre>
 *   Condiment decorator class.
 *   To exchange concrete {@link Beverage} class, it extends {@link Beverage}
 * </pre>
 */
public abstract class CondimentDecorator extends Beverage {
  public Beverage beverage;
  public abstract String getDescription();
}
