package dev_java.week3.tables;

/*-10에서 10사이의 정수 10개를 랜덤하게 채번하여  음수와 양수의 합계를 구하는 프로그램을 작성하시오.
출력)
배열 : 9 -2 -3 8 0 -3 -8 -6 -2 0
음수합 : -24
양수합 : 17 */
public class P2 {

  public static void main(String[] args) {
    int a[] = new int[10];
    int positiveSum = 0;
    int negativeSum = 0;

    for (int i = 0; i < 10; i++) {
      a[i] = (int) (Math.random() * 21) - 10;
      System.out.print(a[i] + " ");
      if (a[i] > 0) {
        positiveSum += a[i];
      } else {
        negativeSum += a[i];
      }
    }
    System.out.println();
    System.out.println("음수합: " + negativeSum);
    System.out.println("양수합: " + positiveSum);

  }
}
