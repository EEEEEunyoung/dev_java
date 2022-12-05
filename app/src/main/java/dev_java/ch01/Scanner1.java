package dev_java.ch01;

import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("문자열을 입력하세요 : ");
      String str = scanner.nextLine();
      if (str == "exit") {
        break;
      } else {
        System.out.println(str.length() + "글자 입니다.");
      }
      System.out.println("  프로그램을 종료합니다.");
    }
  } // end of main
}
