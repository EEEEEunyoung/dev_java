package dev_java.ch3;
//2차배열 ->  List<Map<>> 제네릭 -> 웹개발, 앱개발(하이브리앱) - Json

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

public class TwoDimentionalArray1_1 {
  void toWhile(int[][] arr) {
    System.out.println(":while 문");
    int i = 0, j = 0;
    while (i < arr.length) {
      while (j < arr[i].length) {
        j++;
      } // 중첩while
      i++;
    } // while
  }

  public static void main(String[] args) {
    int arr[][] = new int[2][3];
    TwoDimentionalArray1_1 ta1 = new TwoDimentionalArray1_1();
    ta1.toWhile(arr);
    for (int i = 0; i < arr.length; i++) {// 로우
      for (int j = 0; j < arr[i].length; j++) {// 컬럼
        System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);

      } // 중첩 for

    } // for
  }// main

}// class
