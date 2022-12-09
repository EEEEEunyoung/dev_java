package dev_java.ch3;
//2차배열 ->  List<Map<>> 제네릭 -> 웹개발, 앱개발(하이브리앱) - Json

import javax.swing.event.SwingPropertyChangeSupport;

import org.checkerframework.checker.units.qual.K;

/*선언
데이터타입 배열참조변수[ ][ ];
데이터타입[ ] 배열참조변수[ ];
데이터타입[ ][ ] 배열참조변수;
*/

/*생성
 * 배열참조변수 = new 데이터타입[행길이][열길이]; //정변배열
배열참조변수 = new 데이터타입[행길이][ ]; //가변배열, 행만 선언
배열참조변수[행인덱스] = new 데이터타입[열길이]; //행에 대한 열 선언
 */

/*초기화
 * 
데이터타입 배열이름[ ][ ] = { {0행0열값, 0행1열값, … }, {1행0열값, 1행1열값, …}, … };
 */

public class TwoDimentionalArray1_3 {
  public static void main(String[] args) {
    int score[][] = { { 80, 75, 70 },
        { 90, 85, 95 },
        { 65, 60, 60 } };
    // 국 영 수

    System.out.println(" 이름   총점   평균  석차");

    for (int i = 0; i < score.length; i++) {
      int sum = 0;
      sum = score[0][0] + score[0][1] + score[0][2];
      int sum2 = 0;
      sum2 = score[1][0] + score[1][1] + score[1][2];
      int sum3 = 0;
      sum3 = score[2][0] + score[2][1] + score[2][2];

      int avg = 0;
      avg = sum / 3;
      int avg1 = 0;
      avg1 = sum2 / 3;
      int avg2 = 0;
      avg2 = sum3 / 3;

      int grd = 0;

      System.out.printf("이순신 : " + sum + "  ,  " + avg);
      System.out.println();
      System.out.printf("강감찬 : " + sum2 + "  ,  " + avg1);
      System.out.println();
      System.out.printf("김춘추 : " + sum3 + "  ,  " + avg2);
      System.out.println();

      /*
       * for (int j = 0; j < score[i].length; j++) {
       * sum += score[i][j];
       * System.out.printf("%2", score[i][j]);
       * }
       * avg = sum / 3;
       * System.out.printf("%2d %2.1f%n", sum, avg);
       */
    }

  } // main

} // class
