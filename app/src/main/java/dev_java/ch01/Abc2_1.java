package dev_java.ch01;

public class Abc2_1 {

  public static void main(String[] args) {
    int i = 1;
    switch (i) {
      case 0:
        ++i; // 실행문
      case 1:
        ++i; // 실행문
        // break; // 2
      default:
        ++i;
    } // end of switch
    // insert here - i는 얼마일까요?
    System.out.println(i);
  }
}

// 스위치문 - 조건문 if 문 <-> 스위치문 (더 직관적인 코드 작성 시 사용)
// break; 없으면 계속 진행