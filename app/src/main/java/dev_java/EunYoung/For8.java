package dev_java.EunYoung;

public class For8 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      for (int j = 1; j % 5 == 0; j++) {
        System.out.println(i + "5의 배수가 아닙니다.");
        System.out.println(j + "5의 배수입니다.");
      }
    }
  }

}
