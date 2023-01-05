package dev_java.Semi;

import java.util.ArrayList;
import java.sql.*;

public class SearchDataList {

  Connection conn = null;

  ResultSet rs = null;

  Statement st = null;

  int stmt = 0;

  public SearchDataList() {

    try {

      conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/memberinfo?serverTimezone=UTC", "root",

          "비밀번호");

    } catch (Exception e) {

      e.printStackTrace();

    }

  }

  // 회원 추가

  public void insertMember(SearchFirst first) {

    try {

      st = conn.createStatement();

      stmt = st.executeUpdate(

          "insert into member values ('" + first.name + "', '" + first.iden + "', '" + first.pwd + "');");

    } catch (SQLException e) {

      e.printStackTrace();

    } finally {

      try {

        st.close();

      } catch (SQLException e) {

        e.printStackTrace();

      }

    }

  }

  // 회원 목록 출력

  public ArrayList<SearchFirst> readMember() {

    ArrayList<SearchFirst> arr = new ArrayList<SearchFirst>();

    System.out.println(arr);

    try {

      st = conn.createStatement();

      rs = st.executeQuery("select * from member;");

      while (rs.next()) {

        arr.add(new SearchFirst(rs.getString(1), rs.getString(2), rs.getString(3)));

      }

    } catch (SQLException e) {

      e.printStackTrace();

    } finally {

      try {

        st.close();

      } catch (Exception e) {

        e.printStackTrace();

      }

    }

    return arr;

  }

  // 회원수정

  public void updateMember(String name, String pwd) {

    try {

      st = conn.createStatement();

      stmt = st

          .executeUpdate("update member set tel = '" + pwd + "' where name = '" + name + "';");

    } catch (SQLException e) {

      e.printStackTrace();

    } finally {

      try {

        st.close();

      } catch (Exception e) {

        e.printStackTrace();

      }

    }

  }

  // 회원삭제

  public void deleteMember(String name) {

    try {

      st = conn.createStatement();

      stmt = st.executeUpdate("delete from member where name = '" + name + "';");

    } catch (SQLException e) {

      e.printStackTrace();

    } finally {

      try {

        st.close();

      } catch (Exception e) {

        e.printStackTrace();

      }

    }

  }

  // 회원 검색

  public ArrayList<SearchFirst> searchMember(String content) {

    ArrayList<SearchFirst> arr = new ArrayList<SearchFirst>();

    System.out.println(arr);

    try {

      st = conn.createStatement();

      rs = st.executeQuery("select * from member where name like '%" + content + "%';");

      while (rs.next()) {

        arr.add(new SearchFirst(rs.getString(1), rs.getString(2), rs.getString(3)));

      }

    } catch (SQLException e) {

      e.printStackTrace();

    } finally {

      try {

        st.close();

      } catch (Exception e) {

        e.printStackTrace();

      }

    }

    return arr;

  }

}