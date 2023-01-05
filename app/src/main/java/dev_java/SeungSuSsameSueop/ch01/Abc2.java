package dev_java.SeungSuSsameSueop.ch01;

public class Abc2 {
  void methodA(int i, int j) {
    j = ++i;
    System.out.println(i + "," + j);

  }

  public static void main(String[] args) {
    Abc2 abc2 = new Abc2();
    abc2.methodA(1, 2);
    int i = 1;
    int j = ++i;
    // int j = i++;

    // for (int j = 0; j < 11; j = ++i)

    System.out.println(i + "," + j);
  }
}
