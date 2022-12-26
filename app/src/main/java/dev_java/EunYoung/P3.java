package dev_java.EunYoung;

import java.io.InputStream;

public class P3 {
  public static void main(String[] args) throws Exception {
    InputStream is = System.in;

    byte[] datas = new byte[100];

    System.out.println("이름 : ");
    int name = is.read(datas);
    String n = new String(datas, 0, name - 2);

    System.out.println("하고싶은말 : ");
    int com = is.read(datas);
    String comment = new String(datas, 0, com - 2);

    System.out.println("입력한 이름:" + n);
    System.out.println("하고싶은 말 : " + comment);

  }
}
