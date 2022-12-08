package dev_java.P1;

public class Quiz58 {

  public static void main(String[] args) {
    int x = 0;
    int y = 10;
    do {
      y--;
      ++x;
    } while (x < 5);
    System.out.print(x + "," + y);
  }

}
