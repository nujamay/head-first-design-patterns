package headfirst.designpatterns.strategy.behavior.fly;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;

/**
 * Fly No Way behavior class.
 */
public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can't fly...");
  }
}
