package dev_java.EunYoung.pppp.Eunyoung;

public class jan {

  public void eleven() {

    for (int i = 1; i < 4; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }

  public static void main(String[] args) {
    jan j = new jan();
    j.eleven();

  }
}
