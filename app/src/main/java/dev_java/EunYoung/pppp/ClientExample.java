package dev_java.EunYoung.pppp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
  public static void main(String[] args) {
    Socket socket = null;
    try {
      socket = new Socket();
      System.out.println("연결요청");
      socket.connect(new InetSocketAddress("local host", 5001));
      System.out.println("연결성공");
    } catch (Exception e) {
      // TODO: handle exception
    }

    if (!socket.isClosed()) {
      try {
        socket.close();
      } catch (IOException e1) {
        // TODO: handle exception
      }
    }
  }

}
