package dev_java.design;

public class QuackMute implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("...");
  }

}
