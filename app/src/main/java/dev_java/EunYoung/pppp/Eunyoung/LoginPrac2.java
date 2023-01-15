package dev_java.EunYoung.pppp.Eunyoung;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPrac2 extends JFrame implements ActionListener {
  // 선언부
  JPanel jp = new JPanel();
  JButton jbtn1 = new JButton("로그인");
  JButton jbtn2 = new JButton("회원가입");
  JButton jbtn3 = new JButton("비번찾기");
  JButton jbtn4 = new JButton("아이디중복");

  JLabel lb1 = new JLabel("id:");
  JTextField jtf = new JTextField("아이디여기");
  JLabel lb2 = new JLabel("Password:");
  JPasswordField pwd = new JPasswordField("비밀번호여기");

  LoginPrac2() {
  } // cons

  public void initDisplay() {
    setVisible(true);
    setSize(500, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(jp);
    jp.add(lb1);
    jp.add(jtf);
    jp.add(lb2);
    jp.add(pwd);
    jp.add(jbtn1);
    jp.add(jbtn2);
    jp.add(jbtn3);
    jp.add(jbtn4);

    jbtn1.addActionListener(this);
    jbtn2.addActionListener(this);
    jbtn3.addActionListener(this);
    jbtn4.addActionListener(this);

  }

  public static void main(String[] args) {
    LoginPrac2 lp = new LoginPrac2();
    lp.initDisplay();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();

    if (obj == jbtn1) {
      if (jtf.getText().equals("123") && pwd.getText().equals("123")) {
        JOptionPane.showMessageDialog(rootPane, "로그인성공");

      } else if (jtf.getText().equals("") || pwd.getText().equals("")) {
        JOptionPane.showMessageDialog(rootPane, "아디비번입력해야함");

      }
    }

    else if (obj == jbtn2) {

    }

    else if (obj == jbtn3) {

    }

    else if (obj == jbtn4) {

    }

  }

}
