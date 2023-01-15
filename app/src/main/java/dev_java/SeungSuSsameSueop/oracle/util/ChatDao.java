package dev_java.SeungSuSsameSueop.oracle.util;

import java.rmi.server.SocketSecurityException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

//클래스 설계에 있어서 DAO 패턴의 사용은 필수가 되었다. 
//특히나 MyBatis와같은 ORM 솔루션이 제공되면서 더 강조되었다. 
//JDBC API -> MyBatis -> JPA(Hibernate)-쿼리문이 없다.(추상적이다. 조인관계는 어떡하지)
//-쿼리문이 없다. (추상적이다. 조인관계는 어떡하지)
public class ChatDao {
  Connection con = null; // 인터페이스 - 비벼지는 부분들
  CallableStatement cstmt = null;
  // DBConnectionMgr dbMGR = new DBConnectionMgr();
  DBConnectionMgr dbMGR = new DBConnectionMgr("kiwi", "tiger");

  public String login(String mem_id, String mem_pw) {
    String mem_name = null;
    try {
      con = dbMGR.getConnection(); // 물리적으로 떨어져있는 오라클 서버와 연결통로 확보
      // con = dbMGR.getConnection("kiwi","tiger"); // 물리적으로 떨어져있는 오라클 서버와 연결통로 확보
      cstmt = con.prepareCall("{call proc_login(?,?,?)}");
      cstmt.setString(1, mem_id);
      cstmt.setString(2, mem_pw);
      cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
      cstmt.executeUpdate();
      mem_name = cstmt.getString(3);
      System.out.println(mem_name);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return mem_name;
    // return "회원가입했던 너의 이름";
  }

  public static void main(String[] args) {
    ChatDao cd = new ChatDao();
    String r_name = cd.login("kiwi", "123");
    System.out.println(r_name);
  }
}
