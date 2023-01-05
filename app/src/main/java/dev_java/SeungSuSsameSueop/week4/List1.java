package dev_java.SeungSuSsameSueop.week4;

import java.util.ArrayList;
//자바에서 제공하는 자료구조는 java.util폴더에 있다. 
import java.util.List;
import java.util.Vector;

public class List1 {
  public static void main(String[] args) {
    // 아래는 생성부에 인터페이스가 와서 에러임 - 구현체 클래스 (벡터나 어레이리스트 - 한쪽은 )
    // 왜 벡터인가? -DefaultTableModel객체에 데이터 셋을 추가하는 메소드를 제공하니까.
    List<String> nameList = new Vector<>(); // 멀티스레드에 안전-속도느림-안전하다.
    // List<String> nameList2 = new ArrayList<>();//싱글스레드 안전-속도빠름-안전하지않다.
    System.out.println(nameList.size()); // 00
    boolean isOK = nameList.add("이순신");
    nameList.add("강감찬");
    nameList.add("세종대왕");
    nameList.add("아아");
    nameList.add("아아");
    System.out.println(nameList.size());
    System.out.println(isOK);

  }

}
