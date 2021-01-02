package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;
import headfirst.designpatterns.strategy.behavior.fly.FlyWithWings;
import headfirst.designpatterns.strategy.behavior.quack.Quack;
import headfirst.designpatterns.strategy.behavior.QuackBehavior;

public class MallardDuck extends Duck {

  public MallardDuck() {
    FlyBehavior flyWithWings = new FlyWithWings();
    QuackBehavior quack = new Quack();
    setFlyBehavior(flyWithWings);
    setQuackBehavior(quack);
    display();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
