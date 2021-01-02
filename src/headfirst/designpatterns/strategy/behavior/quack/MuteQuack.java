package headfirst.designpatterns.strategy.behavior.quack;

import headfirst.designpatterns.strategy.behavior.QuackBehavior;

/**
 * Mute quack behavior class.
 */
public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
