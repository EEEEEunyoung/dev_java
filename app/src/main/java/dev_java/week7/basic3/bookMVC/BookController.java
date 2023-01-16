package dev_java.week7.basic3.bookMVC;
//이게 POJO ........  3번 MVC 패턴  공부할거라고함....

import java.util.List;
import java.util.Map;

public class BookController extends FrontController{
//public class BookController implements Controller{
    //BookLogic bookLogic = new BookLogic();
    //원래는 BookLogic 클래스를 객체 주입해야 하지만, 업무적인 depth 가 
    //얕아서 로직클래스에서 선택 경정에 따른 추가 적인 프로세스가 전혀 없는 상태임.
    //따라서 컨트롤러 클래스와 Dao 클래스 사이에 연결만 담당하니까 의미 없어서 사용x. 
    BookDao bookDao = new BookDao();



    //조회
    //VO랑 MAP 사용 두가지 있음. 맵이 어려우니 맵으로....
public List<Map<String, Object>> getBookList(String cols, String keyword){
    System.out.println("도서목록조회");
    List<Map<String,Object>> bList = null;
    bList = bookDao.getBookList(cols, keyword);

    return bList;
}

    //입력
public int bookInsert(BookVO bkVO){
    System.out.println("도서정보 등록");
    int result = 0;
    result = bookDao.bookInsert(bkVO);   //
    return result;
}

    //수정
    public int bookUpdate(BookVO bkVO){
        System.out.println("도서정보 등록");
        int result = 0;
    result = bookDao.bookUpdate(bkVO);   //

        return result;
    }

    //삭제
    //쿼리문을 보고 리턴타입과 파라미터 타입 및 갯수 결정하는데 참고 
    //DELETE FROM book WHERE bk_no=5;
    //리턴타입 int -    1이면 삭제성공,  0이면 삭제 실패 
    //파라미터 타입 int - 도서번호 
    public int bookDelete(int bk_no){
        System.out.println("도서정보 삭제");
        int result = 0;
    result = bookDao.bookDelete(bk_no);   //

        return result;



/* 
    @Override
    public FrontController getController(String gubun) {
        // TODO Auto-generated method stub
        return null;
    }
   */ 
}
}




/*
 * SQL응용 - 
 * JAVA 와 오라클 연동(연계)하기
 * JDBC API(원시적인) - MyBatis(반자동): 중심 Hibernate : 독
 */