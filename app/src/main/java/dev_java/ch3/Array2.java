package dev_java.ch3;
/*
 * 배열의 장애
 * 같은 타입만 담을 수 있다
 * 중간에 끼워넣기 불가함
 * 원소의 갯수 고정 - 변경불가함
 * 
 */

import java.util.Arrays;

import org.checkerframework.checker.units.qual.A;

public class Array2 extends Object {
  // 이른 인스턴스화
  int i[] = new int[3];
  int j[] = new int[] { 1, 2, 3 };
  int x[] = { 1, 2, 3 };

  public static void main(String[] args) {
    Array2 a2 = new Array2();
    System.out.println(a2.x.toString());
    System.out.println(Arrays.toString(a2.i));
    System.out.println(Arrays.toString(a2.j));
    System.out.println(Arrays.toString(a2.x));

    for (int a = 0; a < a2.j.length; a++) {
      System.out.println(a2.j[a]);
    }
    for (int y : a2.x) {
      System.out.println(y);

    }

  }// end of main
}
