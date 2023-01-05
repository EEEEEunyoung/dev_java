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

public class TwoDimentionalArray3_4 {
  String[] subject = { "JAVA", "ORACLE", "SPRING" };

  String[][] data = {
      { "이순신", "80", "75", "70" }, { "강감찬", "90", "85", "95" }, { "김춘추", "65", "60", "60" }
  };

  // 총점
  void sum(String[][] data, String[] subject) {

    int sum = 0;
    int sum2 = 0;
    System.out.println("=====================총점========================");
    for (int i = 0; i < data.length; i++) {
      sum2 = 0;
      for (int j = 1; j < data[i].length; j++) {
        sum += Integer.parseInt(data[i][j]);
        sum2 += Integer.parseInt(data[i][j]);

      }
      System.out.println(subject[i] + " 과목의 총점은 : " + sum2 + "입니다.");
    }

    System.out.println("전체 총점은 : " + sum);
  }

  // 평균
  void average(String[][] data, String[] subject) {
    System.out.println("=====================학생 평균========================");
    for (int i = 0; i < data.length; i++) {
      int average = 0;
      int sum = 0;

      for (int j = 1; j < data[i].length; j++) {
        sum += Integer.parseInt(data[i][j]);
      }

      average = sum / (data[i].length - 1);

      System.out.println(data[i][0] + " 학생의 평균은 : " + average);

    }
    System.out.println("=====================과목 평균========================");
    for (int j = 1; j < data[0].length; j++) {
      int average = 0;
      int sum = 0;
      for (int i = 0; i < data.length; i++) {
        sum += Integer.parseInt(data[i][j]);
      }
      average = sum / (data[j - 1].length - 1);
      System.out.println(subject[j - 1] + " 과목의 평균은 : " + average);
    }
  }

  // 석차
  void rank(String[][] data, String[] subject) {
    System.out.println("=====================석차========================");
    int rank[] = new int[3];

    for (int i = 0; i < data.length; i++) {
      int average = 0;
      int sum = 0;

      for (int j = 1; j < data[i].length; j++) {
        sum += Integer.parseInt(data[i][j]);
      }
      rank[i] = sum;
    }

    for (int i = 0; i < rank.length; i++) {
      int cnt = 1;
      for (int j = 0; j < rank.length; j++) {
        if (rank[i] > rank[j]) {
          cnt++;
        }
      }
      System.out.println(data[i][0] + " 학생의 평균 석차는 : " + cnt + "등 입니다.");
    }

  }

  public static void main(String[] args) {

    TwoDimentionalArray3_4 arr = new TwoDimentionalArray3_4();
    // arr.sum(arr.data, arr.subject);
    arr.average(arr.data, arr.subject);
    arr.rank(arr.data, arr.subject);
  }
}