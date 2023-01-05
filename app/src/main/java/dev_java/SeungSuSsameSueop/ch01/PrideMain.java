package dev_java.SeungSuSsameSueop.ch01;

public class PrideMain {
  public static void main(String[] args) {
    Pride myCar = new Pride();
    Pride herCar = new Pride();
    // insert here -
    myCar = herCar;

    System.out.println(myCar == herCar);
  }
}
