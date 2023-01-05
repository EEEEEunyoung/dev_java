package dev_java.SeungSuSsameSueop.week3.tables;

import java.util.Random;

/*  0 부터 9사이의 임의의 수를 100개를 채번하여 한 줄에 10개씩
출력하고 그 숫자의 빈도수를 계산하여 출력하시오
원본 : 0 1 2 3 4 5 6 7 8 9
2 5 6 8 7 8 9 0 1 1
5
3
3
7
9
2
0 4 5 6 6 7 8 8 9 9
숫자 : 0 1 2 3 4 5 6 7 8 9
갯수 : 10 9 18 11 7 9 15 14 7 5 */
public class P3 {
  public static void main(String[] args) {

    int arr[][] = new int[10][10];

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        arr[i][j] = (int) (Math.random() * 10);
        System.out.print(arr[i][j] + " ");

      }
      System.out.println();
    }

  }
}
