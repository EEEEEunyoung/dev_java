package dev_java.SeungSuSsameSueop.ch01;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Abc2_5 {

  public static void main(String[] args) {
    int i = 1;
    int j = 2;
    if ((i == 2) || (i > j)) {

      System.out.println("조건을 만족 할 때");
      System.out.println(i + ", " + j);

      // if ((i == --j) && (++i <= j)) {
    } else {
      System.out.println(" 땡!");
    }
    // insert here - i는 얼마? j 는 얼마일까요?
    // System.out.println(i);
    // System.out.println(j);
  }
}
// 스위치문 - 조건문 if 문 <-> 스위치문 (더 직관적인 코드 작성 시 사용)
// break; 없으면 계속 진행