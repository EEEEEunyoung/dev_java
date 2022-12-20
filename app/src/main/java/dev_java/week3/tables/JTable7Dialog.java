package dev_java.week3.tables;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JDialog도 디폴트가 BorderLayout임 - jp_center 를 중앙배치
public class JTable7Dialog extends JDialog implements ActionListener {
  // 선언부
  DeptTable7 deptTable7 = null;
  JPanel jp_center = new JPanel();
  JScrollPane jsp_center = new JScrollPane(jp_center);
  JPanel jp_south = new JPanel();
  JLabel jlb_deptno = new JLabel("부서번호");
  JTextField jtf_deptno = new JTextField(10);
  JLabel jlb_dname = new JLabel("부서명");
  JTextField jtf_dname = new JTextField(20);
  JLabel jlb_loc = new JLabel("지역");
  JTextField jtf_loc = new JTextField(20);
  // jp_south 속지
  JButton jbtn_save = new JButton("저장");
  JButton jbtn_close = new JButton("닫기");
  // 왜 null을 주는지 설명할 수 있다
  String[] oneRow = null;

  // 생성자
  public JTable7Dialog() {
  }

  public JTable7Dialog(DeptTable7 deptTable7) {
    this.deptTable7 = deptTable7;
    initDisplay();
  }

  // 화면그리기
  public void initDisplay() {
    jbtn_save.addActionListener(this);
    jbtn_close.addActionListener(this);
    jp_center.setLayout(null);
    jp_south.setLayout(new FlowLayout(FlowLayout.RIGHT));
    jlb_deptno.setBounds(20, 20, 100, 20);
    jtf_deptno.setBounds(120, 20, 100, 20);
    jlb_dname.setBounds(20, 45, 100, 20);
    jtf_dname.setBounds(120, 45, 150, 20);
    jlb_loc.setBounds(20, 70, 100, 20);
    jtf_loc.setBounds(120, 70, 150, 20);
    jp_center.add(jlb_deptno);
    jp_center.add(jtf_deptno);
    jp_center.add(jlb_dname);
    jp_center.add(jtf_dname);
    jp_center.add(jlb_loc);
    jp_center.add(jtf_loc);
    jp_south.add(jbtn_save);
    jp_south.add(jbtn_close);
    this.add("Center", jsp_center);
    this.add("South", jp_south);
    this.setSize(400, 360);
    this.setVisible(false);
  }

  // 각 컬럼(부서집합-부서번호,부서명,지역)의 값들을설정하거나
  // 읽어오는 getter/setter메소드 임
  public String getDeptno() {
    return jtf_deptno.getText();
  }

  public void setDeptno(String deptno) {
    jtf_deptno.setText(deptno);
  }

  public String getDname() {
    return jtf_dname.getText();
  }

  public void setDname(String dname) {
    jtf_dname.setText(dname);
  }

  public String getLoc() {
    return jtf_loc.getText();
  }

  public void setLoc(String loc) {
    jtf_loc.setText(loc);
  }

  // 아래 메소드는 DeptTable7에서 호출됨
  // actionPerformed에서 이벤트(입력,수정,상세보기)가 발생되면 호출됨
  // 메소드의 파라미터 자리는 Call by Value에 의해서 결정됨
  public void set(String title, boolean isView, String[] oneRow) {
    this.setTitle(title);
    this.setVisible(isView);
    this.oneRow = oneRow;
    setValue(oneRow);
  }

  public void setValue(String[] oneRow) {// 이런 공통코드를 나는 작성할 수 있다.
    // 입력을 위한 윈도우 설정 - 모든 값을 빈문자열로 셋팅함
    if (oneRow == null) {
      setDeptno("");
      setDname("");
      setLoc("");
    }
    // 상세조회, 수정시는 배열로 받은 값으로 셋팅함
    // 부모창에서 set메소드 호출시 파라미터로 넘겨준 값으로 초기화할것.
    else {
      setDeptno(oneRow[0]);
      setDname(oneRow[1]);
      setLoc(oneRow[2]);
    }
  }// end of setValue

  // 메인
  public static void main(String[] args) {
    new JTable7Dialog(null);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == jbtn_save) {
      // oneRow가 존재하면 수정모드, 그렇지 않으면 입력모드로 함
      if (oneRow != null) {

      } else {
        String[] oneRow = { getDeptno(), getDname(), getLoc() };
        System.out.println(oneRow[0] + ", " + oneRow[1] + ", " + oneRow[2]);
        System.out.println("before : " + DeptTable7.vdata.size());
        DeptTable7.vdata.add(oneRow);
        System.out.println("after : " + DeptTable7.vdata.size());
        deptTable7.refreshData();
        this.dispose();
      }
    }

  }

}

/*
 * import java.awt.FlowLayout;
 * import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener;
 * 
 * import javax.swing.JButton;
 * import javax.swing.JDialog;
 * import javax.swing.JLabel;
 * import javax.swing.JPanel;
 * import javax.swing.JScrollPane;
 * import javax.swing.JTextField;
 * 
 * // JDialog도 디폴트가 BorderLayout임 - jp_center를 중앙배치
 * public class JTable7Dialog extends JDialog implements ActionListener {
 * // 선언부
 * DeptTable7 deptTable7 = null;
 * JPanel jp_center = new JPanel();
 * JScrollPane jsp_center = new JScrollPane(jp_center);
 * JPanel jp_south = new JPanel();
 * JLabel jlb_deptno = new JLabel("부서번호");
 * JTextField jtf_deptno = new JTextField(10);
 * JLabel jlb_dname = new JLabel("부서명");
 * JTextField jtf_dname = new JTextField(20);
 * JLabel jlb_loc = new JLabel("지역");
 * JTextField jtf_loc = new JTextField(20);
 * // jP_south 속지
 * JButton jbtn_save = new JButton("저장");
 * JButton jbtn_close = new JButton("닫기");
 * // 왜 null을 주는지 설명할 수 있다.
 * String[] oneRow = null;
 * 
 * // 생성자
 * public JTable7Dialog() {
 * }
 * 
 * public JTable7Dialog(DeptTable7 deptTable7) {
 * this.deptTable7 = deptTable7;
 * initDisplay();
 * }
 * 
 * // 화면그리기
 * public void initDisplay() {
 * jbtn_save.addActionListener(this);
 * jbtn_close.addActionListener(this);
 * jp_center.setLayout(null);
 * jp_south.setLayout(new FlowLayout(FlowLayout.RIGHT));
 * jlb_deptno.setBounds(20, 20, 100, 20);
 * jtf_deptno.setBounds(120, 20, 100, 20);
 * jlb_dname.setBounds(20, 45, 100, 20);
 * jtf_dname.setBounds(120, 45, 150, 20);
 * jlb_loc.setBounds(20, 70, 100, 20);
 * jtf_loc.setBounds(120, 70, 150, 20);
 * jp_center.add(jlb_deptno);
 * jp_center.add(jtf_deptno);
 * jp_center.add(jlb_dname);
 * jp_center.add(jtf_dname);
 * jp_center.add(jlb_loc);
 * jp_center.add(jtf_loc);
 * jp_south.add(jbtn_save);
 * jp_south.add(jbtn_close);
 * this.add("Center", jsp_center);
 * this.add("South", jp_south);
 * this.setSize(400, 360);
 * this.setVisible(false);
 * }
 * 
 * // 새로고침 -Vector에 담김 String[]출력하기
 * // 입력, 수정화면에서 저장버튼 누르면 Vector에 String[]추가하고
 * // 그 다이얼로그 화면은 닫히고 부모창은 새로고침 처리한다.
 * // 그러니까 다이얼로그창에서 부모클래스의 refreshData메소드를 호출해야함
 * // 그러니까 인스턴스화 할 때 파라미터에 this를 넘겨서 사용할 수 있도록 할것.(NullPointerException)
 * 
 * // 각 컬럼(부서집합-부서번호, 부서명, 지역)의 값들을 설정하거나
 * // 읽어오는 getter/setter 메소드임
 * public String getDeptno() {
 * return jtf_deptno.getText();
 * }
 * 
 * public void setDeptno(String deptno) {
 * jtf_deptno.setText(deptno);
 * }
 * 
 * public String getDname() {
 * return jtf_dname.getText();
 * }
 * 
 * public void setDname(String dname) {
 * jtf_dname.setText(dname);
 * }
 * 
 * public String getLoc() {
 * return jtf_loc.getText();
 * }
 * 
 * public void setLoc(String loc) {
 * jtf_loc.setText(loc);
 * }
 * 
 * // 아래 메소드는 DeptTable7에서 호출됨
 * // actionPerformed 에서 이벤트(입력,수정,상세보기)가 발생되면 호출됨
 * // 메소드의 파라미터 자리는 Call by Value에의해서 결정됨
 * public void set(String title, boolean isView, String[] oneRow) {
 * this.setTitle(title);
 * this.setVisible(isView);
 * this.oneRow = oneRow;
 * setValue(oneRow);
 * }
 * 
 * public void setValue(String[] oneRow) { // 이런 공통코드를 나는 작성할 수 있다.
 * // 입력을 위한 윈도우 설정 - 모든 값을 빈문자열로 셋팅함
 * // 상세조회, 수정시는 배열로 받은 값으로 셋팅함
 * if (oneRow == null) {
 * setDeptno("");
 * setDname("");
 * setLoc("");
 * }
 * // 상세조회, 수정시는 배열로 받은 값으로 셋팅함
 * // 부모창에서 set메소드 호출 시 파라미터로 넘겨준 값으로 초기화할 것.
 * else {
 * setDeptno(oneRow[0]);
 * setDname(oneRow[1]);
 * setLoc(oneRow[2]);
 * }
 * }// end of setValue
 * // 메인
 * 
 * public static void main(String[] args) {
 * new JTable7Dialog(null);
 * }
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * Object obj = e.getSource();
 * if (obj == jbtn_save) {
 * // oneRow가 존재하면 수정모드, 그렇지 않으면 입력모드로 함
 * if (oneRow != null) {
 * 
 * } else {
 * String[] oneRow = { getDeptno(), getDname(), getLoc() };
 * System.out.println(oneRow[0] + "," + oneRow[1] + "," + oneRow[2]);
 * System.out.println("before:" + DeptTable7.vdata.size());
 * DeptTable7.vdata.add(oneRow);
 * System.out.println("after:" + DeptTable7.vdata.size());
 * deptTable7.refreshData();
 * this.dispose();
 * 
 * }
 * }
 * }
 * }
 * /*
 *
 * JTextField jtf = new JTextField();
 *
 * jtf.getText():String -> Vector -> 조회처리
 * jft.setText(String); -화면출력됨
 *
 * 입력, 수정, 삭제버튼은 어디에 있지? - DeptTable7.java
 * JTable7Dialog 클래스에서 제목, 화면 활성화여부, 한개로우를 갖는 String[]이
 * 필요한 이유는 무엇입니까?
 * -두 클래스 모두 이른 인스턴스화를 적용함
 * -이 때 두 화면이 모두 보이면 안됨
 * - 그럼 언제 화면이 출력되는건가요? - 입력 클릭하면, 수정 클릭하면, 상세보기 클릭하면
 * 이를 위해서는 부모클래스에서 다이얼로그 클래스의 인스턴스가 필요함. - 전변으로 해야함.
 *
 *
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