package dev_java.ch01;

//java.lang패키지 외 클래스들은 모두 import문을 추가해야함 - 하지 않으면 컴파일 에러 - .class생성안됨
//클래스의 구성요소 2가지 - 함수형 프로그래밍 처리 방법 - 람다식 지원 - 일급함수 - 일급객체 ,  필드의 다른말은 변수
//필드+메소드 => 클래스 정의
//클래스를 인스턴스화 하면 
//클래스를 인스턴스화 하는 이유는 변수와 메소드를 호출하기 위해서이다.
//인스턴스화.메소드명();
//인스턴스화.메소드명(int i);
//인스턴스화.메소드명(int i, double d, .etc) ;
//인스턴스화.전연변수(원시형+참조형 모두 가능);
import java.util.Scanner;

public class ScannerExam1 {
  public static void main(String[] args) {
    System.out.println("o부터 0사이의 숫자를 입력하세요.");
    // 생성자이든 메소드이든 파라미터의 갯수 혹은 타입은 반드시 지켜야 함.
    Scanner scanner = new Scanner(System.in); // 생성부의 파라미터 자리는 시스템의 입력장치정보
    String user = scanner.nextLine();
    scanner.close();
    // wrapper
    int i_user = integer.parseInt(user);
    System.out.println(user + 1);
    System.out.println(i_user + 1);
  }
}
