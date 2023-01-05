package dev_java.SeungSuSsameSueop.oracle.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
  Map<String, Object> rMap = new HashMap<>();

  public void setMap() {
    rMap.put("deptno", 10);
    rMap.put("dname", "인사부");
    rMap.put("loc", "제주");
    rMap.put("loc", "부산");
  }

  public static void main(String[] args) {
    MapTest1 mt1 = new MapTest1();
    mt1.setMap();
    System.out.println(mt1.rMap.size()); // 0, 윗줄 추가하면 3 됨
    Set<String> set = mt1.rMap.keySet();
    // Set인터페이스가 제공하는 메소드 중에서 toArray()지원함
    Object obj[] = set.toArray();
    for (int i = 0; i < obj.length; i++) { // obj.length는 배열의 원소 수 - 3개
      String key = (String) obj[i]; // 배열에서 꺼낸 값은 key 값이다. - deptno, dname, log
      System.out.println("key : " + key); // 3번 출력
    }
    Iterator<String> iter = set.iterator();
    while (iter.hasNext()) { // 자료구조안에 값이 있는지 체크해서 있으면 true를 반환하고, 없으면 false 를 반환한다.
      String key = iter.next();
      Object value = mt1.rMap.get(key);
      System.out.println(key + ":" + value);
    }
  }

}
