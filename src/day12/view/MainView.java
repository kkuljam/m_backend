package day12.view;

import java.util.Scanner;

//view : 화면 구현
public class MainView {
    /*
        싱글톤: 프로그램내 하나의 객체를 사용 패턴

        1. 생성자 private
        2. 필드에 객체를 생성한다. private static
        3. 객체를 외부로부터 전하기 위한 함수 getInstance()
     */
    private MainView(){}
    private static MainView mainView =new MainView();
    public static MainView getInstance(){return mainView;}






    //멤버
    //1. 필드
    Scanner scanner = new Scanner(System.in);
        //필드랑 지역변수 차이
    //2. 생성자
    //3. 메소드

    public void run(){
         while (true){
             System.out.println("===메인 페이지====");
             System.out.println("1.회원가입 2.로그인");
             System.out.println("선택>");
             int ch = scanner.nextInt();

             if(ch==1){}
             else if(ch==2){}
         }
    }
}
