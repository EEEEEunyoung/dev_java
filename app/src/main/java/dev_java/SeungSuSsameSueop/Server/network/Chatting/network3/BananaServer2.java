package dev_java.SeungSuSsameSueop.Server.network.Chatting.network3;

import javax.swing.JFrame;

public class BananaServer2 extends JFrame {
  // 생성자
  BananaServer2() {
    initDisplay();
  }

  BananaServer2(String title) {
    super(title); // 이코드가 this.setTitle()역할을 대신함
    initDisplay();

    // 아래서 this는 바나나서버를 가리키는 것임
    // this(title); 자기자신을 호출하는 것이므로 에러임
  }

  // this는 클래스 쪼개기 즉 화면과 로직의 분리 또는 하나의 클래스를 여러개의 클래스로
  // 나누어 (분업) 처리할 때 만 필요함. - this(), this("안녕") - 실무에서 사용할 일이 없다.

  public void initDisplay() {
    this.setVisible(true);
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);

  }

  public static void main(String[] args) {
    // 파라미터 생성자로 title추가했을 때 이 정보를 initDisplay에서
    // setTitle에 사용하고 싶다 어떡하지?
    new BananaServer("생성자 파라미터로 제목으로 결정함 - 초기화");
  }

}

/*
 * 관전포인트
 * InitDisplay를 메인 메소드에서 호출하는 것과 생성자 안에서 호출하는 것이 가능하다.
 * 그렇다면 둘의 차이는 있나? 혹은 없나?
 */
