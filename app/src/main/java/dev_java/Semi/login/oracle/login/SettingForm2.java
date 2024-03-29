package dev_java.Semi.login.oracle.login;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class SettingForm2 extends JFrame implements ActionListener {
  // ===========================================선언부=======================================================
  // CocoaVO cVO = null;
  String imgPath = "D:\\TEMP\\";
  ImageIcon ig = new ImageIcon(imgPath + "wallPaper.jpg");

  // 폰트 폰트
  Font f1 = new Font("고딕체", Font.PLAIN, 20);
  Font f2 = new Font("궁서", Font.PLAIN, 20);
  Font f3 = new Font("굴림", Font.PLAIN, 10);

  // 환경설정버튼
  JButton jbtn_a = new JButton("배 경 화 면"); // (new ImageIcon(imgPath + "backBtn.png"));// 배경화면 버튼
  JButton jbtn_b = new JButton("폰 트 변 경");// 폰트설정 버튼
  JButton jbtn_c = new JButton("로 그 아 웃"); // 로그아웃버튼

  // 하단고정버튼
  JButton jbtn_friend = new JButton(new ImageIcon(imgPath + "btnfriends.png")); // 첫번째 (사람모양-친구목록)
  JButton jbtn_chat = new JButton(new ImageIcon(imgPath + "btnmsg.png")); // 두번째 (채팅목록-하트메세지)
  JButton jbtn_search = new JButton(new ImageIcon(imgPath + "btnsearch.png")); // 세번째버튼 (검색-돋보기)
  JButton jbtn_setting = new JButton(new ImageIcon(imgPath + "btnsetting.png")); // 네번째버튼 (설정-톱니바퀴)

  // ===========================================선언부
  // 끝====================================================

  // 생성자
  SettingForm2() {
    // this.cVO = cVO;
  }

  class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
      g.drawImage(ig.getImage(), 0, 0, null);
      setOpaque(false);
      super.paintComponent(g);
    } // end of MyPanel - 사용자 패널 정의 - LoginForm$1.class
  }

  //////////////////////// 화면그리기
  public void initDisplay() {
    // 창
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new MyPanel());
    this.setLayout(null);
    this.setLocation(500, 100);
    this.setResizable(false);
    this.setTitle("Setting");
    this.setLocation(500, 100);
    this.setSize(426, 688);
    this.setVisible(true);
    jbtn_a.setFont(f1);
    jbtn_b.setFont(f1);
    jbtn_c.setFont(f1);

    //// 환경설정 버튼
    jbtn_a.setBounds(65, 120, 280, 60);
    jbtn_a.setBackground(new Color(255, 255, 204));
    this.add(jbtn_a);
    jbtn_b.setBounds(65, 240, 280, 60);
    jbtn_b.setBackground(new Color(255, 255, 204));
    this.add(jbtn_b);
    jbtn_c.setBounds(65, 360, 280, 60);
    jbtn_c.setBackground(new Color(255, 255, 204));
    this.add(jbtn_c);

    /*
     * jbtn_a.setBorderPainted(true);
     * jbtn_a.setContentAreaFilled(false);
     * jbtn_b.setBorderPainted(false);
     * jbtn_b.setContentAreaFilled(false);
     * jbtn_c.setBorderPainted(false);
     * jbtn_c.setContentAreaFilled(false);
     */

    // 하단 고정 버튼 4개

    jbtn_friend.setBounds(15, 565, 80, 80);
    this.add(jbtn_friend);
    jbtn_chat.setBounds(110, 565, 80, 80);
    this.add(jbtn_chat);
    jbtn_search.setBounds(205, 565, 80, 80);
    this.add(jbtn_search);
    jbtn_setting.setBounds(300, 565, 80, 80);
    this.add(jbtn_setting);

    jbtn_friend.setBorderPainted(false);
    jbtn_friend.setContentAreaFilled(false);
    jbtn_search.setBorderPainted(false);
    jbtn_search.setContentAreaFilled(false);
    jbtn_chat.setBorderPainted(false);
    jbtn_chat.setContentAreaFilled(false);
    jbtn_setting.setBorderPainted(false);
    jbtn_setting.setContentAreaFilled(false);

    // 버튼들 액션리스너

    jbtn_a.addActionListener(this);
    jbtn_b.addActionListener(this);
    jbtn_c.addActionListener(this);

    jbtn_friend.addActionListener(this);
    jbtn_search.addActionListener(this);
    jbtn_chat.addActionListener(this);
    jbtn_setting.addActionListener(this);

  }////////////// 화면그리기 / initDisplay 끝//////////////////////////////

  // 폰트변경메소드 =============================작업중===============================
  public void fontchange() {
    String[] font1 = { "나진지하다궁서체", "땡글땡글굴림체", "맑은고딩같은고딕체" };
    Object fonttype = JOptionPane.showInputDialog(null, "궁서체 좋죠 고딕체도 좋죠", "font setting",
        JOptionPane.QUESTION_MESSAGE,
        null, font1, font1[0]);
    if (fonttype.equals(font1[0])) {
      initDisplay();
      jbtn_a.setFont(f2);
      jbtn_b.setFont(f2);
      jbtn_c.setFont(f2);
      System.out.println("궁서체됐긔 changed");

    } else if (fonttype.equals(font1[1])) {
      initDisplay();
      jbtn_a.setFont(f3);
      jbtn_b.setFont(f3);
      jbtn_c.setFont(f3);
      System.out.println("굴림font changed");

    } else if (fonttype.equals(font1[2])) {
      initDisplay();
      jbtn_a.setFont(f1);
      jbtn_b.setFont(f1);
      jbtn_c.setFont(f1);
      System.out.println("고딕font changed");
    }

  } // 폰트변경 메소드 끝

  // 배경 변경 메소드=============================작업중===============================
  public void backchange() {
    String[] back1 = { "바나나는 원래 하얀색", "치키차카 초코색" };
    Object backtype = JOptionPane.showInputDialog(null, "원하는 배경 색을 선택하세요.", "background color setting",
        JOptionPane.PLAIN_MESSAGE,
        null, back1, back1[0]);

    if (backtype.equals(back1[0])) {
      initDisplay();
      ig = new ImageIcon(imgPath + "yellowback.png");
      System.out.println("하얀색 됐긔 changed");

    } else if (backtype.equals(back1[1])) {
      initDisplay();
      ig = new ImageIcon(imgPath + "chocoback.png");
      System.out.println("초코색 됐긔font changed");

    }

  }

  // 메인메소드
  public static void main(String[] args) {
    SettingForm2 settingForm = new SettingForm2();
    settingForm.initDisplay();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    SettingForm2 settingForm = new SettingForm2();

    // 하단고정버튼
    if (obj == jbtn_friend) {
      MainForm mf = new MainForm();
      mf.initDisplay();
      this.dispose();

    } else if (obj == jbtn_chat) {
      MainForm mf = new MainForm();
      mf.initDisplay();
      mf.clearCenter(mf.cl);
      this.dispose();

    } else if (obj == jbtn_search) {
      SearchMainForm searchMainForm = new SearchMainForm();
      searchMainForm.Search_init();
      this.dispose();

    } else if (obj == jbtn_setting) {
      settingForm.initDisplay();
      this.dispose();

      // 환경설정 버튼 기능
    } else if (obj == jbtn_a) { // 배경화면
      settingForm.backchange();

      this.dispose();

    } else if (obj == jbtn_b) { // 폰트설정
      // settingForm.initDisplay();
      settingForm.fontchange();
      this.dispose();

    } else if (obj == jbtn_c) { // 로그아웃

    } // else if

  }
} // end of SettingForm
