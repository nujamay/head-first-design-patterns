package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.fly.FlyNoWay;
import headfirst.designpatterns.strategy.behavior.quack.Squeak;

/**
 * Model Duck class.
 */
public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
    setFlyBehavior(flyBehavior);
    setQuackBehavior(quackBehavior);
    display();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck.");
  }
}
