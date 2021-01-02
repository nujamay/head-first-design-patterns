package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;
import headfirst.designpatterns.strategy.behavior.QuackBehavior;

/**
 * Duck abstract class.
 */
public abstract class Duck {

  // for behavior interface.
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  /**
   * display each Duck information.
   */
  public abstract void display();

  /**
   * Set fly behavior.
   * @param fb {@link FlyBehavior}
   */
  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  /**
   * Set quack behavior
   * @param qb {@link QuackBehavior}
   */
  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

  /**
   * Perform to fly.
   */
  public void performFly() {
    flyBehavior.fly();
  }

  /**
   * Perform to quack.
   */
  public void performQuack() {
    quackBehavior.quack();
  }

  /**
   * Perform to swim.
   */
  public void performSwim() {
    System.out.println("All ducks float, even decoys!");
  }
}