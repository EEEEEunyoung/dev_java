package dev_java.EunYoung.test1208;

public class Test3_1_array {
  int[] arr = { 0, 0, 0, 0 };
  {
    for (int i = 0; i < arr.length; i++) {
      try {
        arr[i] += (10 + i); /// arr[i] = arr[i] + (10+i)
        System.out.println(arr[i]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.toString());
      } // try
    } // for
    System.out.println("여기..");
  }

  public static void main(String[] args) {
    Test3_1_array t3 = new t3();
    t3.메소드이름();

  }
}

// 마지막 자리가 n-1 /왜터졌는지 - index 값이 잘못 됨. ArrayIndexOutOfBoundsException
// 왜 발생했는지 적고, 얼마가 들어있는지 쓰기