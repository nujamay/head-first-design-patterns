package headfirst.designpatterns.strategy.behavior.fly;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;

/**
 * Fly with wings behavior class.
 */
public class FlyWithWings implements FlyBehavior {

  public void fly() {
    System.out.println("I'm flying!");
  }

}
