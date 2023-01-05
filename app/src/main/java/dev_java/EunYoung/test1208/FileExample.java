package dev_java.EunYoung.test1208;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileExample extends JFrame {
  String imgPath = ("C:\\TEMP\\abc1\\");
  ImageIcon imageIcon = new ImageIcon(imgPath + "main.png");

}

class MyPanel extends JPanel {
  public void paintComponent(Graphics g) {
    g.drawImage(imageIcon.getImage(), 0, 0, null);
    setOpaque(false);
    super.paintComponent(g);
  }
}