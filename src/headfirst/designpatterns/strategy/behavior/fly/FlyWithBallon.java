package headfirst.designpatterns.strategy.behavior.fly;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;

public class FlyWithBallon implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm flying with balloon!");
  }
}
