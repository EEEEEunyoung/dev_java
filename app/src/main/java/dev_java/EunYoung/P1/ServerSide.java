package dev_java.EunYoung.P1;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try{
            ss = new ServerSocket();
            ss.bind(new InetSocketAddress("localhost", 5000));
            while(true){
                System.out.println("연결 대기중");
            Socket socket = ss.accept();

            byte[] bytes = null;
            String msg = null;
            
            InputStream is = socket.getInputStream();
            bytes = new byte[100];
            int readByteCount = is.read(bytes);
            msg = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("데이터 받기 성공" + msg);

            OutputStream os = socket.getOutputStream();
            msg = "Hello, Client!!";
            bytes = msg.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("데이터 보내기 성공");


            is.close();
            os.close();
            socket.close();
            }
        }  catch(Exception e){}
    if(!ss.isClosed()){
        try {
            ss.close();
        } catch (IOException e1) {}
        }
    }
}

