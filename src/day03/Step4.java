package day03;

import java.util.Scanner;

public class Step4 {//c s
    public static void main(String[] args) {//m s
        Scanner scanner = new Scanner(System.in);
            //!!! : Scanner 클래스 입력시 [라이브러리->호출]
                //자동완성시 자동으로 클래스 위에 import java.util.Scanner; 확인
                //직접입력시 직접 클래스 위에 import java.util.Scanner; 작성
        //if 조건문
        //1.
        System.out.println("정수 입력:");   int point = scanner.nextInt();
        if(point >=80){ //만약 내가 입력한 값이 저장된 변수가 80보다 이상이면 (true)출력문 실행 (false)아니면 실행 안된다
            System.out.println("입력받은 값은 80이상입니다.");        };

        //2.
        //만약 내가 입력한 값이 저장된 변수가 90보다 이상이면 (true) 합격출력 아니면(false) 불합격출력
        if(point>=90){
            System.out.println("합격");
        }else {
            System.out.println("불합격");
        }

        //3. 다수조건 : {}는 무조건 한번 실행
        if(point>=90){
            System.out.println("A");
        } else if (point>=80) {
            System.out.println("B");
        } else if (point>=70) {
            System.out.println("C");
        }else {
            System.out.println("탈락");
        }
            //vs
        // : {} 는 조건 충족에 따라 여러번 실행 될 수 있다.
        if (point>=90) {System.out.println("A");}
        if (point>=80) {System.out.println("B");}
        if (point>=70) {System.out.println("C");}

        //4. 중첩 조건
        char sex = 'M';
        if(sex=='M' || sex=='m'){//만약에 성별이 m(남자)이면
            if(point>90){
                System.out.println("남자 우수상");
            }
        }else{// 아니고 w(여자)이면
            if(point>=90){
                System.out.println("여자 우수상");
            }
        }

        //예시) 스위치 변수 활용 (on/off, 참/거짓, true/false)
        String id = scanner.next();
        String pw = scanner.next();
        // .equals() : 문자열 비교 메소드 지원, 문자열.equals(비교할문자열) => 결과 같으면 true, 다르면 false

        boolean sw = false;
        if(id.equals("admin")&& pw.equals("1234")){sw = true;}

        if(sw){
            System.out.println("로그인성공");
        }else {
            System.out.println("로그인실패");
        }
    }//m e
}// c e

/*
    if문 [조건문]
        -경우의 수(조건) 따른 실행 흐름 제어
        -조건 : boolean
            - if(true), if(false)
            - boolean 변수 = true; if(변수)
            - if(3>5) , if(3>1 && 3<10)
            - int 변수 = 10; if(변수 - 10>5)
            - if(함수()) / 함수() return 값이 boolean

        -삼항연산자 : 간단한 조건식 vs 조건문if : 일반적으로 사용
            1. 삼항연산자 단점: 조건이 길어지면 읽기 어려움.
        -형태
            1. 단일 조건의 참 만 있을경우
                if( 조건 ) { (참true) 선언문; 실행문; }

            2. 단일 조건의 참/거짓이 있을경우
                if( 조건 ) { (참true) 선언문; 실행문; }
                else{  (거짓false) 선언문; 실행문;}

            3. 다수 조건
                - 하나의 { } 실행 : if ~ else if ~ else if 하나의 조건문으로 취급 [ 다수조건에 따른 결과 1개 ]
                if( 조건1 ) { (참true1) 선언문; 실행문; }
                else if( 조건2 ) { (참true2) 선언문; 실행문; }
                else if( 조건3 ) { (참true3) 선언문; 실행문; }
                else { (거짓false) 선언문; 실행문; }
                    // vs
                - 여러개의 { } 실행 : if{} if{} if{} : 여러개의 조건문으로 취급 [ 다수조건에 따른 결과 여러 개 ]
                if( 조건1 ) { (참true1) 선언문; 실행문; }
                if( 조건2 ) { (참true2) 선언문; 실행문; }
                if( 조건3 ) { (참true3) 선언문; 실행문; }

            4. 중첩
                if( 조건1 ) {
                    if( 조건1 t -> 조건2 ) { }
                    else{ }
                }else{
                    if( 조건1 f -> 조건2 ) { }
                    else { }
                }
*/
