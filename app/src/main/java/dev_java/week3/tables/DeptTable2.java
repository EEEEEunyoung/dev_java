package dev_java.week3.tables;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//이른인스턴스화, 게으른 인스턴스화
//어떤클래스를 상속받을 때에는 extends예약어를 사용
//A is a B관계이면 상속으로 처리한다. 
//소나타는 자동차이다.
//자동차는 소나타이다. 
//부모클래스가 가진 변수와 메소드도 사용가능함 - 자손이 더 많이 누릴 수 있다.

public class DeptTable2 extends JFrame {// DeptTable1 is a JFrame
  // 선언부
  JPanel panel1 = new JPanel();
  JButton Btn1 = new JButton("입력");
  String header[] = { "부서번호", "부서명", "지역" };
  String datas[][] = new String[1][3];
  // this는 사용되는 클래스 영역에서 선언된 클래스를 가리킨다.
  // 그러면 여기서는 DeptTavle1타입인 것임
  // 그런데 DefaulfTableModel은 자바에서 제공되는 클래스임 - 생성자도 정해져 있음
  // 생성자는 메소드 오버로딩 규칙을 따름 - 파라미터의 갯수나 타입이 달라야 함
  // 제공되는 생성자에 없음-결국 사용 못함-컴파일에러(문법에러 발생)
  DefaultTableModel dtm_dept = new DefaultTableModel(datas, header); // 생성자 호출
  // 생성자

  public DeptTable2() {
    initDisplay();
  }

  public DeptTable2(String title) {

  }

  public DeptTable2(int i) {

  }

  // 화면그리기
  public void initDisplay() {
    this.setTitle("부서관리시스템 Ver1.0");
    this.setSize(500, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

  }

  // 메인메소드
  public static void main(String[] args) {
    new DeptTable2();

  }
}
