package dev_java.SeungSuSsameSueop.week3;

class A {
  int i = 1;
  AMain aMain = null;

  public A(AMain aMain) {
    System.out.println("A(Amain aMain)호출 성공");
    this.aMain = aMain;
  }

  void methodB() {
    aMain.methodA();
  }
}

public class AMain {
  A a = new A(this);

  void methodA() {
    System.out.println("AMain methodA()호출");
  }

  public static void main(String[] args) {
    AMain aMain = new AMain();
    aMain.a.methodB();
  }
}
