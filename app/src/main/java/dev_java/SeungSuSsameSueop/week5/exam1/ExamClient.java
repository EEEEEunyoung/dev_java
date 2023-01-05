package dev_java.SeungSuSsameSueop.week5.exam1;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ExamClient {
  public void client() {
    int port = 3000;
    String serverIP = null;
    Socket socket = null;

    try {
      serverIP = "192.168.10.88";
      socket = new Socket(serverIP, port);
      socket.connect(new InetSocketAddress(serverIP, port));
      System.out.println("NetworkClient socket " + socket);
    } catch (Exception e) {
      System.out.println("NetworkClient client " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    ExamClient nc = new ExamClient();
    nc.client();
  }

}
// 로컬포트, 서버포트 양쪽 있어야함.
