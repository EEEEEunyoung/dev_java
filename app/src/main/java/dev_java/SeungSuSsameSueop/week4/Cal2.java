package dev_java.SeungSuSsameSueop.week4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cal2 extends JFrame implements ActionListener {
  JPanel panel = new JPanel();
  JTextField text = new JTextField();
  String num = "";
  String result = "0";
  String first_num = "";
  String second_num = "";
  String op_num = "";
  String op_str = "";

  // 버튼
  String btn_name[] = { "C", "/", "*", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
  JButton btns[] = new JButton[btn_name.length];

  public Cal2() {
    setVisible(true);
    setTitle("내가만든계산기");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(530, 630);
    setResizable(true);
    // 창
    setLayout(null);
    text.setEditable(false);
    text.setBackground(Color.WHITE);
    text.setHorizontalAlignment(JTextField.RIGHT);
    text.setFont(new Font("Arial", Font.BOLD, 40));
    add(text);

    // 버튼
    for (int i = 0; i < btn_name.length; i++) {
      btns[i] = new JButton(btn_name[i]);
      btns[i].setBackground(Color.BLACK);
      btns[i].setForeground(Color.WHITE);
      btns[i].addActionListener(this);
      btns[i].setFont(new Font("Arial", Font.BOLD, 40));
      switch (i) {
        case 0:
          btns[i].setBackground(Color.RED);
          break;
        case 1, 2, 3, 7, 11, 15:
          btns[i].setBackground(Color.gray);
      }// switch
      panel.add(btns[i]);
      panel.setLayout(new GridLayout(4, 4, 4, 4));
      panel.setBounds(8, 90, 500, 500);
    } // for
    text.setVisible(true);
    text.setBounds(8, 10, 500, 80);
    add(panel);
    text.addActionListener(this);
  } // public Cal2

  @Override
  public void actionPerformed(ActionEvent e) {
    Object input = e.getActionCommand();

    if (e.getSource() == btns[4]) {
      text.setText("7");
    } else if (input.equals("8")) {
      text.setText("8");
    } else if (input.equals("9")) {
      text.setText("9");
    } else if (input.equals("1")) {
      text.setText("1");
    } else if (input.equals("2")) {
      text.setText("2");
    } else if (input.equals("3")) {
      text.setText("3");
    } else if (input.equals("4")) {
      text.setText("4");
    } else if (input.equals("5")) {
      text.setText("5");
    } else if (input.equals("6")) {
      text.setText("6");
    } else if (input.equals("0")) {
      text.setText("0");
    } else if (e.getSource() == btns[3]) {
      processOperator("+");
    } else if (input.equals("C")) {
      num = "";
      first_num = "";
      second_num = "";
      result = "0";
      op_num = "";
      op_str = "";
      text.setText("0");
    }

  }

  public static void main(String[] args) {
    Cal2 c = new Cal2();

  }
}
