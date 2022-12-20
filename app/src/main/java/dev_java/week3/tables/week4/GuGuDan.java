package dev_java.week3.tables.week4;

import com.google.gson.internal.sql.SqlTypesSupport;

public class GuGuDan {
  static void gugu() {
    int i;
    int j;
    int gugugu;
    for (i = 1; i < 10; i++) {
      for (j = 1; j < 10; j++) {
        gugugu = i * j;
        System.out.println(i + " X " + j + "=" + gugugu);

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    gugu();
  } // main
} // cls
