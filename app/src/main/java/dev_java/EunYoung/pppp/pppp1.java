package dev_java.EunYoung.pppp;

//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하시오.(출처 : 이것이 자바다 p133 3번 문제)

public class pppp1 {

  public static void main(String[] args) {
    int sum = 0;

    for (int i = 0; i <= 100; i++) {
      if (i % 3 == 0) {
        sum = sum + i;
      } // if
    } // for
    System.out.println("3의 배수의 합 : " + sum);

  }

}
