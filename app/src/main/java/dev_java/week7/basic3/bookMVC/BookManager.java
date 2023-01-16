package dev_java.week7.basic3.bookMVC;
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

public class BookManager extends JFrame implements ActionListener{
    //선언
    JButton btn_sel = new JButton("조회");  //SELECT 문 
    JButton btn_ins = new JButton("입력");  // INSERT 문
    JButton btn_upd = new JButton("수정");  // UPDATE문
    JButton btn_del = new JButton("삭제");  //DELETE문
    JButton btn_board = new JButton("게시판");  
    JPanel jp_north = new JPanel();
    String gubun = "bookMgr";   //도서 CRUD이면 bookMgr을, 게시판 CRUD이면 boardMgr을 디폴트로 설정

    //생성자 (cons)
    public BookManager(){
        //initDisplay() -> 속지(JPnel, JScrollPane-)로 사용되는 페이지일때
        //요청에 따른 페이지 갱신처리, 화면갱신, 화면초기화 
        //그러나 스레드 구현시에는 이슈가 발생하니까 주의해야함.
        //문법에러 - 쉬움
        //논리에러 - 트러블슈팅
    }

    
    //화면 
    public void initDisplay(){
        btn_sel.addActionListener(this); btn_ins.addActionListener(this); btn_upd.addActionListener(this); btn_del.addActionListener(this); btn_board.addActionListener(this);
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("도서관리시스템 Ver1.0");
        add(jp_north);
        jp_north.add(btn_sel); jp_north.add(btn_ins);  jp_north.add(btn_upd); jp_north.add(btn_del); jp_north.add(btn_board); 

    }

    
public static void main(String[] args) {
    BookManager bm = new BookManager();
    //메인스레드와 Runnable을 통해서 구현하는 스레드를 분리할 수 있는 경우에 사용함 
    //메인스레드와 자기자신이 run 구현체 클래스 역할을 병행하는 컨셉일 때
    // 지연발생 - 화면이 안떠. 소켓 accept가 안일어남
    bm.initDisplay();   //리팩토링 - 
    }

@Override    //왜 재정의? 아이폰, 갤럭시, 아이패드 장치가 결정되지 않아서. 
public void actionPerformed(ActionEvent e) {   //콜백함수 - 웹, 앱개발, 하이브리드 다 중요
    Object obj = e.getSource();   //액션이벤트 단 버튼 클릭시, 이벤트를 JVM이 감지, actionPerformed 메소드 알아서 호출해줌.
        BoardController boardc = null;
        BookController bookc = null;


    //아님 게시판 CRUD 처리 할까???
    if(obj==btn_board){
        gubun="boardMgr";
        if("boardMgr".equals(gubun)){
            boardc = (BoardController)FrontController.getController(gubun);
            System.out.println("게시판  =>"+ boardc);
                

            //게시판 컨트롤러가 결정되면 다시 디폴트값으로 초기화. 
        gubun="bookMgr";   
    
        }
    }
    //너 도서CRUD 처리 할거니????
    if("bookMgr".equals(gubun)){
        System.out.println("도서관리 선택");
        bookc = (BookController)FrontController.getController(gubun);   //???????????
        System.out.println("도서관리  =>"+ bookc);

        if(obj == btn_sel){           
            System.out.println("조회했지렁");

        }else if(obj == btn_ins){
            System.out.println("입력눌렸지렁");
            
        } else if(obj == btn_upd){
            System.out.println("수정정정정");
            
        } else if(obj == btn_del){
            System.out.println("탈퇴합니당");
            
    }
    
    
    //if문은 무조건 조건을 따짐, else if문은 앞조건을 수렵하면 뒤에 있는 코드는 실행기회를 갖지 않는다. 

    }


    //여기로


}
}



