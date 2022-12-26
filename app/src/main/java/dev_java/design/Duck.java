package dev_java.design;

public abstract class Duck {
  FlyBehavior flyBehavior; // 인터페이스 - 날다, 날지 못한다.
  QuackBehavior quackBehavior; // 인터페이스 - 무음 MuteQuack, 삐~이익 Squeak, 꽥꽥(Quack)

  public Duck() {
  } // 생성자

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swimming() {
    System.out.println("모든 오리는 물위에 뜬다");
  }
}
