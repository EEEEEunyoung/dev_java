package dev_java.EunYoung.pppp;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
  public Server() {

    try {
      ServerSocket ss = new ServerSocket(5003);
      ss.bind(new InetSocketAddress("192.168.10.88", 5003));

      while (true) {
        System.out.println("Server ready.....");
      }

      byte[] ba = null;
      String msg = null;
      Socket s = ss.accept();
      InputStream is = s.getInputStream();
      InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
      System.out.println("입장!");
      int readByteCount = is.read(ba);
      msg = new String(ba, 0, readByteCount, "UTF-8");
      System.out.println(msg);

    } // TRY
    catch (UnknownHostException e) {
      ss.close();
    } // CATCH

  }
}
