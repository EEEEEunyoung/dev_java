package dev_java.ch01;

class B1 {
  XXXXXX
  int i = 1;

  class B2 {
    void methodA() {
      XX.i = 2;
    }

public class StaticExam5 {
  public static void main(String[] args) {
     B2 b2 = new B2();
     b2.methodA();
     System.out.println(B1.i);// 1출력
  }
}