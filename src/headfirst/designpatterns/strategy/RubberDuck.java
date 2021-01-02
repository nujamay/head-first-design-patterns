package headfirst.designpatterns.strategy;

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
