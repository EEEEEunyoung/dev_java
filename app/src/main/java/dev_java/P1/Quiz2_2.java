package dev_java.P1;

import java.io.ObjectInputFilter.Status;
import java.util.Random;
/*0부터 9사이의 임의의 수를 채번하고, 그 숫자를 맞추는 게임을 구현하시오
기회는 단 5번 
java.util.Random
Random r = new Random();
 *    힌트는 낮춰라,   높여라
 * 맞으면 축하합니다.
 */
import java.util.Scanner;

public class Quiz2_2 {
  public static void main(String[] args) {
    // 랜덤하게 패번하는 매소드를 제공하는 클래스 선언 및 생성하기
    Random random = new Random(); // new 다음에 오는 이름의 객체가 로딩 -> 생성자 호출도 일어남
    // Scanner 클래스를 사용하면 입력장치로 입력된 정보를 받아 올 수 있다. - 듣기
    // 생성자의 파라미터에 입력장치에 대한 코드가 필요함
    // System - 내가 사용하는 컴터의 장치
    // 그 뒤에 변수 in을 붙이면 입력장치를 나타냄
    // 사용자로부터 입력받는 장치를 생성자 파라미터에 적어준다.
    Scanner s = new Scanner(System.in);
    // nextInt메소드는 Scanner 클래스가 소유주이다.
    int com = random.nextInt(10);
    int my = -1;
    // 회차를 카운트하는 변수 선언하기
    // 언제 카운트를 증가 시킬 것인가? - 힌트를 줄 때 증가 시킨다.
    int cnt = 1;
    // boolean isOK = true; while(isOK)
    while (true) { // 무한루프에 빠지는 코드
      // 사용자에게 입력받아야하는 유효한 값에 범위를 출력하기
      System.out.println("0부터 9 사이의 정수를 입력하세요");
      // Scanner 클래스가 소유한 nextInt메소드 호출하기
      // nextInt():int 이다.
      my = s.nextInt();
      if (cnt == 5) {
        System.exit(0); // 파라미터에 0을 주면 자바가상머신과의 연결고리 끊긴다 - 종료 - 할당 스레드 반환이 됨
      }
      System.out.println("사용자가 입력한 값 : " + my);
      // 컴퓨터가 채번한 값과 사용자가 입력한 값이 같니?
      if (com == my) { // 맞다 - 변수가 가리키는 값이 같은지를 비교하는 것임 - 원시형 변수이다. - 직접접근방식
        System.out.println("축하합니다");
        System.out.println(cnt);
        s.close(); // 사용한 스캐너의 주소번지는 반드시 닫아준다. - 왜냐하면 위변조를 막기 위해서
        break;
      } else if (com > my) { // 컴퓨터가 채번한 숫자가 사용자가 입력한 값보다 크니?
        System.out.println("높여라");
        System.out.println(cnt++);
      } else if (com < my) {
        System.out.println("낮춰라");
        System.out.println(cnt++);

      } else if (my == 10) {
        s.close();
        System.exit(0);
      }

    }
  }
}
