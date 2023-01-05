package dev_java.SeungSuSsameSueop.week5.exam1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class IOExam {
  public void output() {
    FileWriter fw = null;

    try {

      fw = new FileWriter("test.txt", true);
      fw.write(97);
      fw.write(65);
      fw.close();

    } catch (FileNotFoundException e) {
      System.out.println("기존 파일이 없음");
      e.printStackTrace();
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    IOExam io = new IOExam();
    io.output();

  };
}

// text.txt - 객체화 해주는 클래스가 있다.
// 메소드 호출이 가능함.
// 꼴랑 파일만 객체화 해줌
// File f = new File("test.txt");
// 기존 파일이 없음
//
