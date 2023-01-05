package dev_java.EunYoung.pppp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
  public Client() {
    try {
      Socket socket = new Socket("localhost", 5003);
      socket.connect(new InetSocketAddress("local host", 5003));

      byte[] ba = null;
      String msg = null;
      OutputStream os = socket.getOutputStream();
      msg = "hellow world";
      ba = msg.getBytes("UTF-8");
      os.write(ba);
      os.flush();
      System.out.println("성공");

      os.close();

    } catch (UnknownHostException e) {
    } catch (IOException ei) {
    }

  }
}
