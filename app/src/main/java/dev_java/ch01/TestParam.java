package dev_java.ch01;

class Param {
  int ival; // 0->100->500
}

public class TestParam {
  void effectParam(Param p) {// p는 @abcd1234
    // insert here - 여기에 p = new Param()이 있으면 결과가 달라진다 아니다 같다?????
    p = new Param();  //<- 여기가 주석으로 막혀있으면, 원본(17번)을 참조하므로, 원본을 500으로 덮어쓰기, 초기화, 
    p.ival = 500; 
    System.out.println("sub ival ===> " + p.ival);
  }

  public static void main(String[] args) {
    TestParam tp = new TestParam(); //
    Param p = new Param();
    p.ival = 100;
    tp.effectParam(p); // 주소번지 @abcd1234를 넘긴다.  -> 주석으로 바꾸면 sub ival 호출 안된ㄴ
    System.out.println("main ival ===> " + p.ival);

  }
}
