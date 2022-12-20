package dev_java.week3.tables;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class DeptTable7 extends JFrame implements ActionListener {
  // 선언부
  // 파라미터의 this는 DeptTable7타입이고 main에서 호출된 생성자로
  // 현재 메모리에 로딩 중인 그 객체를 가리킨다.
  // 왜 this를 넘겨야 하나요? 입력할건데.....
  // :JTable7Dialog에서 부서번호,부서명,지역을 입력한 후 저장버튼을 누르면
  // :Vector<String[]>추가하고 추가된 로우를 포함하는 Vector가 부모창에
  // 새로 리플래쉬(재사용되어야함-이건 부모클래스에구현함) 되어야 하니까....호출해야함.
  JTable7Dialog jtd7 = new JTable7Dialog(this);
  String header[] = { "부서번호", "부서명", "지역" };
  String datas[][] = new String[0][3];
  // this는 사용되는 클래스 영역에서 선언된 클래스를 가리킨다
  // 그러면 여기서는 DeptTable1타입인 것임
  // 그런데 DefaultTableModel은 자바에서 제공되는 클래스임-생성자도 정해져 있음
  // 생성자는 메소드 오버로딩 규칙을 따름 - 파라미터의 갯수나 타입이 달라야 함
  // 제공되는 생성자에 없음 - 결국 사용 못함 - 컴파일 에러(문법에러 발생)
  DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);// 생성자 호출
  JTable jtb_dept = new JTable(dtm_dept);
  JScrollPane jsp_dept = new JScrollPane(jtb_dept, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
  // 버튼을 붙일 속지 선언
  JPanel jp_north = new JPanel();
  JButton jbtn_sel = new JButton("조회");
  JButton jbtn_ins = new JButton("입력");
  JButton jbtn_upd = new JButton("수정");
  JButton jbtn_del = new JButton("삭제");
  JButton jbtn_det = new JButton("상세보기");
  static Vector<String[]> vdata = new Vector<>();// vdata.size() = 0;

  // 생성자
  public DeptTable7() {
    initDisplay();
  }

  // 화면그리기
  public void initDisplay() {
    jbtn_ins.addActionListener(this);
    jbtn_upd.addActionListener(this);
    jbtn_det.addActionListener(this);
    jbtn_sel.addActionListener(this);
    jbtn_del.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jp_north.setLayout(new FlowLayout(FlowLayout.RIGHT));
    jbtn_sel.setBackground(new Color(158, 9, 9));
    jbtn_sel.setForeground(Color.WHITE);
    jbtn_ins.setBackground(new Color(19, 99, 57));
    jbtn_ins.setForeground(Color.WHITE);
    jbtn_upd.setBackground(new Color(54, 54, 54));
    jbtn_upd.setForeground(Color.WHITE);
    jbtn_del.setBackground(new Color(7, 84, 170));
    jbtn_del.setForeground(Color.WHITE);
    jp_north.add(jbtn_sel);
    jp_north.add(jbtn_ins);
    jp_north.add(jbtn_upd);
    jp_north.add(jbtn_del);
    jp_north.add(jbtn_det);
    this.add("North", jp_north);
    this.add("Center", jsp_dept);
    this.setTitle("부서관리시스템 Ver1.0");
    this.setSize(500, 400);
    this.setVisible(true);
  }

  // 새로고침 - Vector에 담긴 String[]출력하기
  // 입력, 수정화면에서 저장 버튼 누르면 Vector에 String[] 추가하고
  // 그 다이얼로그 화면은 닫히고 부모창은 새로고침 처리한다
  // 그러니까 다이얼로그창에서 부모클래스의 refreshData메소드를 호출해야 함
  // 그러니까 인스턴스화 할 때 파라미터에 this를 넘겨서 사용할 수 있도록 할것(NullPointerException)
  public void refreshData() {
    System.out.println("refreshData 호출");
    // 입력,수정 전에 조회된 정보는 삭제함
    while (dtm_dept.getRowCount() > 0) {
      dtm_dept.removeRow(0);
    }
    if (DeptTable7.vdata.size() <= 0) {
      JOptionPane.showMessageDialog(this, "조회결과가 없습니다.", "WARN", JOptionPane.WARNING_MESSAGE);
      return;// refreshData()탈출
    }
    System.out.println("DeptTable7 : " + vdata.size());
    // 벡터의 크기만큼 반복하면서 dtm_dept 데이터셋에 String[]추가함
    for (int i = 0; i < vdata.size(); i++) {
      String[] oneRow = vdata.get(i);
      dtm_dept.addRow(oneRow);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    // 조회 할거야?
    if (obj == jbtn_sel) {
      refreshData();
    }
    // 너 입력 버튼 누른거야?
    else if (obj == jbtn_ins) {
      jtd7.set("입력", true, null);
    }
    // 너 수정 할려구?
    else if (obj == jbtn_upd) {
      // 어떤 로우를 수정할거니?
      // JTable목록에서 선택한 로우의 index를 값을 가져옴
      int index = jtb_dept.getSelectedRow();
      // 데이셋객체로 벡터를 사용중이니 벡터에서 꺼낸 값을 String[]초기화
      // 테이블의 양식 폼인 JTable 이벤트로 얻어옴
      String[] oneRow = vdata.get(index);
      jtd7.set("수정", true, oneRow);

    }
    // 너 상세보기 원해?
    else if (obj == jbtn_det) {

      // jtd7.set("상세보기",true,데이터로우값-String[]);

    }

  }

  public static void main(String[] args) {
    new DeptTable7();
  }
}

/*
 * import java.awt.Color;
 * import java.awt.FlowLayout;
 * import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener;
 * import java.util.Vector;
 * 
 * import javax.swing.JButton;
 * import javax.swing.JFrame;
 * import javax.swing.JOptionPane;
 * import javax.swing.JPanel;
 * import javax.swing.JScrollPane;
 * import javax.swing.JTable;
 * import javax.swing.table.DefaultTableModel;
 * 
 * //상세보기 추가
 * 
 * public class DeptTable7 extends JFrame implements ActionListener {//
 * DeptTable1 is a JFrame
 * 
 * // 선언부
 * // 파라미터의 this 는 DeptTable7 타입이고, main에서 호출된 생성자로
 * // 현재 메모리에 로딩 중인 그 객체를 가리킨다.
 * // 왜 this를 넘겨야 하나요? 입력할건데.....
 * // :JTble7Dialog에서 부서번호, 부서명, 지역을 입력한 후 저장버튼을 누르면
 * // :Vector<String[]> 추가하고 추가된 로우를 포함하는 Vector가 부모창에
 * // 새로 리플레쉬(재사용되어야함-이건부모클래스에구현함)되어야하니까...호출해야함
 * 
 * JTable7Dialog jtd7 = new JTable7Dialog(this);
 * String header[] = { "부서번호", "부서명", "지역" };
 * String datas[][] = new String[0][3];
 * // this는 사용되는 클래스 영역에서 선언된 클래스를 가리킨다
 * // 그러면 여기서는 DeptTable1타입인 것임
 * // 그런데 DefaultTableModel은 자바에서 제공되는 클래스임-생성자도 정해져 있음
 * // 생성자는 메소드 오버로딩 규칙을 따름 - 파라미터의 갯수나 타입이 달라야 함
 * // 제공되는 생성자에 없음 - 결국 사용 못함 - 컴파일 에러(문법에러 발생)
 * DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);// 생성자 호출
 * JTable jtb_dept = new JTable(dtm_dept);
 * JScrollPane jsp_dept = new JScrollPane(jtb_dept,
 * JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
 * JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
 * // 버튼을 붙일 속지 선언
 * JPanel jp_north = new JPanel();
 * JButton jbtn_sel = new JButton("조회");
 * JButton jbtn_ins = new JButton("입력");
 * JButton jbtn_upd = new JButton("수정");
 * JButton jbtn_del = new JButton("삭제");
 * JButton jbtn_det = new JButton("상세보기");
 * static Vector<String[]> vdata = new Vector<>(); // vdata.size()=0;
 * 
 * // 생성자
 * public DeptTable7() {
 * initDisplay();
 * }
 * 
 * // 화면그리기
 * public void initDisplay() {
 * jbtn_sel.addActionListener(this);
 * jbtn_del.addActionListener(this);
 * jbtn_upd.addActionListener(this);
 * jbtn_det.addActionListener(this);
 * jbtn_ins.addActionListener(this);
 * jp_north.setLayout(new FlowLayout(FlowLayout.RIGHT));
 * jbtn_sel.setBackground(new Color(158, 9, 9));
 * jbtn_sel.setForeground(Color.WHITE);
 * jbtn_ins.setBackground(new Color(19, 99, 57));
 * jbtn_ins.setForeground(Color.WHITE);
 * jbtn_upd.setBackground(new Color(54, 54, 54));
 * jbtn_upd.setForeground(Color.WHITE);
 * jbtn_del.setBackground(new Color(7, 84, 170));
 * jbtn_del.setForeground(Color.WHITE);
 * jp_north.add(jbtn_sel);
 * jp_north.add(jbtn_ins);
 * jp_north.add(jbtn_upd);
 * jp_north.add(jbtn_del);
 * jp_north.add(jbtn_det);
 * this.add("North", jp_north);
 * this.add("Center", jsp_dept);
 * this.setTitle("부서관리시스템 Ver1.0");
 * this.setSize(500, 400);
 * this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * this.setVisible(true);
 * }
 * 
 * // 새로고침 - Vector에 담긴 String[]출력하기
 * // 입력, 수정화면에서 저장 버튼 누르면 Vector에 String[] 푸가하고
 * // 그 다이얼로그 화면은 닫히고 부모창은 새로고침 처리한다.
 * // 그러니까 다이얼로그창에서 부모클래스의 refreshData 메소드를 호출해야함
 * // 그러니까 인스턴스화 할 때 파라미터에서 this를 넘겨서 사용할 수 있도록 할것(null)
 * 
 * public void refreshData() {
 * System.out.println("refreshData 호출");
 * // 입력, 수정 전에 조회된 정보는 삭제함
 * while (dtm_dept.getRowCount() > 0) {
 * dtm_dept.removeRow(0);
 * }
 * if (DeptTable7.vdata.size() <= 0) {
 * JOptionPane.showMessageDialog(this, "조회결과가 없습니다.", "WARN",
 * JOptionPane.INFORMATION_MESSAGE);
 * return;// refreshData()탈출
 * }
 * System.out.println("DeptTable7 : " + vdata.size());
 * // 벡터의 크기만큼 반복하면서 dtm_dept 데이터 셋에 String[]추가함
 * for (int i = 0; i < vdata.size(); i++) {
 * String[] oneRow = vdata.get(i);
 * dtm_dept.addRow(oneRow);
 * }
 * }
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * Object obj = e.getSource();
 * if(obj == jbtn_sel){
 * refreshData();
 * }
 * //너 입력버튼 누른거야?
 * else if (obj == jbtn_ins) {
 * jtd7.set("입력", true, null)
 * //JOptionPane.showInputDialog(rootPane, "입력하세요", "",
 * JOptionPane.PLAIN_MESSAGE);
 * //너 수정하려고?
 * }else if(obj == jbtn_upd){
 * //어떤 로우를 수정할거니?
 * //JTabld 목록에서 선택한 로우의 index 값을 가져옴
 * int index = jtb_dept.getSelectedRow();
 * //데이셋객체로 벡터를 사용중이니 벡터에서 커낸값을 String[] 초기화
 * //테이블의 양식 폼임 JTable 이벤트로 얻어옴
 * String[] oneRow = vdata.get(index);
 * jtd7.set("수정", true, oneRow);
 * 
 * }
 * //너 상세보기 원해?
 * else if(obj == jbtn_det){
 * 
 * // jtd7.set("상세보기", true, 데이터로우값-String[]);
 * 
 * }
 * 
 * }
 * 
 * // 메인메소드
 * public static void main(String[] args) {
 * new DeptTable7();
 * 
 * }
 * 
 * }
 * 
 * /*
 * 입력성공시
 * 수정성공시
 * 삭제성공시에는 화면을 새로고침 처리함
 * 
 * 삭제는 메인에서 삭제처리함 - 다이얼로그의 도움이 없이 처리 - 비번이 있는 것도 아니니까
 * 입력은 새로 입력받아서 처리함
 * 수정은 기존에 있는 정보이므로, 서버를 경유하여 그 값을 가져온 후 삭제하고 새로운 수정된 정보를 추가하는 방법으로 처리
 * 
 * 저장 버튼 누르면(다이얼로그창)
 * 입력, 수정완료되면 부모창의 refreshData메소드를 호출해야 함
 * 이 때 원본의 창을 새로고침 하는 것이다.(오늘의 학습목표)
 * 
 * public void refreshData(){
 * 
 * }
 * 
 * 
 * set(Striong title, boolean isView, String[])
 * public void set Value(String[] oneRow){
 * 입력을 위한 윈도우 설정 - 모든값을 빈문자열로 처리}
 * 
 * //상세보기, 수정시는 배열로 받은 값으로 셋팅을 함 (JTextField)
 * JTextField jft = new JTextField();
 * 
 * jtf.getText(): String -> Vector ->조회처리
 * ????
 */