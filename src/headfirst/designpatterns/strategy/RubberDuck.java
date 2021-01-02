package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;
import headfirst.designpatterns.strategy.behavior.fly.FlyNoWay;
import headfirst.designpatterns.strategy.behavior.quack.MuteQuack;
import headfirst.designpatterns.strategy.behavior.QuackBehavior;

/**
 * Rubber Duck class.
 */
public class RubberDuck extends Duck {

  public RubberDuck() {
    FlyBehavior flyNoWay = new FlyNoWay();
    QuackBehavior muteQuack = new MuteQuack();
    setFlyBehavior(flyNoWay);
    setQuackBehavior(muteQuack);
    display();
  }

  @Override
  public void display() {
    System.out.println("I'm a rubber duck.");
  }
}
