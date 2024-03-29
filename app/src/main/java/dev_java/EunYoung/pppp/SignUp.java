package dev_java.EunYoung.pppp;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.*;

public class SignUp extends JDialog {
  private JPanel signUpPanel = new JPanel(new GridLayout(11, 0));
  private JTextField idText = new JTextField("아이디");
  private JPasswordField pwText = new JPasswordField();
  private JPasswordField pwCheckText = new JPasswordField();
  private JTextField nameText = new JTextField("이름");
  private JTextField birthYearText = new JTextField("생일 년도");
  private String[] birthMonthContent = { "생일 월", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
  private JComboBox<String> birthMonthList = new JComboBox<>(birthMonthContent);
  private JTextField birthDayText = new JTextField("생일 일자");
  private JTextField phoneNumberText = new JTextField("핸드폰 번호");
  private JButton signUpbtn = new JButton("회원가입");
  private JLabel pwlabel = new JLabel("비밀번호");
  private JLabel pwChecklabel = new JLabel("비밀번호 확인");

  private boolean membershipProgress = false;

  public SignUp() {

    this.setTitle("회원가입");

    this.signUpPanel.add(idText);
    this.signUpPanel.add(pwlabel);
    this.signUpPanel.add(pwText);
    this.signUpPanel.add(pwChecklabel);
    this.signUpPanel.add(pwCheckText);
    this.signUpPanel.add(nameText);
    this.signUpPanel.add(birthYearText);
    this.signUpPanel.add(birthMonthList);
    this.signUpPanel.add(birthDayText);
    this.signUpPanel.add(phoneNumberText);
    this.signUpPanel.add(signUpbtn);

    this.setContentPane(signUpPanel);
    this.setSize(300, 500);
    this.setLocationRelativeTo(null);

    FocusEvent();
    checkValue();
  }

  // 텍스트 필드에 있는 값을 체크하고 지우기 위한 메소드
  private void FocusEvent() {
    idText.addFocusListener(new FocusListener() {
      public void focusLost(FocusEvent e) {
        if (idText.getText().trim().length() == 0) {
          idText.setText("아이디");
        }
      }

      public void focusGained(FocusEvent e) {
        if (idText.getText().trim().equals("아이디")) {
          idText.setText("");
        }
      }
    });

    nameText.addFocusListener(new FocusListener() {
      public void focusLost(FocusEvent e) {
        if (nameText.getText().trim().length() == 0) {
          nameText.setText("이름");
        }
      }

      public void focusGained(FocusEvent e) {
        if (nameText.getText().trim().equals("이름")) {
          nameText.setText("");
        }
      }
    });

    birthYearText.addFocusListener(new FocusListener() {
      public void focusLost(FocusEvent e) {
        if (birthYearText.getText().trim().length() == 0) {
          birthYearText.setText("생일 년도");
        }
      }

      public void focusGained(FocusEvent e) {
        if (birthYearText.getText().trim().equals("생일 년도")) {
          birthYearText.setText("");
        }
      }
    });

    birthDayText.addFocusListener(new FocusListener() {
      public void focusLost(FocusEvent e) {
        if (birthDayText.getText().trim().length() == 0) {
          birthDayText.setText("생일 일자");
        }
      }

      public void focusGained(FocusEvent e) {
        if (birthDayText.getText().trim().equals("생일 일자")) {
          birthDayText.setText("");
        }
      }
    });

    phoneNumberText.addFocusListener(new FocusListener() {
      public void focusLost(FocusEvent e) {
        if (phoneNumberText.getText().trim().length() == 0) {
          phoneNumberText.setText("핸드폰 번호");
        }
      }

      public void focusGained(FocusEvent e) {
        if (phoneNumberText.getText().trim().equals("핸드폰 번호")) {
          phoneNumberText.setText("");
        }
      }
    });
  }

  // 회원 가입할때 모든 값이 입력되었는지 체크하기 위한 메소드
  private void checkValue() {
    signUpbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (idText.getText().trim().length() == 0 || idText.getText().trim().equals("아이디")) {
          JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요.", "아이디 입력", JOptionPane.WARNING_MESSAGE);
          idText.grabFocus();
          return;
        }

        if (pwText.getText().trim().length() == 0) {
          JOptionPane.showMessageDialog(null, "비밀번호를 입력해 주세요.", "비밀번호 입력", JOptionPane.WARNING_MESSAGE);
          pwText.grabFocus();
          return;
        }

        if (pwCheckText.getText().trim().length() == 0) {
          JOptionPane.showMessageDialog(null, "비밀번호 확인을 입력해 주세요.", "비밀번호 확인 입력", JOptionPane.WARNING_MESSAGE);
          pwCheckText.grabFocus();
          return;
        }

        if (!(pwText.getText().trim().equals(pwCheckText.getText().trim()))) {
          JOptionPane.showMessageDialog(null, "비밀번호가 같지 않습니다.!!", "비밀번호 확인", JOptionPane.WARNING_MESSAGE);
          return;
        }

        if (nameText.getText().trim().length() == 0 || nameText.getText().trim().equals("이름")) {
          JOptionPane.showMessageDialog(null, "이름을 입력해 주세요.", "이름 입력", JOptionPane.WARNING_MESSAGE);
          nameText.grabFocus();
          return;
        }

        if (birthYearText.getText().trim().length() == 0 || birthYearText.getText().trim().equals("생일 년도")) {
          JOptionPane.showMessageDialog(null, "생년월일의 생일 년도를 입력해 주세요.", "생일 년도 입력", JOptionPane.WARNING_MESSAGE);
          birthYearText.grabFocus();
          return;
        }

        if (birthMonthList.getSelectedIndex() == 0) {
          JOptionPane.showMessageDialog(null, "생년월일의 월을 선택해 주세요.", "월 입력", JOptionPane.WARNING_MESSAGE);
          birthMonthList.grabFocus();
          return;
        }

        if (birthDayText.getText().trim().length() == 0 || birthDayText.getText().trim().equals("생일 일자")) {
          JOptionPane.showMessageDialog(null, "생일 일자를 입력해 주세요.", "생일 일자 입력", JOptionPane.WARNING_MESSAGE);
          birthDayText.grabFocus();
          return;
        }

        if (phoneNumberText.getText().trim().length() == 0 || phoneNumberText.getText().trim().equals("핸드폰 번호")) {
          JOptionPane.showMessageDialog(null, "핸드폰 번호를 입력해 주세요.", "핸드폰 번호 입력", JOptionPane.WARNING_MESSAGE);
          phoneNumberText.grabFocus();
          return;
        }

        /** 컴퓨터 C드라이브에 java_member 폴더 만들고 member.txt 파일 만드시면 됩니다. **/
        // 회원가입시 텍스트 파일을 하나 만들어서 아이디와 비번을 저장 하자. 한줄 뛰고 아이디|비밀번호 텍스트 파일에 차곡 차곡 저장하기~ | 는
        // 아이디랑 패스워드 구분하기 위해 사용
        String txt = idText.getText() + "|" + pwText.getText();
        txt += "\n";

        String fileName = "D:\\member.txt";

        try {
          BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));

          // 파일안에 문자열 쓰기
          fw.write(txt);
          fw.flush();

          // 객체 닫기
          fw.close();

        } catch (Exception errmsg) {
          errmsg.printStackTrace();
        }

        // 여기까지 왔다면 모든 값을 입력하고 선택하는 것이 완료되었으니 회원가입 과정이 완료.
        membershipProgress = true;

        JOptionPane.showMessageDialog(null, "회원 가입이 완료 되었습니다.", "회원 가입 완료.", JOptionPane.WARNING_MESSAGE);

        setVisible(false);
      }
    });
  }

  // 메인 클래스에서 다이얼로그 회원가입 창 데이터를 가져오기 위한 get 메소드 선언
  public String getIdText() {
    return this.idText.getText().trim();
  }

  public String getPwText() {
    return this.pwText.getText().trim();
  }

  public String getPwCheckText() {
    return this.pwCheckText.getText().trim();
  }

  public String getNameText() {
    return this.nameText.getText().trim();
  }

  public String getBirthYearText() {
    return this.birthYearText.getText().trim();
  }

  public String getBirthMonthContent() {
    return this.birthMonthList.getSelectedItem().toString();
  }

  public String getBirthDayText() {
    return this.birthDayText.getText();
  }

  public String getPhoneNumberText() {
    return this.phoneNumberText.getText().trim();
  }

  public boolean memberCheck() {
    return membershipProgress;
  }

}
