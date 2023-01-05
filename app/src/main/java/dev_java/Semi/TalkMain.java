package dev_java.Semi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

public class TalkMain extends JFrame implements ActionListener {
  // 선언부
  // 이미지 경로 선언
  String imgPath = "C:\\Users\\user1\\Desktop\\CocoaTalkbyKo\\image\\";
  ImageIcon img = new ImageIcon(imgPath + "kazha.jpg");
  JTable jtb = new JTable();
  JScrollPane jsp = new JScrollPane(jtb);
  JPanel jp = new JPanel();
  JPanel jp_behind = new JPanel();
  JButton jbtn_send = new JButton("보내기");
  JTextField jtf_message = new JTextField();
  JTextArea jta_display = new JTextArea();
  JScrollPane jsp_display = new JScrollPane(jta_display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
  Font f = new Font("Paryrus", Font.BOLD, 40);
  // Font f = new Font("Arial", Font.BOLD, 40);
  // Font f = new Font("휴먼매직체", Font.BOLD, 40);
  // Font f = new Font("굴림체", Font.BOLD, 40);

  // 생성자
  TalkMain() {
  }

  public void initDisplay() {
    // 폰트 설정
    jtf_message.setFont(f);// 입력창 폰트
    jta_display.setFont(f);// 대화창 폰트

    // 이벤트 처리
    jbtn_send.addActionListener(this);
    jtf_message.addActionListener(this);

    // 종료 버튼 누리면 꺼짐
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // 레이아웃 설정
    this.setLayout(new BorderLayout());
    jp.setLayout(new BorderLayout());

    // 버튼과 텍스트 필드 추가
    jp.add(jtf_message, BorderLayout.CENTER);
    jp.add(jbtn_send, BorderLayout.EAST);

    // 텍스트 영역의 테투리
    jta_display.setLineWrap(true);

    // 스크롤 추가
    this.add(jsp_display, BorderLayout.CENTER);
    this.add(jp, BorderLayout.SOUTH);

    // 프레임 설정
    this.setTitle("COCOA TALK");
    this.setSize(410, 650);
    this.setVisible(true);

    // 바탕화면 카즈하 처리
    ImageIcon icon = new ImageIcon(imgPath + "kazha.jpg");
    JLabel label = new JLabel(icon);
    jta_display.add(label, BorderLayout.NORTH);
    // this.add(jp_behind, BorderLayout.NORTH);
    jbtn_send.setPreferredSize(new Dimension(100, 80));
  }

  // 메인 메소드
  public static void main(String[] args) {
    TalkMain MainForm = new TalkMain();
    MainForm.initDisplay();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();

    // 채팅 이벤트 처리
    if (obj == jbtn_send || obj == jtf_message) {
      // 입력된 메시지 얻기
      String message = jtf_message.getText();

      // jTextArea_display 텍스트 영역에 출력
      jta_display.append(message + "\n");

      // jTextField_mesaage 텍스트 필드 초기화
      jtf_message.setText("");
    }
  }
}
