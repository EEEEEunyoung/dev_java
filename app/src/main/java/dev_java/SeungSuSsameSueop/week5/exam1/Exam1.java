package dev_java.SeungSuSsameSueop.week5.exam1;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam1 {
  // 서버측에는 소켓이 두 개 필요함
  // ServerSocket - 동시에 많은 사람 접속해 올때 튕기지 않고 모두 받아주기 위한 소켓
  // Socket - 실제로 일하는 소켓
  public void server() {
    int port = 3000;
    ServerSocket server = null;
    try {
      server = new ServerSocket();
      server.bind(new InetSocketAddress("192.168.10.88", port));

      System.out.println("서버 소켓 생성되었습니다.");
      // 대기상태가 진행됨 - 이 뒤에 있는 코드는 진행이 안된다. - wait상태
      while (true) {
        System.out.println("연결대기중");
        // 언제 이 코드로 진입하는가?
        Socket client = server.accept();
        System.out.println("연결수락  /  client : " + client);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Exam1 ns = new Exam1();
    ns.server();
  }

}// Client

/*
 * InetAddress 를 가지고...
 * 로컬은 내컴퓨터 이렇게 갖고오면, 서버가 아니라 내컴퓨터임 서버 아이피 적어야함
 */