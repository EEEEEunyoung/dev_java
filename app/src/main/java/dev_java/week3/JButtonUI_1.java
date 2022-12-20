package dev_java.week3;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class JButtonUI_1 {

  // 선언부
  JFrame jf = new JFrame();
  JButton jbtn_south = new JButton("전송");
  JbuttonUIEvent jbtnEvent = new JButtonUIEvent(this);

  // 생성자
  public JButtonUI(){
      initDisplay();
    }

  // 화면처리부
  public void initDisplay() {
    // 이벤트 소스와 이벤트 핸들러 매핑시 this를 쓸 수 있는건
    // 오직 내안에 actionPerformed가 구현되어 있을때 뿐임
    jbtn_south.addActionListener(jbtnEvent);
    // 윈도우 창 x버튼 클릭시 자원반납 - 어플 정상 종료
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.add("south", jbtn_south);
    jf.setSize(300, 250);
    jf.setVisible(true);

  }

  public static void main(String[] args) {
    new JButtonUI();
  }
}
