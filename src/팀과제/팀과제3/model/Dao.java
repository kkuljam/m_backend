package 과제.팀과제3.model;

import java.util.AbstractList;
import java.util.ArrayList;

public class Dao {

    private Dao(){}

    private static Dao dao = new Dao();

    public static Dao getInstance(){ return dao; }

    ArrayList<Dto> dtos = new AbstractList<>();

// =================================================================================
    // 1. 계좌생성 메소드
    public String 계좌생성(Dto dto){
        System.out.println("[3] Dao.계좌생성");

        dtos.add(dto);
        String result ="";
        for (int i = 0; i < 16; i++) {
            result+=Integer.toString((int)(Math.random()*10));
        }


        return result;
    }
// =================================================================================
    // 2. 예금 메소드

    public int 예금(Dto dto){
        int result = 0;
        System.out.println("[3] Dao.예금");
        for (int i = 0; i < dtos.size(); i++) {
            if (dtos.get(i).get계좌번호().equals(dto.get계좌번호() ) ) {
                    result += dtos.get(i).get급액();
                    return result;

            }
        }return 0;
    }

// ===================================================================================
    // 3. 출금 메소드
    public int 출금(Dto dto){
        System.out.println("[3] Dao.출금");
        for (int i = 0; i < dtos.size(); i++) {
            if (dtos.get(i).get계좌번호().equals(dto.get계좌번호() ) ){
                result -= dtos.get(i).get급액();
                return result;
            }
        }

    }







}
