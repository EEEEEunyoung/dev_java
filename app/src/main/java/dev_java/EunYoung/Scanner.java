package dev_java.EunYoung;

import java.util.Scanner;

public class Scanner {
  public static void main(String[] args) {
    int age;
    char a;
    String namew;
    String name;

    Scanner scanner = new Scanner(System.in);
    System.out.println("당신의 나이는 몇 살 입니까?");

    age = scanner.nextInt();
    a = scanner.next().charAt(0);
    name = scanner.nextLine();
    name = scanner.nextLine();

    System.out.println("저의 나이는" + age + "살 입니다.");
    System.out.println("저의 혈액형은" + a + "형 입니다.");
    System.out.println("저의 이름은" + name + "입니다.");
  }

  public String nextLine() {
    return null;
  }
}