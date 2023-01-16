package dev_java.week7.basic3.bookMVC;

public class FrontController {
    public static Object getController(String gubun){
        Object obj = null;   //BookController or BoardController 가 담겨야 함 

        if("bookMgr".equals(gubun)){
            obj = new BookController();

        }else if("boardMgr".equals(gubun)){
            obj = new BoardController();

        }
        return obj;
    }
}
