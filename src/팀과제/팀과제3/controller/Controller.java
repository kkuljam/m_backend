package 팀과제.팀과제3.controller;

import day12.controller.MemberController;
import 팀과제.팀과제3.model.Dao;
import 팀과제.팀과제3.model.Dto;

public class Controller {
    private Controller(){}
    private static Controller controller = new Controller();
    public static Controller getInstance(){ return controller; }

    //1.계좌생성 메소드
    public String 계좌생성(Dto dto){
        //1.유효성검사
        //2.dao에게 값을 받기
        Dao dao = new Dao();
        String result = Dao.계좌생성(dto);
        //3.결과값 리턴
        return result;
    }

    //2.예금 메소드
    public static int 예금(Dto dto){

        //1.dao에게 값 받기
        Dao dao = new Dao();
        String 계좌번호 = dto.get계좌번호();

        //2.유효성 검사
        int result=0;
        if(계좌번호.length()==16){
           return result = Dao.예금(dto);
        }else {
            return 0;
        }

    }

    //3.출금 메소드
    public static int 출금(Dto dto){

        //1.dao에게 값 받기
        Dao dao = new Dao();
        String 계좌번호 = dto.get계좌번호();

        //2.유효성 검사
        int result=0;
        if(계좌번호.length()==16){
            return result = Dao.출금(dto);
        }else {
            return 0;
        }

    }

}
