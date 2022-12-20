package dev_java.week3.tables;

public class StringCopy {
  public static void main(String[] args) {
    String str = "Hellow";
    String str1 = "Hellow";
    System.out.println(str == str1); // 주소번지가 같니?
    System.out.println(str.equals(str1));// 주소번지가 가리키는 값이 같니?

    String str2 = new String("hello");
    String str3 = new String("hello");
    System.out.println(str2 == str3); // 주소번지가 같니?
    System.out.println(str2.equals(str3)); // 주소번지가 가리키즞 값이 같니?

  }

}
