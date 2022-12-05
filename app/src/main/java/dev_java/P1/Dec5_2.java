package dev_java.P1;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Dec5_2 {

  public static void main(String[] args) {
    int i = 1;
    int j = 2;
    if ((i == --j) || (++i <= j)) {

      System.out.println("조건을 만족 할 때");
      System.out.println(i + ", " + j);

    } else {
      System.out.println("조건을 만족하지 않았을 떄");
    }
  }
}