package dev_java.EunYoung.P1.D221226;

public class Thread1 {
  public static void main(String[] args) {
    Runnable tt = new Thread_Task();
    Thread thread = new Thread(tt);
    thread.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }
  }

}
