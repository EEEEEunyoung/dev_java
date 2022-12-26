package dev_java.design;

public class RubberDuck extends Duck {
  public RubberDuck() {
    quackBehavior = new QuackSqueak();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("<<나는 고무오리 입니다.>>");
  }
}
