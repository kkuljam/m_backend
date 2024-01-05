package day04;

import java.util.Scanner;

//131 무한루프 활용
public class Step3 {// c s
    public static void main(String[] args) {// m s
        Scanner scanner = new Scanner(System.in); // 입력 객체

        boolean run = true; // 무한루프의 상태를 저장하고 있는 변수 [on/off]
        int speed = 0; //현재 속도를 저장하고 있는 변수 [1 입력하면 1증가, 2입력하면 1감소]

        while (run){//무한루프 시작
            //======무한 반복 출력==============
            System.out.println("------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지"); //메뉴판
            System.out.println("------------------");
            System.out.println("선택: ");
            //================================
            //============무한 반복 입력=======
            String strNum = scanner.nextLine(); // 엔터를 입력할 때 까지 'console이 대기'상태로 됨
            //==========================

            //==========입력 값에 따른 경우의 수 판단====
            if(strNum.equals("1")) {//만약에 입력받은 값(문자열) 문자 1이면 [문자 비교시 equals()]
                speed++;
                System.out.println("speed =" + speed);
            } else if (strNum.equals("2")) {//만약에 입력받은 값(문자열) 문자 2이면
                speed--;
                System.out.println("speed =" + speed);
            } else if (strNum.equals("3")) {//만약에 입력받은 값(문자열) 문자 3이면
                //1.while  다시 이동 false 이므로 {} 나가기
                run = false;
                //2. 가장 가까운 반복문{} 나가기
                break; // 가장 가까운 반복문 탈출 키워드;
                //3. 현재 함수 종료
                //return;
            }// if e

        }//무한루프 끝

    }// m e
}// c e

/*
    무한루프 = 무한반복
        1. while(true){}
        2.
            boolean run = true;
            while(run) {}
 */
