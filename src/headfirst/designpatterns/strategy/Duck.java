package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;
import headfirst.designpatterns.strategy.behavior.QuackBehavior;

public abstract class Duck {

  // for behavior interface.
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void performSwim() {
    System.out.println("All ducks float, even decoys!");
  }
}