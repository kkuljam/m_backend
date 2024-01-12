package 팀과제.미니팀과제1;

import day08.Phone;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MemberInfo []memberInfo=new MemberInfo[0];
        int count=0;
        //students = new int[Integer.parseInt(count)]; 배열 용량 늘리기
        while (true) {
            System.out.println("=======================");
            System.out.println("1.회원가입 | 2.로그인 ");
            System.out.println("=======================");

            int ch=scanner.nextInt();
            if (ch==1){// 회워가입
                count++;
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("전화번호 : ");
                String num = scanner.next();
                System.out.print("생년월일 : ");
                String birth = scanner.next();
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("패스워드 : ");
                String pw = scanner.next();
                MemberInfo memberlist = new MemberInfo(count,name,id,pw,num,birth);
                memberInfo=new MemberInfo[count];

                for( int i = 0 ; i<memberInfo.length ; i++ ){
                        memberInfo[i] = memberlist;
                }
            }//회원가입 끝

            if (ch == 2) {//로그인 시작
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("패스워드 : ");
                String pw = scanner.next();

                for (int i = 0; i < memberInfo.length; i++) {
                    if (memberInfo[i] != null) {
                        if (! id.equals(memberInfo[i].id) && pw.equals(memberInfo[i].pw)) {
                            System.out.println("정보가 틀립니다.");
                        }
                        System.out.println("로그인 성공");
                        break;
                    }
                }

            }//로그인 끝

        }


















    }
}
