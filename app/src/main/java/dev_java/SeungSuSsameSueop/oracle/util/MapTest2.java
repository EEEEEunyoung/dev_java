package dev_java.SeungSuSsameSueop.oracle.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {
  List<Map<String, Object>> list = new ArrayList<>();
  Map<String, Object> rMap = new HashMap<>();

  public void setMap() {
    rMap.put("deptno", 10);
    rMap.put("dname", "인사부");
    rMap.put("loc", "서울");
    list.add(rMap);// list.get(0)
    rMap.put("deptno", 20);
    rMap.put("dname", "개발부");
    rMap.put("loc", "부산");
    list.add(rMap);// list.get(1)
    rMap.put("deptno", 30);
    rMap.put("dname", "총무부");
    rMap.put("loc", "제주"); // 마지막 것만 남는다.
    list.add(rMap);// list.get(2)

  }

  public void mapPrint() {
    // 각 로우안에 key가 세개있다. (칼럽-deptno, dname, loc)
    // Map m1 = get(0), Map m2 = get(1), Map m3 = get(2)
    for (int i = 0; i < list.size(); i++) { // 반복해서 처리할 것은 로우값이다. get(0),get(1),get(2)
      Map<String, Object> m1 = list.get(i);
      // 컴럼의 수를 반복해서 출력하기
      Object[] keys = m1.keySet().toArray();
      for (int j = 0; j < keys.length; j++) {
        String key = (String) keys[j];
        System.out.print(m1.get(key));

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    MapTest2 mt1 = new MapTest2();
    mt1.mapPrint();
    /*
     * mt1.setMap();
     * // Map의 siza는 세로방향이다. 컬럼의 수이다.
     * System.out.println(mt1.rMap.size()); // 0, 윗줄 추가하면 3 됨
     * Set<String> set = mt1.rMap.keySet();
     * // Set인터페이스가 제공하는 메소드 중에서 toArray()지원함
     * Object obj[] = set.toArray();
     * for (int i = 0; i < obj.length; i++) { // obj.length는 배열의 원소 수 - 3개
     * String key = (String) obj[i]; // 배열에서 꺼낸 값은 key 값이다. - deptno, dname, log
     * System.out.println("key : " + key); // 3번 출력
     * }
     * Iterator<String> iter = set.iterator();
     * while (iter.hasNext()) { // 자료구조안에 값이 있는지 체크해서 있으면 true를 반환하고, 없으면 false 를
     * 반환한다.
     * String key = iter.next();
     * Object value = mt1.rMap.get(key);
     * System.out.println(key + ":" + value);
     * }
     */
  }

}
