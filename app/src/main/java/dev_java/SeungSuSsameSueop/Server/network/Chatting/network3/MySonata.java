package dev_java.SeungSuSsameSueop.Server.network.Chatting.network3;

public class MySonata extends MyCar {

  MySonata() {
    System.out.println("MySonata 호출 성공");
  }

  @Override
  public void display() {
    System.out.println("나는 2023년형 소나타 입니다.");
  }

  public static void main(String[] args) {
    MySonata ms = new MySonata();
  }
}
