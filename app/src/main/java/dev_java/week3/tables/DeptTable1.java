package dev_java.week3.tables;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dev_java.YaguSusjaGame.Color;
import dev_java.week3.ActionListener;

//이른인스턴스화, 게으른 인스턴스화
//어떤클래스를 상속받을 때에는 extends예약어를 사용
//A is a B관계이면 상속으로 처리한다. 
//소나타는 자동차이다.
//자동차는 소나타이다. 
//부모클래스가 가진 변수와 메소드도 사용가능함 - 자손이 더 많이 누릴 수 있다.
//ActionListener - 인터페이스 - 단독으로 인스턴스화가 불가함 - 구현체 클래스가 필요함
//추상메소드를 선언하고 있다.
//ActinoListener al = new DeptTable3(); 선언부와 생성부가 다를 수 있다. 
//선언부와 생성부가 다르다 - 동일한 메소드를 호출했는데 다른 기능이 처리되었다??
//Duck myDuck = new WoodDuck();
//Duck herDuck = new RubberDuck();herDuck.fly()
//Duck himDuck = new MallarDuck();himDuck.fly()

public class DeptTable1 extends JFrame {// DeptTable1 is a JFrame
  // 선언부
  JPanel panel1 = new JPanel();
  String header[] = { "부서번호", "부서명", "지역" };
  String datas[][] = new String[1][3];
  // this는 사용되는 클래스 영역에서 선언된 클래스를 가리킨다.
  // 그러면 여기서는 DeptTavle1타입인 것임
  // 그런데 DefaulfTableModel은 자바에서 제공되는 클래스임 - 생성자도 정해져 있음
  // 생성자는 메소드 오버로딩 규칙을 따름 - 파라미터의 갯수나 타입이 달라야 함
  // 제공되는 생성자에 없음-결국 사용 못함-컴파일에러(문법에러 발생)
  DefaultTableModel dtm_dept = new DefaultTableModel(datas, header); // 생성자 호출

  JTable table = new JTable(datas, header);
  JScrollPane scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  JButton btn1 = new JButton("입력");
  JButton btn2 = new JButton("조회");
  JButton btn3 = new JButton("수정");
  JButton btn4 = new JButton("삭제");
  // 부서목록 조회에 들어갈 샘플 데이터 생성
  String[][] depts = {
      { "10", "개발부", "서울" },
      { "20", "인사부", "인천" },
      { "30", "총무부", "부산" }
  };

  FlowLayout fl = new FlowLayout();
  // 생성자

  public DeptTable1() {
    initDisplay();

  }

  // 화면그리기
  public void initDisplay() {

    this.setTitle("부서관리시스템 Ver1.0");
    this.setSize(500, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

    this.add("North", panel1);
    this.add("Center", scroll);
    panel1.setLayout(new FlowLayout(FlowLayout.RIGHT));

    btn1.setBackground(Color.green);
    btn1.setForeground(Color.green);
    btn2.setBackground(Color.green);
    btn2.setForeground(Color.green);
    btn3.setBackground(Color.green);
    btn3.setForeground(Color.green);
    btn4.setBackground(Color.green);
    btn4.setForeground(Color.green);

    panel1.add(btn1);
    panel1.add(btn2);
    panel1.add(btn3);
    panel1.add(btn4);

    btn1.add(ActionListener e);


  }

  // 메인메소드
  public static void main(String[] args) {
    new DeptTable1();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == btn2) {

    }

  }

}
