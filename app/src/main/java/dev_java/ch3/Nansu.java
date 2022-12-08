package dev_java.ch3;

import java.util.Scanner;

public class Nansu {
  int com = -1;
  Scanner s = null;// 장치로부터 듣기 - 소통 - 매번 새로 받아옴 - 반복문안에 올것
  Scanner s2 = null;

  public void ranCom() {
    com = (int) (Math.random() * 10);// 10을 곱하는 이유는 구간을 늘리기 위함
  }

  // user변수때문에 변수 my를 삭제하였다.
  // 사용자가 입력한 값을 지변에 담아야 하는 이유에 대해 설명하시오.
  // ==> 게임이 진행되는 동안에 계속 바뀌어야 하니까
  // 또 com변수는 왜 전역변수 이어야만 하는지에 대해서도 말해보시오.
  // ==> 정답을 맞출 때까지는 값이 유지되어야 하니까
  public String 판정하기(int user) {
    String msg = null;
    // 정답보다 입력한 값이 작니?
    if (com > user) {
      msg = "높여라";
    }
    // 정답보다 입력한 값이 크니?
    else if (com < user) {
      msg = "낮춰라";
    } else if (com == user) {
      msg = "정답";
      // return msg;if문에서 해당메소드를 탈출할 때 return예약어 사용가능함
      // 반복문에서는 break문 사용한다.
    }
    return msg;
    // return null;
  }

  public void result_com() {
    s = new Scanner(System.in);
    s2 = new Scanner(System.in);
    System.out.println("컴터가 채번한 숫자는 ===> " + com);// 전변이다. 그리니까 인스턴스변수. 유지
    int i = 1;// 회차 표시함
    String 입력값 = null;
    String 반환값 = null;
    while (i <= 5) {// 주의사항 - 무한루프 방지코드를 작성할 것. - break;
      System.out.print("0부터 9사이의 숫자를 입력하세요 \n");
      입력값 = s.nextLine();
      int user = Integer.parseInt(입력값);
      반환값 = 판정하기(user);
      System.out.println(반환값);
      if (i == 4) {
        System.out.println("3번안에 맞추지 못했습니다.");
        System.out.println("게임을 다시 시작하시겠습니까?(Y/N)");
        String reply = s.nextLine();
        if (reply.equals("Y") || reply.equals("y")) {
          i = 0;
          ranCom();
          result_com();
        } else {
          System.out.println("게임을 종료합니다.");
          s.close();// Stream, I/O, network, 사용 후 반드시 닫는다.
          s2.close();
          break;
        }
      }
      if ("정답".equals(반환값)) {
        // 정답을 맞추었을 경우 축하합니다. 라고 말한 뒤
        // 새 게임 진행 여부를 물어보시오.
        System.out.println("축하합니다.");
        System.out.println("게임을 다시 시작하시겠습니까?(Y/N)");
        String reply = s.nextLine();
        if (reply.equals("Y") || reply.equals("y")) {
          i = 0;
          ranCom();
          result_com();
        } else {
          System.out.println("게임을 종료합니다.");
          s.close();// Stream, I/O, network, 사용 후 반드시 닫는다.
          s2.close();
          break;
        }
        // 시도 할 때 마다 몇번째 기회를 사용하는지 출력하시오.
        System.out.println(user + " : " + 반환값);
      }
      i++;
    }
    s.close();// Stream, I/O, network, 사용 후 반드시 닫는다.
    s2.close();
    System.out.println("3번안에 맞추지 못했습니다.");
  }

  public static void main(String[] args) {
    Nansu n = new Nansu();
    n.ranCom();
    n.result_com();
  } // end of while
}
