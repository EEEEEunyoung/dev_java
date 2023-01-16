package dev_java.week7.basic3.bookMVC;

import lombok.Data;

@Data    //게터세터 대신 롬복 처리
public class Book_BoardVO {
  private int b_no;                      
  private String b_title;    
  private String b_content;  
  private int b_hit;      
  private int mem_no;       
}
