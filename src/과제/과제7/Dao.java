package 과제.과제7;

import 과제.과제6.Member;

import java.util.Scanner;

public class Dao {
    static Member[] members = new Member[100];
    //1. 회원가입 함수
    static boolean sign(){
        boolean result=true;
        Scanner scanner=new Scanner(System.in);
        System.out.print("아이디 :");
        String id = scanner.next();
        System.out.print("비밀번호 :");
        String pw =scanner.next();
        System.out.print("이름 :");
        String name = scanner.next();
        System.out.print("전화번호 :");
        String phone =scanner.next();
        System.out.print("나이 :");
        String age = scanner.next();

        for(int i=0; i<members.length;i++){//아이디 중복검사
            if(members[i]!=null) {
                if (members[i].getId().equals(id)) {
                    result= false;
                }
            }
        }
        Member member=new Member(id,pw,name,phone,age);
        if(result) {//아이디 중복 통과하면 배열에 저장
            for (int i = 0; i < members.length; i++) {
                if (members[i] == null) {
                    members[i] = member;
                    break;
                }
            }
        }
        return result;
    }//-----------------------------------
    //2. 로그인 함수
    public static boolean login(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("아이디 :");
        String id = scanner.next();
        System.out.print("비밀번호 :");
        String pw =scanner.next();

        for(int i=0; i<members.length;i++){
            if (members[i] != null) {
                if (members[i].getId().equals(id) && members[i].getPw().equals(pw)) {
                    return true;
                }
            }
        }
        return false;
    }//----------------------------------
    //3. 아이디 찾기
    public static String idFind(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("이름 :");
        String name = scanner.next();
        System.out.print("전화번호 :");
        String phone =scanner.next();

        for(int i=0; i<members.length;i++){
            if (members[i] != null) {
                if(members[i].getName().equals(name)&&members[i].getPhone().equals(phone)){
                    return members[i].getId();
                }
            }

        }
        return null;
    }//----------------------------------
    //4. 비번 찾기
    public static String pwFind(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("아이디 :");
        String id = scanner.next();
        System.out.print("전화번호 :");
        String phone =scanner.next();

        for(int i=0; i<members.length;i++){
            if (members[i] != null) {
                if (members[i].getId().equals(id) && members[i].getPhone().equals(phone)) {
                    return members[i].getPw();
                }
            }
        }
        return null;
    }

}
