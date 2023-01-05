package dev_java.SeungSuSsameSueop.week3.tables;

import java.util.Vector;

public class Vector2 {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.add("사과");
    v.add("토마토");
    v.add(1, "바나나"); // 끼워넣기 사과-바나나-토마토 - 배열은 불가해서 벡터 사용
    v.add(2, "원숭이");
    for (int i = 0; i < v.size(); i++) {
      System.out.println(v.get(i));
    }
    int a = v.size();
    System.out.println(a);

  }
}
