package headfirst.designpatterns.decorator.starbuzzswithsizes;

/**
 * Beverage class.
 */
public abstract class Beverage {

  Size size = Size.TALL;
  String description = "Unknown drink.";

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Size getSize() {
    return this.size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  /**
   * calculate a cost of beverage.
   *
   * @return cost of beverage.
   */
  public abstract double cost();

  public enum Size {
    TALL,
    GRANDE,
    VENTI,
  }
}
