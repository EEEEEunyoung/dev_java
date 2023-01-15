package dev_java.EunYoung.pppp;

public class ThreadA extends Thread {
  ThreadA() {
    setName("ThreadA");
  }

  @Override
  public void run() {
    for (int i = 0; i < 2; i++) {
      System.out.println(getName() + "가출력한내용");
    }
  }

}
