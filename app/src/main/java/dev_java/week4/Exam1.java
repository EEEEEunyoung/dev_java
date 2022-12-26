package dev_java.week4;

/*
 * 자바에서는 같은 이름의 메소드를 중복 선언 가능하다. 
 * 메소드오버로딩(MethodOverloading)-이것과 관계 -생성자 컨셉
 * 무조건 파라미터의 갯수나 타입이 달라야 한다. 
 * 접근제한자가 있고 없고는 영향이 없다.
 * 리턴타입이 있고 없고는 영향이 없다.
 * 예외를 던지고 던지지않고는 영향이 없다. 
 * 파라미터의 변수이름이 다른 것은 영향이 없다. 
 * 
 * 
 * 메소드오버라이딩 -문제와 상관없음
 * 
 */
public class Exam1 {
  public void test() {
  }

  public void test(String str) {
  }

  public void test(int i) {
  }

  public void test(String s, Double a) {
  }

  public void test(char ch) {
  }

  public void test(String str, int i) {
  }

  public void test(int i, String str) {
  }

  private void test(Double a, String s) {
  }

  public int test(Double a) {
    return 0;
  }

}
