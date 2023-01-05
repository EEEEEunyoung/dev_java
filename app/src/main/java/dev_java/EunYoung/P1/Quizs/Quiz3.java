package dev_java.EunYoung.P1.Quizs;

public class Quiz3 {
  // 1부터 100까지 세면서 5의 배수이면 fizz를 출력하고
  // 7의 배수이면 buzz를 출력하고
  // 5와 7의 공배수이면 fizzbuzz를 출력하고
  // 나머지는 숫자를 출력하는 프로그램을 작성하시오.

  public static void main(String[] args) {
    Quiz3 quiz3 = new Quiz3();

    int i = 1;
    while (i < 101) {
      String result = quiz3.example(i);
      if (result == null) {
        System.out.println(i + "의 결과 값은 : " + i);
      } else {
        System.out.println(i + "의 결과 값은 : " + result);
      }
      i++;
    }
  }

  String example(int i) {
    String answer = null;

    if (i % 7 == 0 && i % 5 == 0) {
      answer = "fizzbuzz";
    } else if (i % 5 == 0) {
      answer = "fizz";
    } else if (i % 7 == 0) {
      answer = "buzz";
    }

    return answer;
  }
}
