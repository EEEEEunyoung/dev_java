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

public class TwoDimentionalArray3_3 {
  String[] subject = { "JAVA", "ORACLE", "SPRING" };
  String[][] data = {
      { "이순신", "80", "75", "70" }, { "강감찬", "90", "85", "95" }, { "김춘추", "65", "60", "60" }
  };

  void namePrint() {
    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i][0]);
    }
  }

  // 자바 점수의 합은?
  void javaTot() {
    int javaHap = 0;
    for (int i = 0; i < data.length; i++) {
      javaHap += Integer.parseInt(data[i][1]);
    }
    System.out.println("자바 총점은 ? " + javaHap);
  }

  void allTot() {
    int javaHap = 0;
    for (int i = 0; i < data.length; i++) {
      javaHap += Integer.parseInt(data[i][1]);
    }
    System.out.println("자바 총점은 ? " + javaHap);
    int oracleHap = 0;
    for (int i = 0; i < data.length; i++) {
      oracleHap += Integer.parseInt(data[i][2]);
    }
    System.out.println("오라클 총점은 ? " + oracleHap);
    int springHap = 0;
    for (int i = 0; i < data.length; i++) {
      springHap += Integer.parseInt(data[i][2]);
    }
    System.out.println("스프링 총점은 ? " + springHap);
  }

  public static void main(String[] args) {
    TwoDimentionalArray3_3 gd = new TwoDimentionalArray3_3();
    // gd.namePrint();
    // gd.javaTot();
    gd.allTot();
  }
}