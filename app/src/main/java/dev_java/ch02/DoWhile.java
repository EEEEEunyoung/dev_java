package dev_java.ch02;

public class DoWhile {
  public static void main(String[] args) {
    int i = 1;
    // 조건을 수렴하지 않으면 단 한번도 실행기회가 없다.
    while (i > 3) { // 1>3 => 아니 => false
      System.out.println("while실행문 출력됨");
    }
    System.out.println("요기");
    // 굳이 i 값을 1로 초기화 한 것은 동일한 조건에서 테스트하기 위함임
    i = 1;
    do { // 조건을 나중에 따진다. - 무조건 한번은 실행이 됨
      System.out.println("do..while 실행문 출력됨");
    } while (i > 3);
  }

}
