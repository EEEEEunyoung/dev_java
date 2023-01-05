package dev_java.SeungSuSsameSueop.design;

public class Test {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performQuack();
    mallard.performFly();
    Duck yourDuck = new WoodDuck();
    yourDuck.display();
    yourDuck.performFly();
    yourDuck.performQuack();
    Duck himDuck = new RubberDuck();
    himDuck.display();
    himDuck.performFly();
    himDuck.performQuack();

  }
}
