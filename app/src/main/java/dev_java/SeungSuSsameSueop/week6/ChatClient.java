package dev_java.SeungSuSsameSueop.week6;

import java.net.InetAddress;

public class ChatClient {
  public void client() {
    int port = 3000;
    String server = "192.168.20.34";
    // java.net, jave.io 인터넷 회선 장애 문제발생 원인
    // io생성시에 소켓을 통해 인스턴스화를 하니까 의존관계있다.
    // 이런패키지는 반드시 예외처리할 것(Thread - 인터셉트를 당할 수 있다. - 제어권을 빼앗김)
    // Object마다 lock flag 값이 있어서 스레드가 점유하면 잠금 - 다른 스레드 사용불가)
    // 데드릭 상태에 빠질 수 있다. (안에서 잠금으로 다른 스레드가 사용불가)
    // 한정된 자원을 여러 사람이 이용하기 위해 제공되는 클래스가 Thread
    // Thread.sleep(), join, yield, intercept......
    try {
      System.out.println(InetAddress.getLocalHost().getHostAddress());

    } catch (Exception e) {
      e.printStackTrace();
    }

  } // client

  public static void main(String[] args) {
    ChatClient cc = new ChatClient();
    cc.client();
  } // main

}
