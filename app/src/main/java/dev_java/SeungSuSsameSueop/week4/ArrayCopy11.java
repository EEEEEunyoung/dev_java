package dev_java.SeungSuSsameSueop.week4;

import java.util.Arrays;

public class ArrayCopy11 {
  public static void main(String[] args) {
    Exam1_1 aCopy1 = new Exam1_1();
    System.out.println(Arrays.toString(aCopy1.fruit));
    System.out.println(Arrays.toString(aCopy1.sArr));
    aCopy1.fruit = new String[] { "파인애플", "키위" };
    System.out.println(aCopy1.fruit);
    System.out.println(aCopy1.fruit[1]); // NullPointerException
  }
}
