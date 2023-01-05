package dev_java.SeungSuSsameSueop.Server.network.Chatting.network3;

public abstract class MyCar {
  public abstract void display();

  private int wheelNum = 0; // 바퀴수

  public MyCar() {
    System.out.println("myCar() 호출");
  }

  public MyCar(int wheelNum) {
    System.out.println("나는 앞으로 간다");
    this.wheelNum = wheelNum;
  }

  public void go() {
    System.out.println("나는 앞으로 간다");

  }
}

// 생성자 파라미터는 지변성격이지만 전변을 결정 짓는다.