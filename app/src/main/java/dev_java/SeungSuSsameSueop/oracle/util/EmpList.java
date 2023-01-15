package dev_java.SeungSuSsameSueop.oracle.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import dev_java.SeungSuSsameSueop.oracle.util.DBConnectionMgr;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleType;
import oracle.jdbc.OracleTypes;

//클래스 설계에 있어서 DAO 패턴의 사용은 필수가 되었다. 
//특히나 MyBatis와같은 ORM 솔루션이 제공되면서 더 강조되었다. 
//JDBC API -> MyBatis -> JPA(Hibernate)-쿼리문이 없다.(추상적이다. 조인관계는 어떡하지)
//-쿼리문이 없다. (추상적이다. 조인관계는 어떡하지)
public class EmpList {
  Connection con = null; // 인터페이스 - 비벼지는 부분들
  CallableStatement cstmt = null;
  OracleCallableStatement ocstmt = null;
  ResultSet rs = null; // 오라클 커서를 조작하는데 필요한 추상메소드가짐.
  DBConnectionMgr dbMGR = new DBConnectionMgr();
  // DBConnectionMgr dbMGR = new DBConnectionMgr("kiwi", "tiger");

  public List<Map<String, Object>> getEmpList() {
    List<Map<String, Object>> list = new ArrayList<>();
    // insert here - 구글링한 소스를 어디에 붗여야 하나? 기준, 선택할 수 있다. - API보고 실습코드 적용
    try {
      // con = dbMGR.getConnection(); // 물리적으로 떨어져있는 오라클 서버와 연결통로 확보
      con = dbMGR.getConnection("scott", "tiger"); // 물리적으로 떨어져있는 오라클 서버와 연결통로 확보
      cstmt = con.prepareCall("{call proc_login(?,?,?)}");
      cstmt.registerOutParameter(1, OracleTypes.CURSOR);
      cstmt.execute();
      // 굳이 추가로 제공되는 클래스로 치환하는 것은 ResultSet을 주입받는 메소드 호출이 필요함.
      // CallableStatement 에서는 getCursor()를 지원하지 않기 때문에 굳이 형 전환을 하였다.
      ocstmt = (OracleCallableStatement) cstmt;
      rs = ocstmt.getCursor(1);
      Map<String, Object> rmap = null; // 게으른 인스턴스화
      while (rs.next()) {
        rmap = new HashMap<>();
        rmap.put("empno", rs.getInt(1));
        rmap.put("deptno", rs.getInt(2));
        rmap.put("ename", rs.getInt(3));
        // List에 Map 추가하기
        // List에 튜플추가
        // Map에는 컬럼추가
        list.add(rmap);
      }
      // System.out.println(mem_name);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }
  // 프로시저 안에서는 여러가지의 DML문을 한 번 서버에 접속한 상태에서
  // 한 번에 처리 가능
  // commit, rollback 가능함
  // 자바로 꺼내서 처리하지 않고, 프로시저 내부에서 비즈니스로직(업무포함 프로세스)
  // 처리기능 - 변수활용과 제어문사용
  // 프로시저 내부에서 자바의 힘을 빌리지 않고도 처리할 수 있는 프로세스들이 있다. - 강점, 시스템부하 줄임

  public static void main(String[] args) {
    EmpList eList = new EmpList();
    List<Map<String, Object>> list = eList.getEmpList();
    System.out.println(list);
  }
}
