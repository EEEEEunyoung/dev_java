package dev_java.Semi.login.oracle.login;

import java.awt.Font;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

class FontTestFrame extends JFrame {

  private JPanel panel;

  private JLabel a, b, c;

  private Font f1, f2, f3;

  public FontTestFrame() {

    setSize(470, 150);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setTitle("폰트 테스트");

    panel = new JPanel();

    f1 = new Font("돋움", Font.PLAIN, 15);

    f2 = new Font("궁서", Font.BOLD, 20);

    f3 = new Font("바탕", Font.ITALIC, 30);

    a = new JLabel("가나다라마바사아자차카타파하");

    b = new JLabel("가나다라마바사아자차카타파하");

    c = new JLabel("가나다라마바사아자차카타파하");

    a.setFont(f1);

    b.setFont(f2);

    c.setFont(f3);

    panel.add(a);

    panel.add(b);

    panel.add(c);

    add(panel);

    setVisible(true);

  }

  public static void main(String[] args) {

    FontTestFrame fontTestFrame = new FontTestFrame();

  }

}
