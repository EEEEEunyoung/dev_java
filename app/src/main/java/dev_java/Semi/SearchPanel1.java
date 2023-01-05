package dev_java.Semi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchPanel1 {

  JFrame jframe = new JFrame();
  JPanel jpanel = new JPanel();
  JTextField t4 = new JTextField();
  JTextArea ta = new JTextArea();
  JButton btn5;
  // JLabel label = new JLabel("검색 : ");

  SearchPanel1() {
    Search_init();
  }

  public void Search_init() {
    jframe.setTitle("CocoaTalk_SearchPanel");
    jframe.setBounds(50, 50, 480, 670);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jframe.setVisible(true);
    jpanel.setLayout(null);
    jframe.add(jpanel);

    t4.setBounds(100, 100, 300, 30);
    jpanel.add(t4);
    // label.setBounds(150, 100, 70, 30);
    // jpanel.add(label);

    JScrollPane jsp = new JScrollPane(ta);
    jsp.setBounds(23, 145, 420, 250);
    jpanel.add(jsp);

    jpanel.add(btn5 = new JButton("검색"));
    btn5.setBounds(360, 100, 80, 29);

    SearchDataList thr = new SearchDataList();

    // 검색기능
    btn5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        ta.setText("");
        String content = t4.getText();

        ArrayList<SearchFirst> arr = new ArrayList<SearchFirst>();
        arr = thr.searchMember(content);
        ta.append(" \n");

        ta.append("\t" + "name" + "\t" + "iden" + "\t" + "pwd\n");
        ta.append("\t" + "------------------------------------------------------------\n");

        for (int i = 0; i < arr.size(); i++) {
          ta.append("\t" + arr.get(i).getName() + " \t " + arr.get(i).getIden() + " \t " + arr.get(i).getPwd()
              + "\n");
        }

        t4.setText("");
      }
    });
  }

  public static void main(String[] args) {
    SearchPanel1 serchPanel1 = new SearchPanel1();
    serchPanel1.Search_init();
  }
}
