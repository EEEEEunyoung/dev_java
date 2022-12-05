package dev_java.P1;

public class Quiz3_1 {
  // 1부터 100까지 세면서 5의 배수이면 fizz를 출력하고
  // 7의 배수이면 buzz를 출력하고
  // 5와 7의 공배수이면 fizzbuzz를 출력하고
  // 나머지는 숫자를 출력하는 프로그램을 작성하시오.

  public static void main(String[] args) {
    for (int i = 1; i < 101; i++) {
      if (i % 35 == 0)
        System.out.println("fizzbuzz");
      else if (i % 5 == 0)
        System.out.println("fizz");
      else if (i % 7 == 0)
        System.out.println("buzz");
      else
        System.out.println(i);
    }
  }
}