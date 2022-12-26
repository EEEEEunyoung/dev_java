package dev_java.thread1;

import javax.swing.JFrame;

public class JFrameTimerClose extends JFrame {

  public JFrameTimerClose() { // 여기서 쓰레드 사용 가능
    super("JFrame 테스트 - 5초 후 창 닫기");
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true); // 대기
    try {
      Thread.sleep(5000);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
    setVisible(false);

  }

  public static void main(String[] args) {
    new JFrameTimerClose(); // 생성자 호출
  }

}
