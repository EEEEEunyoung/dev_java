package dev_java.SeungSuSsameSueop.week3;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaUI2 implements ActionListener {

   // 선언부
   JTextAreaUILogic2 jtaUILogic = new JTextAreaUILogic2(this);
   ActionListener jEvent = new JTextAreaUI2Event(this);
   JFrame jf = new JFrame();
   JTextArea jta = null;
   JTextField jtf = new JTextField(10);

   public JTextAreaUI2() {
      initDisplay();
   }

   public JTextArea getTextArea() {
      if (jta == null) {
         jta = new JTextArea(10, 20);
      }
      return jta;
   }

   public void initDisplay() {
      jtf.addActionListener(jEvent);
      jta.setBackground(Color.cyan);
      jf.add("Center", jta);
      jf.add("South", jtf);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(400, 300);
      jf.setVisible(true);
   }

   public static void main(String[] args) {
      new JTextAreaUI2();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if (jtf == obj) {
         String input = jtf.getText();
         jtaUILogic.account(input);
         jtf.setText("");
      }
   }
}