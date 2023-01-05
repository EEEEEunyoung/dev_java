package dev_java.EunYoung.P1.D221226;

import java.awt.Toolkit;

public class Thread_Task implements Runnable {

  @Override
  public void run() {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    for (int i = 0; i < 5; i++) {
      toolkit.beep();
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }

  }

}
