package dev_java.Semi;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MultiPanel extends JFrame implements ActionListener {
  JPanel p1;
  JPanel p2;
  JTextArea ta;

  public MultiPanel() {
    super("패널테스트");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐때 메모리상에서도 종료
    p1 = new JPanel(); // 패널1
    p2 = new JPanel(); // 패널2
    ta = new JTextArea(10, 20);
    JButton b1 = new JButton("패널2 보이기");
    JButton b2 = new JButton("패널2 안보이기");
    JButton b3 = new JButton("패널1 보이기");
    JButton b4 = new JButton("패널1 안보이기");
    setLayout(new FlowLayout());
    p1.add(b1);
    p1.add(b2);
    p2.add(b3);
    p2.add(b4);
    add(p1); // 패널을 프레임에 붙힌다.
    add(p2);
    add(ta);
    p1.setBackground(Color.yellow);
    p2.setBackground(Color.green);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    setSize(300, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new MultiPanel();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();
    ta.append(str + "\n");
    if (str.equals("패널 2보이기")) {
      p2.setVisible(true);
    } else if (str.equals("패널 2안보이기")) {
      p2.setVisible(false);
    } else if (str.equals("패널 1보이기")) {
      p1.setVisible(true);
    } else {
      p1.setVisible(false);
    }

  }
}
