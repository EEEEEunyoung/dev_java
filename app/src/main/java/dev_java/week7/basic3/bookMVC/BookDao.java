package dev_java.week7.basic3.bookMVC;

import java.util.List;
import java.util.Map;

public class BookDao {
/*도서정보 삭제 구현
 * @param bk_no
 * @return 1이면 삭제 성공 0이면 삭제 실패 
 * 
 */

    public int bookDelete(int bk_no){
        System.out.println("bookDelete호출 (사용자가 선택한 도서번호--->" + bk_no);
        int result = 0;
        //insert  here

        return result;
    } //end of bookDelete

       //  도서정보 수정 
       //bkVO   return 1 성공 0 실패
    public int bookUpdate(BookVO bkVO){
        int result = 0;
        //롬복 어노테이션 @data 를 사용했기에 getter/ setter 메소드는 없지만 사용 가능함 
        //단 VO타입이므로 전변에 담긴 값을 출력하려면 getter 메소드 호출함
        //전역변수는 캡슐화로 인해 직접 접근 불가하고 위변조로 인한 피해로부터 보호위해 
        //접근 제한자는 반드시 private으로 할것
        
        

        System.out.println("bookUpdate호출 (사용자가  선택한 도서번호-주소번지출력됨--->" + bkVO);
        //insert  here

        return result;
    }//end of bookUpdate

     //도서정보  입력하기 
    public int bookInsert(BookVO bkVO){
        int result = 0;
        System.out.println("bookInsert호출 (사용자가  선택한 도서정보-주소번지출력됨--->" + bkVO);
        //insert  here
        
        return result;
    }   //end of bookInsert



    /*********************************************************************
     * 도서목록조회
     * SELECT bk_no, bk_title FROM book
     * WHERE bk_TITLE(?)=?
     * WHERE bk_author(?)=?
     * WHERE bk_info(?)=?
     * @param cols   컬럼명 bk_titme or bk_author or bk_info
     * @param keyword 텍스트필드에 사용자가 입력한 값이 담기는 자리 
     * @return 검색 결과 n개 로우   리턴타입에 대해서는 List<Map<>> 이런 형태 
     * 조인이 필수적인 경우에는 반드시 List<Map>형태가 유리하고 
     * 그렇지 않은 경우, List<~VO>형태가 별 차이가 없다.   
     * 단 조회 결과로 얻은 정보를 자바코드에서 연산을 해야하는 경우라면
     * 제네릭 타입으로 Map 보다는 XXXVO가 유리하다. 
     * Map 이면 리턴값이 무조건 Object이다. ClassCastingException 
     * int i = integer.parseInt(pMap.get("bk_no").toString())
     * int i = xxxVO.getBkno();
     ************************************************************************/

     // 조회 
    public List<Map<String, Object>> getBookList(String cols, String keyword) {
        return null;
    }








//  ??  public List<Map<String, Object>> getBookList(String cols, String keyword) {
//  ??      return null;
//  ??    }
    
}
