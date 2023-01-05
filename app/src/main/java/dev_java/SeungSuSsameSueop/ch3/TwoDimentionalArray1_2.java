package dev_java.SeungSuSsameSueop.ch3;
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

public class TwoDimentionalArray1_2 {
  public static void main(String[] args) {
    int arr[][] = new int[3][3];
    arr[0] = new int[] { 1, 2, 3 };
    // int arr1[0] = new int[3];
    arr[1] = new int[] { 4, 5, 6 };
    // int arr2[1] = new int[3];
    arr[2] = new int[] { 7, 8, 9 };
    // int arr3[2] = new int[3];
    System.out.println(arr[1][1]); // 5
    System.out.println(arr[1][2]);

    int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    System.out.println(arr2[1][1]); // 5
    System.out.println(arr2[1][2]); // 6

    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; i < arr2[i].length; j++) {
        arr2[i][j] = 10;
        System.out.println(arr2[1][1]); // 10

      }
    }

  }// main

}// class
