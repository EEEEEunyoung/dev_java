package dev_java.week4;

//변수앞에 final 붙으면 상수 

/*while */
public class Money {
  public static final String UNIT = "원";
  private int money;

  public Money(int money) { // 인스턴스화 - 생성자 호출
    this.money = money;

  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public static String getUnit() {
    return UNIT;
  }

  public void print() {
    System.out.println(money + UNIT + "이 있습니다. ");
  }
}
