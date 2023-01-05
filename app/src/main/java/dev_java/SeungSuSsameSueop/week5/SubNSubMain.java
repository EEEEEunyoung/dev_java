package dev_java.SeungSuSsameSueop.week5;

class Sup {
  public void m() {
    System.out.println("Sup m()호출");
  }// m
}// als sup

class Sub extends Sup {
  Sub() {
    this.m();
  }

  @Override
  public void m() {
    System.out.println("Sub m()호출");
  }
}

public class SubNSubMain {
  public static void main(String[] args) {
    // insert here
    // 1. sub m() 호출
    Sub s = new Sub();
    // s.m();
    // 2. sup m() 호출
    Sup ss = new Sup();
    // ss.m();
    // 선언부(Sup)=생성부(Sub)
    // 3.다형성 이용 호출
    Sup sup = new Sub();
    s.m();
    int i = (int) 23.5d;
    System.out.println(i);

  }
}
