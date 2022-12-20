package dev_java.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaUI2Event implements dev_java.week3.ActionListener {
   JTextAreaUI2 jUi2 = null;

   public JTextAreaUI2Event(JTextAreaUI2 jUi2) {
      this.jUi2 = jUi2;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();

   }
}