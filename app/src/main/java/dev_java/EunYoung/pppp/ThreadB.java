package dev_java.EunYoung.pppp;

public class ThreadB extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 2; i++) {
      System.out.println(getName() + "가출력한내용");
    }
  }

}
