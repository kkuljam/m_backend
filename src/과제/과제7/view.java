package 과제.과제7;

import java.util.Scanner;

public class view {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    while(true) {

        System.out.println("\n\n--------- 회원 시스템 ---------");
        System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
        int ch = sc.nextInt();
        boolean result1;
        String result2;
        if( ch == 1 ) {

            result1=sign();
            if(result1) {
                System.out.println("회원가입 성공");
            }else {
                System.out.println("중복된 아이디입니다.");
            }
        }
        else if( ch == 2 ) {
            result1=login();
            if(result1) {
                System.out.println("로그인 성공");
            }else {
                System.out.println("로그인 실패");
            }
        }
        else if( ch == 3 ) {

            result2=idFind();
            if(result2!=null) {
                System.out.println("아이디 : "+result2);
            }else {
                System.out.println("정보를 찾을 수 없습니다.");
            }
        }
        else if( ch == 4 ) {
            result2=pwFind();
            if(result2!=null) {
                System.out.println("비밀번호 : "+result2);
            }else {
                System.out.println("정보를 찾을 수 없습니다.");
            }
        }

    } // w e
} // m e
}
