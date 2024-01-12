package day09;

public class Calculator {
    //클래스멤버
        //1. 필드
        //2. 생성자
        //3. 메소드
            //1. 리턴타입
            //2. 함수명
            //3. (매개변수,매개변수)
            //4. { 명령문 ;}
            //5. return : (void 일 경우) 생략가능
                //void : return 값
    int b;
    //1. 매개변수:x 리턴:x
    void powerOn(){//m s
        //1. void : 메소드가 호출한 곳으로 전달하는 결과값이 없다.
        //2. 'powerOn' : 함수명이고 소문자 시작 카멜표기법 권장
        //3. ( ) : 메소드를 호출할 때 전달한 매가값을 받기 위한 곳
        //4. { } : 메소드가 실행되는 구역
        //5. return : 생략
        System.out.println("전원을 켭니다.");
    }//m e

    //2.
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    //3. 매개변수:2개 , 리턴:int
    int plus(int x, int y){
        //1. int : 메소드가 호출한 곳으로 전달하는 결과 값의 타입이 int 뜻
        //-
        //3. (int x, int y) : 메소드를 호출할 때 전달한 매개값을 x, y를 받았다.
        //4.-
        //5. void를 제외한 함수내 return 무조건 1개이상 필수
        int result = x+y;
        return result;
    }

    //4. 매개변수:2개 , 리턴:double
    double divide(int x,int y){
        double result = (double) x/(double) y;
        return result; // return: 함수를 종료하는 키워드 vs break : 가장 가가운 반복문 종료
    }
    String ch (){ //겜 연습해봄
        String story="옛날에 소녀가 살았습니다.";
        String result= story;
        if (b==1){
            String story1="소녀는 고등학생.";

            return result+story1;
        }
        if (b==2){
            String story2="소녀는 대학생.";
            b=7;
            System.out.println(this.b);
            return result+story2;

        }

        return result;
    }
}











