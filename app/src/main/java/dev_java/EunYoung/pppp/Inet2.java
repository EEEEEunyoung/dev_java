package dev_java.EunYoung.pppp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet2 {
  public static void main(String[] args) {
    try {
      InetAddress local = InetAddress.getLocalHost();
      System.out.println("내ip:" + local.getHostAddress());

      InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
      for (InetAddress remote : iaArr) {
        System.out.println("네이버:" + remote.getHostAddress());
      }

    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}