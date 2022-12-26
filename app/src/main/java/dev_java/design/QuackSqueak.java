package dev_java.design;

public class QuackSqueak implements QuackBehavior {

  @Override
  public void quack() {
    // 삑삑인지 무음인지 꽥꽥인지 언제 누가 어디에서 결정할 수 있을까?
    // 언제?
    System.out.println("Squeak!");

  }

}
