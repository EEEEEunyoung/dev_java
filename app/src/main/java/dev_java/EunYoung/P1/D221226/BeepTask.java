package dev_java.EunYoung.P1.D221226;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

  @Override
  public void run() {
    Runnable tk = new BeepTask();
    Toolkit ts = Toolkit.getDefaultToolkit();
    Thread thread = new Thread(tk);
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
