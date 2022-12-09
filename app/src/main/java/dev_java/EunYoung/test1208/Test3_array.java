package dev_java.EunYoung.test1208;

public class Test3_array {
  public static void main(String[] args) {
    int[] arr = new int[4];

    for (int i = 0; i < arr.length; i++) {
      arr[i] += (10 + i); /// arr[i] = arr[i] + (10+i)
      System.out.println(arr[i]);

    }
  }
}

// 마지막 자리가 n-1 /왜터졌는지 - index 값이 잘못 됨. ArrayIndexOutOfBoundsException
// 왜 발생했는지 적고, 얼마가 들어있는지 쓰기