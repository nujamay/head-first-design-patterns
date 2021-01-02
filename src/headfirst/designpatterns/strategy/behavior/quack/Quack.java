package headfirst.designpatterns.strategy.behavior.quack;

import headfirst.designpatterns.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

  public void quack() {
    System.out.println("Quack! Quack!");
  }

}
