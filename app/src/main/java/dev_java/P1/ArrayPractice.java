package dev_java.P1;

//3가지 숫자 채번
public class ArrayPractice {

  public int[] getRandomNumber() {
    int[] com = new int[3];

    for (int i = 0; i < com.length; i++) {
      com[i] = (int) (Math.random() * 9) + 1;
      System.out.println(com[i]);
    }
    return com;
  }

  public static void main(String[] args) {
    ArrayPractice arr = new ArrayPractice();
    arr.getRandomNumber();
  }

}