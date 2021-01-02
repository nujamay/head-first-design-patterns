package headfirst.designpatterns.strategy.behavior.quack;

import headfirst.designpatterns.strategy.behavior.QuackBehavior;

/**
 * Squeak behavior class.
 */
public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak! Squeak!");
  }
}
