package dev_java.pppp;

//while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 
//아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성하시오. 

public class pppp2 {

  public static void main(String[] args) {
    while (true) {
      int 눈1 = (int) (Math.random() * 6) + 1;
      int 눈2 = (int) (Math.random() * 6) + 1;

      if (눈1 + 눈2 == 5) {
        System.out.printf("(%d, %d)", 눈1, 눈2);
        break;
      }
      System.out.printf("(%d, %d)\n", 눈1, 눈2);
    }

  }

}