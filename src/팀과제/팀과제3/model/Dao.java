package 팀과제.팀과제3.model;

import 팀과제.팀과제3.model.신한;

import java.util.AbstractList;
import java.util.ArrayList;

public class Dao {





    static ArrayList<Dto> dtos = new ArrayList<>();

// =================================================================================
    // 1. 계좌생성 메소드
    public static String 계좌생성(Dto dto){
        System.out.println("[3] Dao.계좌생성");
        String result ="";
        for (int i = 0; i < 14; i++) {
            result+=Integer.toString((int)(Math.random()*10));
        }
        Dto 신한;
        Dto 국민;
        Dto 농협;
        if (dto.계좌번호.equals("1")){
            String 신한은행="1"+"-"+result;
            신한=new 신한(신한은행, 0,dto.계좌주);
            dtos.add(신한);
            return 신한은행;
        } else if (dto.계좌번호.equals("2")){
            String 국민은행="2"+"-"+result;
            국민=new 국민(국민은행, 0,dto.계좌주);
            dtos.add(국민);
            return 국민은행;
        } else  if (dto.계좌번호.equals("3")){
            String 농협은행="3"+"-"+result;
            농협=new 농협(농협은행, 0,dto.계좌주);
            dtos.add(농협);
            return 농협은행;
        }
        return "은행선택이 잘못되었습니다.";
    }
// =================================================================================
    // 2. 예금 메소드

    public static int 예금(Dto dto){
        int result = 0;
        System.out.println("[3] Dao.예금");
        for (int i = 0; i < dtos.size(); i++) {
            if (dtos.get(i).get계좌번호().equals(dto.get계좌번호() ) ) {
                    result += dtos.get(i).get입금액()+dto.입금액;
                    dtos.get(i).set입금액(result);
                    return result;

            }
        }return 0;
    }

// ===================================================================================
    // 3. 출금 메소드
    public static int 출금(Dto dto){
        System.out.println("[3] Dao.출금");
        int result=0;
        for (int i = 0; i < dtos.size(); i++) {
            if (dtos.get(i).get계좌번호().equals(dto.get계좌번호() ) ){
                result = dtos.get(i).get입금액()-dto.입금액;
                return result;
            }
        }return 0;
    }
}








