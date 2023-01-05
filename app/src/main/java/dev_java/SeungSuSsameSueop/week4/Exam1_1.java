package dev_java.SeungSuSsameSueop.week4;

import java.util.Arrays;

public class Exam1_1 {
  String[] sArr = new String[] { "사과", "딸기", "오렌지" };
  String[] fruit;

  public Exam1_1() {

  }

  public Exam1_1(String[] args) { // 파라미터에 1차 배열을 넣으면...
    fruit = sArr;
    fruit[1] = "키위";
    System.out.println(sArr[0]);
    System.out.println(sArr[1]);
    System.out.println(sArr[2]);
    System.out.println(fruit);
    System.out.println(sArr);
    System.out.println(Arrays.toString(fruit));
    System.out.println(Arrays.toString(sArr));

  }

  public static void main(String[] args) {
    new Exam1_1();
  }

}
