package dev_java.SeungSuSsameSueop.ch02;

import javax.swing.event.SwingPropertyChangeSupport;

public class Shuffle {
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    int imsi = 0;
    imsi = a;
    a = b;
    b = imsi;
    System.out.println("a:" + a + ",b:" + b);
  }
}
/*
 * List<String> list = Arrays.asList("A", "B", "C", "D");
 * System.out.println("List before Shuffle : "+list);
 * Collections.shuffle(list);
 * System.out.println("List after shuffle : "+list);
 */