package dev_java.EunYoung.test1208;

public class Test1_1_scanner {

  public void count() {
  }

  public static void main(String[] args) {
    String s1 = new String("안녕"); // 타입은 같지만 서로 다른 객체이다.
    String s2 = new String("안녕");
    String s3 = "안녕";
    String s4 = "안녕";
    if (s1 == s2)
      System.out.println("주소번지가 같니?");
    if (s1.equals(s2))
      System.out.println("주소번지가 같니?");
    if (s3.equals(s4))
      System.out.println("주소번지가 같니?");
    if (s3.equals(s4))
      System.out.println("주소번지가 같니?");
  }

}

// 주소번지가 가리키는 값이 같은지 다른지 알고 싶어요. -> 함수 equals 사용하면 된다.
// String은 초기화 하는 방법이 두가지 - new 쓰는 법 과 안쓰는 법
