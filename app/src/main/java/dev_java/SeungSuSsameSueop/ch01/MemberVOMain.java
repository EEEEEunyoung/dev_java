package dev_java.SeungSuSsameSueop.ch01;

public class MemberVOMain {
  public static void main(String[] args) {
    MemberVO memberVO = new MemberVO();
    String 사용자가입력한아이디 = "tomato";
    String 비밀번호 = "111111";

    System.out.println(사용자가입력한아이디);
    System.out.println(비밀번호);

    // MemberVO클래스에서 mem_id는 접근제한자를 private했으므로
    // 외부에서 접근이 불가하다.
    // 그래서 setter메소드를 제공하고 있다.
    // private 으로 선언된 변수는 클래스 외부에서 사용기불가함 - 보안 - 캡슐화
    // memberVO.mem_id = "tomato"

    memberVO.setMem_id("tomato");
    memberVO.setMem_pw("111111");

    // String mem_id = memberVO.setMem_id();
    // System.out.println(id); // tomato

    System.out.println(memberVO.getMem_id()); // tomato
    // mem_name의 경우 접근제한자를 public으로 했으므로 직접 초기화가 가능하다.
    //memverVO.mem_name = "tomato";
    //String name = memberVO.mem_name;//null
    //sysout(name);//토마토 출력
    //sysout(memberVO.mem_name()):/토마토 출력
    memverVO.setMem_name(mem_name:"이순신")//setter메소드를 호출하는 것만으로 초기화됨
    System.out.println(memberVO.getMem_name()); //이순신 출력
    //아래와 같이 setter 메소드를 호출하면 전역변수인 mem_pw에 123이 초기화 됨
    //getter 메소드를 호출하면 전변인 mem_pw에 저장된 값이 출력됨
    //만일 27번 즉 setter메소드를 호출하지 않으면 null 출력될 것임. - 주의할 것.

  }
}
