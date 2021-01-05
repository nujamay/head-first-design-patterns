package headfirst.designpatterns.decorator.starbuzz;

/**
 * Beverage class.
 */
public abstract class Beverage {

  protected Beverage bevarage;
  String description = "Unknown drink.";

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * calculate a cost of beverage.
   *
   * @return cost of beverage.
   */
  public abstract double cost();
}