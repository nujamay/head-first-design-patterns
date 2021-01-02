package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.fly.FlyNoWay;
import headfirst.designpatterns.strategy.behavior.fly.FlyRocketPowered;
import headfirst.designpatterns.strategy.behavior.fly.FlyWithBallon;

/**
 * DuckSimulator class (Client Code).
 */
public class DuckSimulator {

  public static void main(String[] args) {

    // use MallardDuck.
    Duck mallardDuck = new MallardDuck();
    mallardDuck.performSwim();
    mallardDuck.performQuack();
    mallardDuck.performFly();
    separator();

    // use RubberDuck.
    Duck rubberDuck = new RubberDuck();
    rubberDuck.performSwim();
    rubberDuck.performQuack();
    rubberDuck.performFly();
    System.out.println("<< Set wings! Go! >>");
    rubberDuck.setFlyBehavior(new FlyNoWay());
    rubberDuck.performFly();
    System.out.println("<< Set balloon! Go! >>");
    rubberDuck.setFlyBehavior(new FlyWithBallon());
    rubberDuck.performFly();
    separator();

    // use ModelDuck.
    Duck decoyDuck = new DecoyDuck();
    decoyDuck.performSwim();
    decoyDuck.performQuack();
    decoyDuck.performFly();
    System.out.println("<< Set a rocket! Go! >>");
    decoyDuck.setFlyBehavior(new FlyRocketPowered());
    decoyDuck.performFly();

  }

  private static void separator() {
    System.out.println("----------------------");
  }

}
