package dev_java.EunYoung.test1208;

class Calculator {
  int left, right;

  public void setOprands(int left, int right) {
    this.left = left;
    this.right = right;

  }

  public void sum(this.left+this.right){
    System.out.println();
  }

  public void avg(this.left+this.right){
  }

}

  public class CalculatorDemo4 {
      public static void main(String[] args) {
        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
      }
      
      
      }
