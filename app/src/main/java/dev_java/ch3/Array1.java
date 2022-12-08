package dev_java.ch3;

import java.util.concurrent.Flow.Subscription;

public class Array1 extends Object { // 상속 -확장, 재사용(오버라이딩) Class - Object
  public static void main(String[] args) {
    // 선언과 생성을 나누어 할 수 있따.
    // 이른 주입인가 아니면 게으른 주입인가
    // 게으른 인스턴스화는 선언과 생성을 분리함
    // 이른 인스턴스화는 선언부에 선언과 생성을 한번(한문장)에 작성함
    int i[];
    // int[] j = new int[3];
    i = new int[3];
    // 초기화 없다. 아직... 0 0 0
    // 객체배열이면, null, null, null 상태
    System.out.println(i[0]);
    int x = 3;
    boolean isOK = false;
    try {
      // 문법에러는 Exception 과는 상관없다. - 런타임에러
      // 예외가 발생할 가능성이 있는 코드를 감싼다.

      System.out.println(i[x]); // 문법에러

      System.out.println(i[1]);

      System.out.println(i[2]);

      System.out.println(i[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("인덱스가 범위를 넘었다");
    }

    System.out.println("여기");

  }
}
