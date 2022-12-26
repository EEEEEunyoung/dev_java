package dev_java.thread1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Project extends JFrame {
  JLabel label = new JLabel();

  public Project() {
    super("JFrame 테스트 - 5초 후 창 닫기");
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(new JLabel(new ImageIcon("C:\\Folder1\\Loading1\\")));
    this.setVisible(true); // 대기
    try {
      Thread.sleep(5000);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
    setVisible(false);

  }

  public static void main(String[] args) {
    new Project();
  }

}
