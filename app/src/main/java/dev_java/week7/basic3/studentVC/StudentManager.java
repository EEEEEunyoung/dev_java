package dev_java.week7.basic3.studentVC;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//개발 방법 론에서 디자인 패턴 중 MVC패턴을 알아보자
//M: 모델계층 (XXXLogic.java + XXX)  =>  서비스 계층 - 비즈니스 로직(업무)계층
// XXXDao가 있고 없고는 MVC패턴에 영향이 없다. 
//다만 오라클 서버와 연계에 반복되는 코드를 줄여주고 오픈소스나 라이브러리
//(iBatis, MyBatis(반자동:"주"), Hibernate 완전자동 - SQL 문이 없다. )를 조립하기 위한
//클래스 쪼개기(생성자) - POJO(pure) -> SPRING(maven) -> Spring boot(Gradle) - 완결편
//요구사항으로 만들어 사용하는 클래스임. 
//C: 컨트롤계층
//V: 뷰계층
//프레임워크를 왜 원하는가? - 실력차이 줄여야함.
//틀이 정해짐 - 클래스 선언, 메소드 선언(단 파라미터타입과 갯수는 너가 결정)
//개발자는 비즈니스 로직에만 집중해라.
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentManager extends JFrame implements ActionListener{
    JButton btn_sel = new JButton("조회");  //SELECT 문 
    JButton btn_ins = new JButton("입력");  // INSERT 문
    JButton btn_upd = new JButton("수정");  // UPDATE문
    JButton btn_del = new JButton("삭제");  //DELETE문
    JPanel jp_north = new JPanel();
    JPanel jp_center = new JPanel();  //아직 안붙임
    JTextField jtf_search = new JTextField("ㅎㅇㅎㅇㅎㅇㅎㅇ");

    public StudentManager(){}
    public void initDisplay(){
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("시스템");
        add(jp_north);
        jp_north.add(jtf_search); jp_north.add(btn_sel); jp_north.add(btn_ins);  jp_north.add(btn_upd); jp_north.add(btn_del);  

    }

    
public static void main(String[] args) {
    StudentManager bm = new StudentManager();
    bm.initDisplay();
    }
@Override
public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();  
    if(obj == btn_sel){           

    }else if(obj == btn_ins){
        
    } else if(obj == btn_upd){
        
    } else if(obj == btn_del){
        
    }



    }
}



