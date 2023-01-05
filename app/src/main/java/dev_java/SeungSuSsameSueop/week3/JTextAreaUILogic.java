package dev_java.SeungSuSsameSueop.week3;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaUILogic implements ActionListener {
  JTextAreaUILogic2 jtaUILogic = new JTextAreaUILogic2(this);
  JFrame jf = new JFrame();
  JTextArea jta = new JTextArea(10, 20);
  JTextField jtf = new JTextField(10);

public JTextAreaUI2() {
      initDisplay();
}

  public void initDisplay() {
    jtf.addActionListener((java.awt.event.ActionListener) this);
    jta.setBackground(Color.cyan);
    jf.add("Center", jta);
    jf.add("South", jtf);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(400, 300);
    jf.setVisible(true);

  }
}