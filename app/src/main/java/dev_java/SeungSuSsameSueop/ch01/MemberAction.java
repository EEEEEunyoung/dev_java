package dev_java.SeungSuSsameSueop.ch01;

public class MemberAction {
  // 회원가입을 처리하는 메소드 선언하기 (회원가입 성공시 2, 실패시 0반환)
  public int memberInsert(String mem_id, String mem_pw, String mem_name){
    System.out.println("memberInsert 호출 - 파라미터 3개");
    System.out.println(mem)id","+mem_pw+"."+mem_name);
    int result = -1;
    //회원가입에 성공했니?
    if(1==1){
      result= 1;
    } else{
      result=0;
    }
    return result;
  }

  public int memberInsert(MemberVO memberVO){
    System.out.println("memberInsert 호출 - 파라미터 1개");
    System.out.println(memberVO.getMem_id()+
                  ","+memberVO.getMem_pw()+
                  "."memberVO.getMem_name());
    int result = -1;  //End of file
    result = 1;
    return result;
  }

  public static void main(String[] args) {
//INSERT HERE - memberinsert 메소드 호출하시오.
MemberAction memberAction = new MemberAction();
int result == memberAction.memverInsert("apple", "123", "사과");
if(result==1){
  System.out.println("회원가입 성공하였습니다.");
} else {
  System.out.println("회원가입 실패하였습니다.");
}

memberVO memberVO = new MemberVO();
MemberVO.setMem_id(mem_id "tomato");
MemberVO.setMem_pw(mem_pw "456");
MemberVO.setMem_name(mem_name "토마토");
int result2 = memberAction.memberInsert(memberVO);
if (result2 ==1 ) {
System.out.println("회원가입 성공하였습니다.");
} else {
  System.out.println(회원가입 실패하였습니다.);
}
  }
