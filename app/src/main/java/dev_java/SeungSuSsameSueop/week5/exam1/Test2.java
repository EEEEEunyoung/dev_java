package dev_java.SeungSuSsameSueop.week5.exam1;

public class Test2 {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.println("첫번째 숫자 입력");
    int num1 = sc.nextInt();

    System.out.println("두번째 숫자 입력");

    int num2 = sc.nextInt();
    try {
      System.out.println("두 수의 나눗셈 결과 : " + num1 / num2);

    } catch (ArithmeticException e) {
      System.out.println("부적절한 나눗셈을 시도하였습니다");
    }

  }
}
