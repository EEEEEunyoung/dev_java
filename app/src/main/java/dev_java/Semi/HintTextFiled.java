package dev_java.Semi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

public class HintTextFiled extends JTextField {
  Font gainFont = new Font("Tahoma", Font.PLAIN, 11);
  Font lostFont = new Font("Tahoma", Font.ITALIC, 11);

  public HintTextFiled(final String hint) {

    setText(hint);
    setFont(lostFont);
    setForeground(Color.GRAY);

    this.addFocusListener(new FocusAdapter() {

      @Override
      public void focusGained(FocusEvent e) {
        if (getText().equals(hint)) {
          setText("");
          setFont(gainFont);
        } else {
          setText(getText());
          setFont(gainFont);
        }
      }

      @Override
      public void focusLost(FocusEvent e) {
        if (getText().equals(hint) || getText().length() == 0) {
          setText(hint);
          setFont(lostFont);
          setForeground(Color.GRAY);
        } else {
          setText(getText());
          setFont(gainFont);
          setForeground(Color.BLACK);
        }
      }
    });
    
    
    // 메인
    
  }}

  tdbIp=new HintTextField("  dbIP");tdbIp.setBounds(173,273,159,30);add(tdbIp);tdbPort=new HintTextField("  dbPort");tdbPort.setBounds(173,330,159,30);add(tdbPort);tdbName=new HintTextField("  dbName");tdbName.setBounds(173,387,159,30);add(tdbName);tmssqlID=new HintTextField("  mssqlID");tmssqlID.setBounds(173,443,159,30);add(tmssqlID);tmssqlPW=new HintTextField("  mssqlPW");tmssqlPW.setBounds(173,500,159,30);add(tmssqlPW);{

  }

  public static void main(String[] args) {
      
    }
