package day09;

import java.util.Scanner;

public class Step1 {
    //JS 코드를 읽어 주는 역할 : HTML(JS) <--브라우저(프로그램[스레드])
    //JAVA 코드를 읽어 주는 역할 : main함수() <-- main스레드
    public static void main(String[] args) {
        //231
            //!!!! .필드/메소드를 사용하기 위해서는 꼭!! 객체가 필요하다.
            //Calculator.powerOn();
        //1. 객체 생성(생성자)
            //new Calculator();
        Calculator myCalc = new Calculator();
        //2. 객체내 멤버(필드.메소드) 호출
        //myCalc.powerOn();
            //*
        new Calculator().powerOn();

        //3. 메소드 호출하고 매개변수 전달
            //-매개변수 타입과 개수에 맞게 제공한다.
        myCalc.plus(5,6);//이러면 저장할 곳이 없어서 쓸 수 없음
        //myCalc.plus("오","육"); 타입 불일치
            //-리턴값이 있는 경우에는 변수에 저장
        int result = myCalc.plus(5,6); // int result에 저장해서 쓰는 거임
        System.out.println("result ="+result);
        //4.
        int x=10;
        int y=4;
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 ="+result2);

        //5.
        myCalc.powerOff();

        //6. 겜 연습해봄
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 or 2\n번호를 입력하세요");
        int a=scanner.nextInt();
        myCalc.b=a;
        String result3= myCalc.ch();
        System.out.println(result3);


    }
}
