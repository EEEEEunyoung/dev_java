package dev_java.SeungSuSsameSueop.ch01;

public class WhileTest_2 {
  public void account() {
    int i = 1;
    int hap = 0;
    while (i < 6) {
      hap = hap + i;
      System.out.println("i : " + i);
      System.out.println("hap : " + hap);
      i++;
    }
    System.out.println("1부터 5  까지의합은 " + hap);
  }

  public static void main(String[] args) {
    WhileTest_2 w = new WhileTest_2();
    w.account();
  }
}