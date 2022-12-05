package dev_java.P1;

public class Quiz3_2 {
  void methodA() {
    for (int i = 1; i < 101; i++) {
      switch (i % 35) {
        case 0:
          System.out.println("fizzbuzz");
          break;
        case 5:
        case 10:
        case 15:
        case 20:
        case 25:
        case 30:
          System.out.println("fizz");
          break;
        case 7:
        case 14:
        case 21:
        case 28:
        case 35:
        case 42:
          System.out.println("buzz");
          break;
        default:
          System.out.println(i);
      } // end of switch
    } // end of for
  }
}
// end of methodA