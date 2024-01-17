package day12.view;

import day12.controller.MemberController;
import day12.model.MemberDao;
import day12.model.MemberDto;

//VIEW : 화면구현 (입출력)
public class MemberView {

    //싱글톤
    private MemberView(){}
    private static MemberView memberView=new MemberView();
    public static MemberView getInstance(){return memberView;}

    //1. 회원가입 메소드
    public void signup(){
        System.out.println("[1]MemberView.signup");
        //MainView.getInstance() : 싱글톤(미리 만들어진 단 하나의 객체) 호출
        //1. 입력받는다
        System.out.println("아이디 :");
        String id = MainView.getInstance().scanner.next();
        System.out.println("비밀번호 :");
        String pw = MainView.getInstance().scanner.next();
        System.out.println("이름 :");
        String name = MainView.getInstance().scanner.next();
        System.out.println("전화번호 :");
        String phone = MainView.getInstance().scanner.next();

        //2. 객체화
        MemberDto memberDto=new MemberDto(0,id,pw,name,phone);

        //3. 객체를 컨트롤에게 전달(매개변수/회원가입 필요한 정보,객체) 후 처리 결과(리턴) 받기
            //처리결과 (리턴/회원가입 처리결과(t성공/f실패),boolean) 받기
        boolean result= MemberController.getInstance().signup(memberDto);
        System.out.println("[5]result = " + result);
        //4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("안내] 회원가입 성공");
        }else {
            System.out.println("안내] 회원가입 실패");
        }

    }

    //2. 로그인 메소드 (로그인: 데이터 비교하는 작업
    public void login(){
        System.out.println("[1]MemberView.login");
        //1. 입력받기
        System.out.print("아이디 : ");
        String id = MainView.getInstance().scanner.next();
        System.out.print("비밀번호 : ");
        String pw = MainView.getInstance().scanner.next();

        //2. 객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);

        //3. 컨트롤에게 (로그인에 필요한 정보)전달 하고 결과(boolean) 받기
        boolean result=MemberController.getInstance().login(memberDto);
        System.out.println("[5]result = " + result);

        if(result){
            System.out.println("로그인 성공");
            //로그인 성공시 사용할 서비스의 view로 이동.
        }else {
            System.out.println("로그인 실패");
        }
    }

    public void idFind(){
        System.out.println("이름 : ");
        String name = MainView.getInstance().scanner.next();

        System.out.println("전화번호: ");
        String phone = MainView.getInstance().scanner.next();

        MemberDto memberDto = new MemberDto();
        memberDto.setName(name);
        memberDto.setPhone(phone);

        String result=MemberController.getInstance().idFind(memberDto);
        System.out.println("[5]result = " + result);

        if(result!=null){
            System.out.println("아이디 : "+result);
            //로그인 성공시 사용할 서비스의 view로 이동.
        }else {
            System.out.println("이름과 전화번호가 일치하지 않습니다.");
        }
    }

    public void pwFind(){
        System.out.println("아이디: ");
        String id = MainView.getInstance().scanner.next();
        System.out.println("전화번호: ");
        String phone = MainView.getInstance().scanner.next();

        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPhone(phone);

        String result=MemberController.getInstance().pwFind(memberDto);
        System.out.println("[5]result = " + result);

        if(result!=null){
            System.out.println("임시비밀번호 : "+result);
            //로그인 성공시 사용할 서비스의 view로 이동.
        }else {
            System.out.println("아이디와 전화번호가 일치하지 않습니다.");
        }
    }
}
