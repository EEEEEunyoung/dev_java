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
    Random random = new Random();
    Scanner s = new Scanner(System.in);
    int com = random.nextInt(10);
    int my = -1;
    while (true) {
      System.out.println("0부터 9 사이의 정수를 입력하세요");
      my = s.nextInt();
      System.out.println("사용자가 입력한 값 : " + my);
      if (com == my) {
        System.out.println("축하합니다");
        break;
      } else if (com > my) { // 컴퓨터가 채번한 숫자가 사용자가 입력한 값보다 크니?
        System.out.println("높여라");
      } else if (com < my) {
        System.out.println("낮춰라");
      } else if (my == 10) {
        s.close();
        System.exit(0);
      }

    }
  }
}
