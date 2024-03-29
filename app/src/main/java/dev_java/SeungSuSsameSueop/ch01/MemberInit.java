package dev_java.SeungSuSsameSueop.ch01;

public class MemberInit {
  int i;
  int hap;

  // 디폴트 생성자라고 부른다. - 디폴트 생성자는 파라미터를 결정해줄 필요 없으니 생략하면
  // JVM이 대신 생성해 주어 전변들을 초기화
  public MemberInit() {
    System.out.println("디폴트생성자 호출 성공" + i + "," + hap);
  }

  public MemberInit(int i, int hap) {
    this.i = i;
    this.hap = hap;
    System.out.println("파라미터가 두개인 생성자 호출 성공" + this.i + "," + this.hap);

  }

  public static void main(String[] args) {
    MemberInit mi = new MemberInit(); // 8번 생성자 호출임 - 메소드 오버로딩 메커니즘을 따른다.
    MemberInit mi2 = new MemberInit(1, 0);
  }
}
