package dev_java.pppp;

import java.security.DrbgParameters.NextBytes;

import dev_java.EunYoung.Scanner;

/*
* 0~10까지 임의의 난수 발생, 사용자가 추측하여 큰지, 작은지 안내 후 맞추면 프로그램 종료

*/
public class pppp6 {

  public static void main(String[] args) {
    int a = (int) Math.random() * 10 + 1;
    Scanner s = new Scanner(System.in);

    for (int i = 1; i <= 5; i++) {
      System.out.println("숫자추측하기");
      s.nextInt(System.in);

      int my;
      if (my > a) {
        System.out.println("높다");
        continue;
      } else if (my < a) {
        System.out.println("낮다");
        continue;
      }
      if (my == a) {
        System.out.println("정답");
        break;
      }
    }

  } // main

} // cls
