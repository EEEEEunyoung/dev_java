package dev_java.SeungSuSsameSueop.week6;

public class T {
  ZipCodeSearch zcs = null;

  // 메소드를 통해서도 객체주입을 받을 수 있다. -싱글톤 패턴
  public ZipCodeSearch getInstance() {
    if (zcs == null) { // 조건부로
      zcs = new ZipCodeSearch();
    }
    return null;

  }

  public static void main(String[] args) {
    T t = new T();
    t.zcs = t.getInstance();
    t.zcs.getZipcode("역삼동");

  }

}
