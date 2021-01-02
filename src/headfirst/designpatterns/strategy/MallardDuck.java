package headfirst.designpatterns.strategy;

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
