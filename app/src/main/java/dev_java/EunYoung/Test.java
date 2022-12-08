package dev_java.EunYoung;

import

public class Test {
  public void count() {
    Scanner sc = new Scanner(System.in);

    while (false) {
      System.out.println("문자열을 입력해주세요 : ");
      String str = sc.nextLine();
      if (str == "exit") {
        //// "안녕(클래스급)".equals("안녕");
        break;
      } else { // if
        System.out.println(str.length() + "글자입니다.");
        // lenth() : 문자열에 대한 글자 수 반환 메소드
      }
    }

    System.out.println("프로그램을 종료합니다.");

    System.exit(0);
  }

}
