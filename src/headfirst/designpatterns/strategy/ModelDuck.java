package headfirst.designpatterns.strategy;

public class ModelDuck extends Duck {

  public ModelDuck() {
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
