package dev_java.YaguSusjaGame;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonArray implements ActionListener {
  // 선언부
  AccountSample action = new AccountSample(this);
  JFrame jf = new JFrame();// setSize(400,300); 가로세로크기지정 setVisible(true):윈도우창에 활성화하기
  JPanel jp_center = new JPanel();
  JTextArea jta_display = new JTextArea(10, 20);
  JScrollPane jsp_display = new JScrollPane(jta_display);
  JTextField jtf_input = new JTextField();
  JPanel jp_east = new JPanel();
  JButton jbtn_new = new JButton("새게임");
  JButton jbtn_dap = new JButton("정답");
  JButton jbtn_clear = new JButton("지우기");
  JButton jbtn_exit = new JButton("종료");

  // 생성자
  public ButtonArray() {
    System.out.println("디폴트 생성자 호출");
    // 이벤트소스와 이벤트처리를 담당하는 핸들러클래스 매핑하기
    jtf_input.addActionListener(this);
    jbtn_new.addActionListener(this);
    jbtn_dap.addActionListener(this);
    jbtn_clear.addActionListener(this);
    jbtn_exit.addActionListener(this);
    initDisplay();
  }

  // 화면그리기
  public void initDisplay() {
    System.out.println("화면그리기 호출");
    // 윈도우창 오른쪽 상단 끝네 X버튼 누르면 종료 후 가상머신과 연결 끊기
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jp_center.setLayout(new BorderLayout());
    jp_center.add("Center", jsp_display);
    jp_center.add("South", jtf_input);
    jp_east.setLayout(new GridLayout(4, 1, 2, 2));
    jp_center.setBackground(new Color(158, 9, 9));
    jp_center.setForeground(new Color(212, 212, 212));
    jp_east.add(jbtn_new);
    jbtn_new.setForeground(Color.yellow);
    jbtn_new.setBackground(Color.black);
    jp_east.add(jbtn_dap);
    jbtn_dap.setForeground(Color.yellow);
    jbtn_dap.setBackground(Color.black);
    jp_east.add(jbtn_clear);
    jbtn_clear.setForeground(Color.yellow);
    jbtn_clear.setBackground(Color.black);
    jp_east.add(jbtn_exit);
    jbtn_exit.setForeground(Color.yellow);
    jbtn_exit.setBackground(Color.black);
    jf.add("Center", jp_center);
    jf.add("East", jp_east);
    jf.setSize(400, 300);
    jf.setVisible(true);
  }

  // 메인 메소드
  public static void main(String[] args) {
    new ButtonArray();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // e.getSource()는 이벤트가 감지되는 컴포넌트(JTextField)의 주소번지를 반환함.
    Object obj = e.getSource();
    // 너 새게임 할려고?
    if (jbtn_new == obj) {
      jta_display.append(":스페이드::스페이드::스페이드:새게임을 시작합니다.:스페이드::스페이드::스페이드: \n");
    }
    // 너 정답 볼래?
    else if (jbtn_dap == obj) {
      jta_display.append("정답은 ???입니다. \n");
    }
    // 화면좀 지워줘
    else if (jbtn_clear == obj) {
      jta_display.setText("");
    }
    // 나 그만할래
    else if (jbtn_exit == obj) {
      // jf.dispose(); 창 하나씩 따로 닫고 싶을때
      jf.dispose();
      System.exit(0);// 몽땅 한번에 닫을때
    }
    // 너 JTextField에서 엔터친거야?
    else if (jtf_input == obj) {
      // 사용자가 텍스트 필드에 입력한 문자열을 읽어옴
      String input = jtf_input.getText();
      // jta_display.append(input + ":"+action.account2() + "\n");
      action.account2();
      jtf_input.setText("");
    }
  }
}