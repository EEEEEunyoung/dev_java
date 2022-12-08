package dev_java.P1;

//   12월  5일  숙제 - 피보나치 수열의 규칙을 만족하는 프로그램을 작성하고, 
//  a1에서  a10번째 항까지 출력되도록 해보시오. 
public class Fibonacci_Deb6 {
  public static void main(String[] args) {

    int a1 = 1;
    int a2 = 1;
    int a3 = 0;
    System.out.print(a1 + " " + a2);

    for (int i = 0; i < 8; i++) {
      a3 = a1 + a2;
      System.out.print(" " + a3);

      a1 = a2; // 두번째 수를 세번째 수로
      a2 = a3; // 현재의 수를 첫번째 수로

    }
  }
}