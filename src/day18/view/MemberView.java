package day18.view;

import day18.controller.MemberController;
import day18.model.dto.MemberDto;

import java.util.Scanner;

public class MemberView {
    private MemberView(){};
    private static MemberView memberView=new MemberView();
    public static MemberView getInstance(){return memberView;}

    //입력객체
    Scanner scanner = new Scanner(System.in);

    //회원가입
    public void signup(){
        //입력받기
        System.out.print("아이디 :");
        String id = scanner.next();
        System.out.print("비밀번호 :");
        String pw = scanner.next();
        System.out.print("전화번호 :");
        String phone = scanner.next();
        //2. 객체화
        MemberDto memberDto=new MemberDto(0,id,pw,phone,null);

        //3. 컨트롤러에게 전달 후 결과
        int result = MemberController.getInstance().signup(memberDto);
        //4. 결과에 따른 출력
        if(result==0){
            System.out.println("<안내> 회원가입 성공");
        } else if (result==1) {
            System.out.println("<안내> 시스템 내부 오류 관리자에게 문의");
        }else if (result==2) {
            System.out.println("<안내> 사용중인 아이디");
        }  /*else if (result==3) {
            System.out.println("<안내> ");
        }*/
    }

    public void login(){
        //1. 입력받기
        System.out.print("아이디 :");
        String id = scanner.next();
        System.out.print("비밀번호 :");
        String pw = scanner.next();

        //2. 객체화
        MemberDto memberDto=new MemberDto();
        memberDto.setMid(id);
        memberDto.setMpw(pw);
        //3. 전달 후 결과
        boolean result = MemberController.getInstance().login(memberDto);
        //4. 결과 출력
        if(result){
            System.out.println("<안내> 로그인 성공");
            BoardView.getInstance().run();
            //게시판 화면으로 이동할 예정 <페이지 전환>
        }else {
            System.out.println("<안내> 로그인 실패");
        }

    }



}


