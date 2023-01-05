package dev_java.SeungSuSsameSueop.ch3;
//2차배열 ->  List<Map<>> 제네릭 -> 웹개발, 앱개발(하이브리앱) - Json

import javax.swing.event.SwingPropertyChangeSupport;

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

public class TwoDimentionalArray3_2 {
  public static void main(String[] args) {
    int score[][] = {
        { 80, 75, 70 },
        { 90, 85, 95 },
        { 65, 60, 60 }
    };
    // 국 영 수
    int KTotal = 0, MTotal = 0, ETotal = 0;

    System.out.println(" 이름   총점   평균  석차");
    System.out.println("============================");

    for (int i = 0; i < score.length; i++) {
      int sum = 0;
      Float avg = 0.0f;
      int grd = 0;

      KTotal += score[i][0];
      MTotal += score[i][1];
      ETotal += score[i][2];
      System.out.printf("%3d", i + 1);

      for (int j = 0; j < score[i].length; i++) {
        sum += score[i][j];
        System.out.printf("%3d", score[i][j]);

      }

      avg = sum / (float) score[i].length;
      System.out.printf("%3 %3.1fn", sum, avg);

    }
    System.out.println("============================");
    System.out.printf("총점 : %3d %2d %2d%n", KTotal, MTotal, ETotal);

    /*
     * for (int j = 0; j < score[i].length; j++) {
     * sum += score[i][j];
     * System.out.printf("%2", score[i][j]);
     * }
     * avg = sum / 3;
     * System.out.printf("%2d %2.1f%n", sum, avg);
     */

  } // main

}// class