package dev_java.week3;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JButtonUIEvent implements ActionListener {
  JButtonUI jUi = null;

  public JbuttonUIEvent(JButton jButtonUI){
    this.jUi = jButtonUI;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == jUi.jbtn_south) {
      System.out.println(jbtn_south.getText() + "버튼 클릭");
    }

  }

}