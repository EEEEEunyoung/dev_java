package dev_java.SeungSuSsameSueop.Server.network.Chatting.network3;

import javax.swing.JFrame;

public class BananaServer extends JFrame {
  // 생성자
  BananaServer() {
    initDisplay();
  }

  BananaServer(String title) {
    super(title);
    initDisplay(title);

    // 아래서 this는 바나나서버를 가리키는 것임
    // this(title); 자기자신을 호출하는 것이므로 에러임
  }

  // this는 클래스 쪼개기 즉 화면과 로직의 분리 또는 하나의 클래스를 여러개의 클래스로
  // 나누어 (분업) 처리할 때 만 필요함. - this(), this("안녕") - 실무에서 사용할 일이 없다.

  public void initDisplay(String title) {
    this.setVisible(true);
    this.setTitle(title);
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);

  }

  public void initDisplay() {
    this.setVisible(true);
    this.setTitle("BananaTalk");
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);

  }

  public static void main(String[] args) {
    // 생성자 호출하기
    // new BananaServer();
    // 생성자 파라미터에는 this말고도 다른 타입을 사용가능함 - String
    new BananaServer("생성자 파라미터로 제목으로 결정함 - 초기화");
  }

}

/*
 * 관전포인트
 * InitDisplay를 메인 메소드에서 호출하는 것과 생성자 안에서 호출하는 것이 가능하다.
 * 그렇다면 둘의 차이는 있나? 혹은 없나?
 */
