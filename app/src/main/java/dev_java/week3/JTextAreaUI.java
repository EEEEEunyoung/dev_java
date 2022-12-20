package dev_java.week3;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
​
​
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
​
public class JTextAreaUI implements ActionListener{
   //선언부
   JTextAreaUILogic jtaUILogic = new JTextAreaUILogic(this);
   JFrame jf = new JFrame();
   JTextArea jta = new JTextArea(10,20);
   JTextField jtf = new JTextField(10);
   public JTextAreaUI(){
      initDisplay();
   }
   public void initDisplay(){
      jtf.addActionListener(this);
      jta.setBackground(Color.cyan);
      jf.add("Center", jta);
      jf.add("South", jtf);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(400, 300);
      jf.setVisible(true);
   }
   public static void main(String[] args) {
      new JTextAreaUI();
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if(jtf == obj){
         String input = jtf.getText();
         jtaUILogic.account(input);
         jtf.setText("");
      }
   }
}