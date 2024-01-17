package day12.controller;

import day12.model.MemberDao;
import day12.model.MemberDto;


// CONTROLLER : VIEW 와 DAO 중계역할
public class MemberController {

    //싱글톤
    private MemberController(){}
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;}

    //회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("[2]MemberController.signup");
        //1. 유효성검사 처리
        //2. view 받은 객체를 DAO 에게 전달 후 처리 결과를 받기
        boolean result = MemberDao.getInstance().signup(memberDto);
        System.out.println("[4]result = " + result);
        //컨트롤 처리
        return result;
    }

    //+ 로그인 했다는 증거. - 로그아웃을 하기전까지. [(회원번호 또는 )아이디]
    String loginSession = null; // null 이면 비로그인 null 대신에 아이디가 있으면 로그인된 상태

    //2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[2]MemberController.login");

        boolean result= MemberDao.getInstance().login(memberDto);
        System.out.println("[4]result = " + result);
        //+ 만약에 로긍니 성공시 로그인상태 변경
        if(result){
            //로그인상태 필드에 로그인 성공한 아이디를 대입한다.
            loginSession = memberDto.getId();
        }
        return result;
    }

    //3. 아이디 찾기
    public String idFind(MemberDto memberDto){
        System.out.println("[2]MemberController.idFind");

        String result=MemberDao.getInstance().idFind(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }

    public String pwFind(MemberDto memberDto){
        System.out.println("[2]MemberController.idFind");

        String result=MemberDao.getInstance().pwFind(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }

}
