package dev_java.ch01;

public class String1 {
  public static void main(String[] arg) {
    String s1 = "안녕";
    String s2 = "안녕";
    // 주소번지가 가리키는 값을 비교하려면 equals 라는 메소드를 찾아볼 것
    String s3 = new String("안녕");
    String s4 = new String("안녕");
    // insert here
    // s1과 s2의 주소번지는 같니? 참 혹은 거짓 선택하기
    // 그리고 이유에 대해 옆사람과 토의해보세요
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1 == s4);
    System.out.println(s2 == s3);
    System.out.println(s2 == s4);
    // s3과 s4의 주소번지가 같니? 다르니? 선택한 후 결과에 대해 말해보세요.
    System.out.println(s3 == s4);

    // 만일 s3이 가리키는 문자열이 s4와 같은지를 비교하려면 어떡하지? 구글링 해서 확인해보기
    System.out.println(s1 == s2);
    System.out.println(s3.equals(s4));

  }
}
