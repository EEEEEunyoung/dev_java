package dev_java.SeungSuSsameSueop.week3.tables;

import java.util.Vector;

public class Vector1 {
  public static void main(String[] args) {
    Vector v = new Vector(); // 배열과 비슷
    Vector<String> v2 = new Vector<>();
    v2.add("안녕");
    v2.add("2");
    Vector<Integer> v3 = new Vector<>();
    Vector<DeptVO> v4 = new Vector<>();// 3차배열 안쓴다.
    // v.add(1);
    v.add("안녕"); // v.get(0)
    v.add(1); // v.get(1)
    System.out.println(v.size());// 2
    System.out.println(v.get(0));// 1
    String cnt = (String) v.get(0); // 타입이 안맞음. 강제형변환(String) 붙여야함 / 그치만 잘 안함
    String insa = v2.get(0);
    System.out.println(insa);
    String insa2 = v2.get(0);
    System.out.println(insa2);
    if (v.get(1) instanceof Integer) {
      System.out.println("넌 정수형이야");
    }
    if (v.get(0) instanceof String) {
      System.out.println("넌 문자열이야");
    }

  }

}
