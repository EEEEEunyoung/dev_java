package dev_java.SeungSuSsameSueop.ch3;

import javax.swing.event.SwingPropertyChangeSupport;

public class IntArray4 {
  void methodA() {
    for (int i = 0; i < 3; i++) {
      System.out.println(names[i]);
    }
  }

  int[] methodB() {
       int deptnos[] = { 10, 20, 30 };                 //지변을 메소드 밖에서 사용 가능함
       deptnos[0] = deptnos[0] - 1;
       deptnos[1] = deptnos[1] - 2;
       deptnos[2] = deptnos[2] - 3;
       return deptnos;                     //반환형이 있으면, 메소드 끝나기(우중괄호닫히기전) 직전에 리턴을 써야한다.   리턴할때는 배열기호를 쓰지 않는다. 
    }
// 배열 이름의 주소번지와 첫번째 방의 주소번호는 같다.
