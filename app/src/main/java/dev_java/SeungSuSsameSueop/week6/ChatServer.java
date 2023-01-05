package dev_java.SeungSuSsameSueop.week6;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer implements Runnable {
  // 메인스레드이다.
  public static void main(String[] args) {
    ChatServer cs = new ChatServer();
    Thread th = new Thread(cs);
    th.start();
  }

  @Override
  public void run() {
    int port = 3000;
    ServerSocket server = null;
    try {
      server = new ServerSocket(port);
      // 대기상태 ~~~ 시간이 가다가 ChatClient에서 new Socke("서버ip", 3000);
      // 대기상태 풀림
      System.out.println("서버 소켓 생성 완료- 클라이언트 소켓 접속 기다리는 중.....");
      while (true) {
        // 아래 코드가 진행되는 시점은 언제지? - new Socket("서버의 ip 주소", 포트);
        Socket client = server.accept();
        System.out.println((client.getInetAddress())); // 접속한 클라이언트 정보 출력
        // 금융권 주로 사용 - io클래스 - 보안강화 - 직렬화기법
        // 말하기 - ObjectOutputStream -> writeObject();
        // 듣기 - ObjectInpitStream -> readObject(); 듣기

      }

    } catch (Exception e) {
      e.printStackTrace();
    }

  } // run

}
