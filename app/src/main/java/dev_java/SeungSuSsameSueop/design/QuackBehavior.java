package dev_java.SeungSuSsameSueop.design;
//단독으로 인스턴스화 불가함 - 구현체 클래스가 있어야함 

//QuackBehavior qb = new MuteQuack();
//QuackBehavior qb = new Quack();
//QuackBehavior qb = new Squeak();

public interface QuackBehavior {
	// public QuackBehavior(){}
	// 메소드 선언시 추상 클래스와는 다르게 abstrack 예약어를 생략할 수 있다.
	// 왜냐하면 인터페이스는 추상만 가능해서.
	public abstract void quack();
}