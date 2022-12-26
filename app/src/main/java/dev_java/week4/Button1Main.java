package dev_java.week4;
//java.lang 패키지가 아닌것은 모두 import 사용함

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Button1 extends JFrame {
  // 선언부
  Button1Event bevent = new Button1Event(this); // 상속, 추상, 인터페이스 중심 코딩 전개
  JButton btn1 = null; // 선언만 했다. 생성자 호출 안된다.(게으른 인스턴스화)
  JButton btn2 = new JButton("수정"); // 선언 및 생성 동시에 생성자 호출까지 일어남 (이른인스턴스화)
  // 입력버튼 북쪽 배치, 수정버튽 남쪽 배치
  // 생성자

  Button1() {
    System.out.println("Button1디폴트 생성자 호출" + btn1);
    initDisplay(); // new Button1 이 호출되면 자동으로 호출이 일어남
    // 있다.
    System.out.println("initDispldy 호출 후" + (btn1 == null));
    btn1 = new JButton("입력"); // 생성자 안에서 버튼객체를 생성하면 뭐가 다르지? 어떻게 다른걸까? - 시점에 따라 NullPointerException 이 발생할 수
    System.out.println("입력버튼 생성후 ===>" + (btn1 == null));

  }

  // 화면처리부
  public void initDisplay() {
    btn2.addActionListener((bevent));
    System.out.println("initDisplay 호출 성공");
    JButton btn3 = new JButton("삭제");
    this.setSize(400, 300);
    this.setVisible(true);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    if (btn1 != null) { // 선택 ☆☆☆흐름을 바꾼다.
      this.add("North", btn1);
    }
    this.add("South", btn2);
    this.add("East", btn3);

  }
}

// ActionListener의 구현체 클래스이다. - 이벤트 핸들러 클래스이다
// 인터페이스는 추상메소드만 가진다.
class Button1Event implements ActionListener {
  Button1 button1 = null;

  public Button1Event(Button1 button1) {
    this.button1 = button1;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    // 너 수정 버튼 누른거야?
    if (obj == button1.btn2) {
      System.out.println("수정버튼 클릭");
    }
  }

}

public class Button1Main {
  public static void main(String[] args) {
    Button1 b1 = new Button1();
  }
}
