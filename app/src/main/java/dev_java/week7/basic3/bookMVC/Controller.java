package dev_java.week7.basic3.bookMVC;

public interface Controller {
    //단독 인스턴스화 불가, 반드시 구현체 클래스 필요 
    // abstract 추상은 생성자 가질 수 있음. 
    // 인터페이스는 추상메소드만 가질 수 있다. 일반 메소드 못가짐 , 생성자도 불가, 일반 전변 불가 
    public abstract FrontController getController(String gubun);
    
    
}
