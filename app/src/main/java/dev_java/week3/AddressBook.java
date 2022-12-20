package dev_java.week3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddressBook {
  public static void main(String[] args) {
    JFrame frame = new JFrame("주소록 ver1");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton btn1 = new JButton("입력");
    JTextField insertf = new JTextField();

    frame.add(panel2);
    frame.add(panel1);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600);

    panel1.add(btn1);

    panel2.setVisible(true);
    panel2.add(insertf);

  }

}
