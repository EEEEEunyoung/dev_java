package dev_java.ch3;

public class FinalVariable {
  static void methodA() {
    int i = 5;
    i = 7;

    final double PIE = 3.14;
    System.out.println(PIE);
    // PIE = 5.45; final 해놓으면 재할당 불가

  }

  public static void main(String[] args) {
    FinalVariable.methodA();

  }

}
