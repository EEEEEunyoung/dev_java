package dev_java.EunYoung.P1.D221226;

public class ThreadA extends Thread {
  public ThreadA() {
    setName("ThreadVVV");

  }

  @Override
  public void run() {
    for (int i = 0; i < 2; i++) {
      System.out.println(getName() + "가 출력한 내용");
    }
  }

}
