package dev_java.SeungSuSsameSueop.ch3;

public class Q54 {
   public void testIFA() {
      if (testIfB("true")) {
         System.out.println("True");
      } else {
         System.out.println("Not true");
      }
   }

   public Boolean testIfB(String str) {
      return Boolean.valueOf(str);

   }

   public static void main(String[] args) {
      Q54 q = new Q54();
      q.testIFA();
   }

}
