package dev_java.SeungSuSsameSueop.oracle.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev_java.SeungSuSsameSueop.week4.DeptVO;

public class DeptList {
  Connection con = null;
  java.sql.PreparedStatement pstmt = null;
  java.sql.ResultSet rs = null;
  DBConnectionMgr dbMgr = new DBConnectionMgr();

  public List<DeptVO> getDeptList() {
    con = dbMgr.getConnection();
    String sql = "select to_char(sysdate,'HH24:MI:SS') as currentTime from dual";
    List<DeptVO> deptList = new ArrayList<>();
    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();// 오라클 서버에게 처리를 요청함.
      DeptVO dVO = null;

      while (rs.next()) {
        dVO = DeptVO.builder().deptno(rs.getInt("deptno")).dname(rs.getString("dname")).loc(rs.getString("loc"))
            .build();
        deptList.add(dVO);
        // } catch (SQLException e){

      }
    } // try, while
    catch (Exception e) {
      e.printStackTrace();
      System.out.println(e.toString());

    } // catch
    return deptList;

  } // getDeptList

  public static void main(String[] args) {
    DeptList deptList = new DeptList();
    List<DeptVO> list = null;
    list = deptList.getDeptList();
    for (int i = 0; i < list.size(); i++) {
      DeptVO rdVO = list.get(i);
      System.out.println(rdVO.getDeptno() + "," + rdVO.getDname() + "," + rdVO.getLoc());
    }
  } // main
}
