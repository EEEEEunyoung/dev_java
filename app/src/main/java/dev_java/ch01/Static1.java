package dev_java.ch01;

public class Static1 {
  static {
    System.out.println("static 블록호출"); // static 블록은 메인보다 먼저 호출된다.(mian 매소드보다 우선순위가 높다)
  }

  // main 스레드 라고 한다.
  // main은 entry point 이다.
  // main은 개발자가 호출하는 메소드가 아니다.
  // 시스템이 자동으로 호출해준다. - 콜백메소드
  // main메소드에 코딩하는 것은 좋지 않다. - 초보다
  // main메소드에 작성한 코드는 재사용성이 없다.
  // 클래스 안에 메인메소드는 없어도 된다. - 단, 그러면 실행은 불가함
  public static void main(String[] args) {
    System.out.println("main 메소드");
  }
}
