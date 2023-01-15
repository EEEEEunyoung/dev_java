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
  int result = 0;
  int first_num = 0;
  int second_num = 0;
  String op_num = "";
  String op_str = "";

  // 버튼
  String btn_name[] = { "C", "/", "*", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
  JButton btns[] = new JButton[btn_name.length];

  public Cal2() {
    setVisible(true);
    setTitle("마이드림");
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

  static int add(int x, int y) {
    return x + y;
  }

  int minus(int x, int y) {
    return x - y;
  }

  Double div(double x, double y) {
    return x / y;
  }

  int mul(int x, int y) {
    return x * y;
  }

  @Override
  public void actionPerformed(ActionEvent e) throws NumberFormatException {
    Object input = e.getActionCommand();

      result = add(2, 5);
      text.setText(result);
      processOperatp
    }else if(input.equals("+"))

  {
    text.setText("+");
    first_num = text.getText(Integer(parseInt));
    add(first_num, second_num);

  }else if(input.equals("7"))
  {
    text.setText("7");
  }else if(input.equals("8"))
  {
    text.setText("8");
  }else if(input.equals("9"))
  {
    text.setText("9");
  }else if(input.equals("1"))
  {
    text.setText("1");
  }else if(input.equals("2"))
  {
    text.setText("2");
  }else if(input.equals("3"))
  {
    text.setText("3");
  }else if(input.equals("4"))
  {
    text.setText("4");
  }else if(input.equals("5"))
  {
    text.setText("5");
  }else if(input.equals("6"))
  {
    text.setText("6");
  }else if(input.equals("0"))
  {
    text.setText("0");
  }else if(e.getSource()==btns[3])
  {
    text.setText("+");
  }else if(input.equals("C"))
  {
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
