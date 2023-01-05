package dev_java.EunYoung.P1.Quizs;

//   12월  5일  숙제 - 피보나치 수열의 규칙을 만족하는 프로그램을 작성하고, 
//  a1에서  a10번째 항까지 출력되도록 해보시오. 
public class Fibonacci_Deb5_hw {
  public static void main(String[] args) {

    int num1 = 1;
    int num2 = 1;
    int num3 = 0;
    System.out.print(num1 + "," + num2);

    for (int i = 0; i < 8; i++) {
      num3 = num1 + num2;
      System.out.print("," + num3);

      num1 = num2;
      num2 = num3;

    }
  }
}