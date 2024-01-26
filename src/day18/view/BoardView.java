package day18.view;

import day18.controller.MemberController;

import java.util.Scanner;

public class BoardView {
    private BoardView(){};
    private static BoardView boardView=new BoardView();
    public static BoardView getInstance(){return boardView;}

    Scanner scanner=new Scanner(System.in);

    public void run(){
        while (true){
            System.out.println("========ezen 게시판============");
            BBoardView.getInstance().boardlist();
            System.out.println("1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("선택>");
            int ch=scanner.nextInt();

            if(ch==1){
                BBoardView.getInstance().write();
            } else if (ch==2) {

            } else if (ch==3) {
                MemberController.getInstance().logout(); //로그아웃 처리 요청
                return;
            }
        }
    }


}
