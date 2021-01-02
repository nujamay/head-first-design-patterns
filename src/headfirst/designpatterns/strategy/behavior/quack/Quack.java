package headfirst.designpatterns.strategy.behavior.quack;

import headfirst.designpatterns.strategy.behavior.QuackBehavior;

/**
 * Quack behavior class.
 */
public class Quack implements QuackBehavior {

  /**
   * Quack behavior.
   */
  public void quack() {
    System.out.println("Quack! Quack!");
  }

}
