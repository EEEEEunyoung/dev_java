package dev_java.SeungSuSsameSueop.week3;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonMain implements ActionListener {
  // 선언부
  JFrame jf = new JFrame();
  JButton jbtn_south = new JButton("전송");

  // 생성자
  public JButtonMain() {
    initDisplay();
  }

  // 화면처리부
  public void initDisplay() {
    // 이벤트 소스와 이벤트 핸들러 매핑시 this를 쓸 수 있는건
    // 오직 내안에 actionPerformed가 구현되어 있을때 뿐임
    jbtn_south.addActionListener(this);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.add("south", jbtn_south);
    jf.setSize(300, 250);
    jf.setVisible(true);

  }

  // 메인메소드
  public static void main(String[] args) {
    new JButtonMain();

  } // 메인

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == jbtn_south) {
      System.out.println(jbtn_south.getText() + "버튼 클릭");
    }
  }
}
