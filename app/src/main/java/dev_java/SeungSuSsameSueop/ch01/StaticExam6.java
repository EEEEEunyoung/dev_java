package dev_java.SeungSuSsameSueop.ch01;

import java.util.Scanner;

public class StaticExam6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("0부터 9 사이의 숫자를 입력하세요.");
    String user = scanner.nextLine();
    System.out.println("      사용자가 입력한 숫자는 " + user + "입니다.");
    System.out.println(user + 1);

  }

}
