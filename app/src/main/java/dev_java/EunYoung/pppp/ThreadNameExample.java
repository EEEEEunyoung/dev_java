package dev_java.EunYoung.pppp;

public class ThreadNameExample {
  public static void main(String[] args) {
    Thread th = Thread.currentThread();
    System.out.println("프로그램 시작 스레드 이름:" + th.getName());

    Thread thA = new ThreadA();
    System.out.println("ThreadA 생성를 생성한 스레드:" + Thread.currentThread().getName());
    thA.start();

    Thread thB = new ThreadB();
    System.out.println("ThreadB 생성를 생성한 스레드:" + Thread.currentThread().getName());

    thB.start();
  }

}
