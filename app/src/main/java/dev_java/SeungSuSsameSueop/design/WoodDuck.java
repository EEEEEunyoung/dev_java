package dev_java.SeungSuSsameSueop.design;

public class WoodDuck extends Duck {
  public WoodDuck() {
    // 설계한 객체가 어떤 특성을 가지고 어떻게 활동하는지 결정됨 - 생성자
    quackBehavior = new QuackMute();
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("<<나는 나무오리 입니다.>>");
  }
}
