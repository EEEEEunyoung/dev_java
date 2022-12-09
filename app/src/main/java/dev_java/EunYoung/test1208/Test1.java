package dev_java.EunYoung.test1208;

import java.util.Scanner;

public class Test1 {
  public void count() {
    System.out.println("count 호출"); // 로그에 출력할 값
    Scanner sc = new Scanner(System.in);
    boolean isOK = false;

    while (!isOK) {
      System.out.print("문자열을 입력해주세요:");
      String str = sc.nextLine();
      if (str.equals("exit")) {
        //// "안녕(클래스급)".equals("안녕");
        break;
      } else { // if
        System.out.println(str.length() + "글자입니다.");
        // lenth() : 문자열에 대한 글자 수 반환 메소드
      }
    } // while
    sc.close();
    System.out.println("프로그램을 종료합니다.");
  } // count()

  public static void main(String[] args) {
    Test1 t = new Test1();
    t.count();

    System.exit(0);
  }

}