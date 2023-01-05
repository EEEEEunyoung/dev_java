package dev_java.SeungSuSsameSueop.week6;

class Sup {
  void go() {
    System.out.println("Sup go 호출");

  }

  void stop() {
    System.out.println("Sub stop호출");
  }
}

class Sub extends Sup {
  Sub() {
    super.stop();
    // 현재 활성화 되어있는....
    this.stop();
  }

  @Override
  void stop() {
    System.out.println("Sub stop호출");

  }

}

public class SuperMain {
  public static void main(String[] args) {
    Sup sup = new Sup();
    // sup.stop();
    Sub sub = new Sub();
    // sub.go();
    sup = sub;
    // sup=new Sub();
    // 이럴때 부모가 가진 stop메소드는 은닉 메소드라고 한다. shadow method라고 함
    sup.stop();
    // this나 super예약어는 static이 있는 메소드 영역에서 사용불가함
    // super.stop();
    // sub.stop();

  }
}
