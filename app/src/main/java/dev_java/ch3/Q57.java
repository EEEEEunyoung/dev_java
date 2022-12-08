package dev_java.ch3;

public class Q57 {
   public static void main(String[] args) {
      int i = 10;
      int j = 2;
      j = 0; // 에러
      j = 5;
      try {
         System.out.println(i / j); // 5

      } catch (ArithmeticException e) {
         System.out.println(e.getMessage()); // 에러메세지 보는법
      } finally {
         System.out.println("finally 는 무조건 실행이 된다");

      }

   }

}
