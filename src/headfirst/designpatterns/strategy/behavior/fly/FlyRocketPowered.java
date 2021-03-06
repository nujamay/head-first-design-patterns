package headfirst.designpatterns.strategy.behavior.fly;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;

/**
 * Fly rocket powered behavior class.
 */
public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm flying with a rocket!");
  }
}
