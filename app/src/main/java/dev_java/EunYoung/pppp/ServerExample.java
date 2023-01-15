package dev_java.EunYoung.pppp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

import javax.swing.JFrame;

public class ServerExample extends JFrame {
  ExecutorService executorService;
  ServerSocket serverSocket = null;
  List<Client> connections = new Vector<Client>();

void startServer(){
  executorService = Executor.newFixedThreadPool(
Runtime.getRuntime().availableProcessors()
  );

  try{
    serverSocket = new ServerSocket();
    serverSocket.bind(new InetSocketAddress("localhost", 5001));
   
      } catch (Exception e) {
        if (!serverSocket.isClosed()) {
            stopServer();}
            return;
        }
        Runnable runnable = new Runnable(){
          @Override
          public void run(){
            Platform.runLater(()->{
              displayText("[서버시작]");
              btnStartStop.setText("stop");

            })
          }

        };
      }

}

  void StartServer() {
    // 서버종료코드
  }

  class Client {
    // 데이터통신코드
  }

  //////////////////////////// 화면

  TextArea txtDisplay;
  Button btnStartStop;

  public static void main(String[] args) {
    try {
      serverSocket = new ServerSocket();
      serverSocket.bind(new InetSocketAddress("local host", 5001));

      while (true) {
        System.out.println("연결기다림 .....");
        Socket socket = serverSocket.accept();
        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
        System.out.println("연결수락" + isa.getHostName());

      }
    } catch (Exception e) {
    }

    if (!serverSocket.isClosed()) {
      try {
        serverSocket.close();
      } catch (IOException e1) {
        // TODO: handle exception
      }
    }
  }
}
