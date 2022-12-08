package dev_java.ch3;

import java.util.Arrays;

public class Array3 extends Object {

  public static void main(String[] args) {
    int[] i = { 1, 2, 3 };
    int[] j;
    j = i;
    int k[];

    k = new int[3];
    j = k; // 왜 에러인가? - 에러가 발생하지 않도록 위에 코드 추가하기

    // k = j;

    // insert here

    System.out.println(j[0]);
    System.out.println(j[1]);

    i[0] = 4;
    System.out.println(j[0]);
    System.out.println(j[1]);
    System.out.println(j[2]);

    System.out.println(Arrays.toString(j));
    System.out.println(j.length);
    String s1 = "안녕";
    String s2 = s1;

    System.out.println(s1);
    System.out.println(s2);

  }
}
