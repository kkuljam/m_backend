package day03;

import java.util.Objects;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
/*
//        문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
        int x=scanner.nextInt();
        System.out.println((x % 2 == 0)? "X":"0");

//        문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.println((x % 7==0 && x % 2 == 0)? "0":"X");
//        문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.println((x % 11==0 || x % 2 == 0)? "0":"X");
//        문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
        System.out.println("a 입력");     int a =scanner.nextInt();
        System.out.println("b 입력");     int b =scanner.nextInt();
        System.out.println(a<b ? b:a);

//        문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
//           계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
        System.out.println("반지름 입력:"); int r =scanner.nextInt();
        double m = r*r*3.14;
        System.out.printf("%.2f",m);

//        문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
//        예) 54.5   84.3 실수 2개입력시 결과는   64.285714%



//         문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
//         계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
        System.out.println("a 입력");     double a =scanner.nextDouble();
        System.out.println("b 입력");     double b =scanner.nextDouble();
        System.out.println("h 입력");     double h =scanner.nextDouble();

        System.out.printf("%.1f",(a+b)*h/2);

//        문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
//                계산식) 표준체중 계산식 = > (키 - 100) * 0.9
        System.out.println("a 입력");     int cm =scanner.nextInt();
        System.out.println("표준체중:"+(int)((cm-100)*0.9));

//        문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
//        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
        System.out.println("키 입력");     double cm =scanner.nextDouble();
        System.out.println("몸무게 입력");     double kg =scanner.nextDouble();
        System.out.printf("BMI:%.2f",kg/((cm / 100) * (cm / 100)));

//        문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
//                계산식) 1 inch -> 2.54cm


//        문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
//        계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

//        문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
//        int x = 10;
//        int y = x-- + 5 + --x; 처음 x는 후감이라 10 넘어가면서 9됨 두번재 x는 선감소해야해서 8
//        printf(" x의 값 : %d , y의값 :  %d ", x, y)

//        문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
        System.out.println("나이: "); int age = scanner.nextInt();
        System.out.println(age>=40 ? "중년": age>=20 ? "성인": age>=10? "학생":"아이");

//        문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
        System.out.println("국어 점수:"); double 국어=scanner.nextDouble();
        System.out.println("수학 점수:"); double 수학 =scanner.nextDouble();
        System.out.println("영어 점수:"); double 영어 =scanner.nextDouble();
        double 총점 =국어+수학+영어
        System.out.printf("총점: %.0f, 평균: %.2f",총점,총점/3);
*/
//        문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
        System.out.println("아이디 입력:");  String 아이디 = scanner.next();
        System.out.println("비밀번호 입력:");  String 비밀번호 = scanner.next();
        System.out.println(아이디.equals("admin") && 비밀번호.equals("1234") ? "로그인 성공":"로그인 실패");

//        문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력



    }
}
