package dev_java.EunYoung.P1.D221226;

public class GetSetThread {
  public static void main(String[] args) {
    Thread mainThread = Thread.currentThread();
    System.out.println("프로그램 시작 스레드 이름:" + mainThread.getName());

    Thread threadA = Thread.currentThread();
    System.out.println("작업 스레드 이름:" + threadA.getName());

    Thread threadB = Thread.currentThread();
    System.out.println("프로그램 작업 스레드 이름:" + threadB.getName());

  }

}
