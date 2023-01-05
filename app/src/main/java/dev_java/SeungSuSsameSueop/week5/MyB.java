package dev_java.SeungSuSsameSueop.week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//List - java.util.List(Interface) - ArrayList, Vector 
//결론 - 그래서 (그런이유로)m메소드가 m2메소드보다 더 활용도가 넓다.
public class MyB {
  // 메소드의 파라미터로 인터페이스를 사용하는 경우

  void m(List<String> myNames) {
    System.out.println("===============[[List<String>]]===============");
    for (String s : myNames) {
      System.out.println(s);
    }
  }

  // 메소드의 파라미터로 구현체 클래스를 사용하는 경우
  void m2(Vector<String> myNames) {
    System.out.println("===============[[Vector<String>]]===============");
    for (String s : myNames) {
      System.out.println(s);
    }

  }

  public static void main(String[] args) {
    MyB myB = new MyB();
    List<String> nickNames3 = new Vector<>();
    nickNames3.add("사자");
    nickNames3.add("호랑이");
    nickNames3.add("표범");
    ArrayList<String> nickNames = new ArrayList<>();
    nickNames.add("토마토");
    nickNames.add("키위");
    nickNames.add("사과");
    Vector<String> nickNames2 = new Vector<>();
    nickNames2.add("바나나");
    nickNames2.add("포도");
    nickNames2.add("딸기");

    myB.m(nickNames);
    // 왜 11번인가? 왜 18번은 안되는걸까요? 범위(scope)가 작으니까
    myB.m(nickNames3);// 11이 호출됨 - 합법
    // myB.m2(nickNames); //벡
    myB.m(nickNames2);
    myB.m2(nickNames2);

  }
}
