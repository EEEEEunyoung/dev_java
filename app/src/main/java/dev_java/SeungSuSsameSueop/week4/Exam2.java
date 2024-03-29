package dev_java.SeungSuSsameSueop.week4;

//1부터 사용자가 입력한 값까지의 합을 구하려고 한다. 
//0을 초과한 숫자를 입력해야하고 0이하의 숫자를 입력했을 시 
//"1이상의 숫자를 입력해달라"는 안내문구를 출력한다. 
//아래의 코드를 보고 문제점이 있는 곳을 찾아 [원인](15점)에 기술하고, 해결 방안을 [조치내용](15점)에 작성하여 보고서를 완성하시오. (30점)
import java.util.Scanner;

/*while */
public class Exam2 {
  public void sum() {
    Scanner sc = new Scanner(System.in);

    System.out.println("1이상의 숫자를 입력하세요 : ");
    int num = sc.nextInt();

    int sum = 0;
    if (num > 0) {
      int i = 1;
      while (i <= num) {
        sum += i;
        i++;

        if (i > num) {
          break;
        }
      }
      System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
    } else {
      System.out.println("숫자가 1이상이 아닙니다. ");

    }

  }

  public static void main(String[] args) {
    Exam2 e = new Exam2();
    e.sum();
  }
}
