package headfirst.designpatterns.strategy;

public class DuckSimulator {

  public static void main(String[] args) {

    // use MallardDuck.
    Duck mallardDuck = new MallardDuck();
    mallardDuck.performQuack();
    mallardDuck.performFly();
    separator();

    //// use RubberDuck.
    Duck rubberDuck = new RubberDuck();
    rubberDuck.performQuack();
    rubberDuck.performFly();
    separator();

    // use ModelDuck.
    Duck modelDuck = new ModelDuck();
    modelDuck.performFly();
    modelDuck.performQuack();
    System.out.println("<< Set a rocket! Go! >>");
    modelDuck.setFlyBehavior(new FlyRocketPowered());
    modelDuck.performFly();

  }

  private static void separator() {
    System.out.println("----------------------");
  }

}
