package dev_java.SeungSuSsameSueop.ch01;

import javax.swing.event.MenuDragMouseEvent;
import javax.swing.plaf.synth.SynthStyle;

//자료구조의 일부로 사용함
//회원정보를 관리하기 위한 목적으로 설계하였다. - 그래서 main메소드는 필요없다. 
public class MemberVO {
  private String mem_id = null;
  private String mem_pw = null;
  public String mem_name = null;

  // setter는 write, save
  // setter 메소드를 활용하여 전변 mem_id를 초기화 한다.
  public void setMem_id(String mem_id) {
    this.mem_id = mem_id;
  }

  // getter는 read, 듣기
  public String getMem_id() {
    return mem_id;
  }

  public void setMem_pw(String mem_pw) {
    this.mem_pw = mem_pw;
  }

  public String getMem_pw() {
    return mem_pw;
  }

  public static void main(String[] args) {
    MemberVO memberVO = new MemberVO();
    System.out.println(memberVO.mem_id); // mull
  };
}
